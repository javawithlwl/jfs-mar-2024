package com.careerit.bookstore.auth.api;

import com.careerit.bookstore.auth.common.JwtResponse;
import com.careerit.bookstore.auth.common.LoginRequest;
import com.careerit.bookstore.auth.domain.AppUser;
import com.careerit.bookstore.auth.service.AppUserService;
import com.careerit.bookstore.auth.service.JwtUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
        @Autowired
        private AppUserService userInfoService;
        @Autowired
        private AuthenticationManager authenticationManager;
        @Autowired
        private JwtUtilService jwtService;

        @PostMapping("/login")
        public ResponseEntity<JwtResponse> login(@RequestBody LoginRequest loginRequest){
            Authentication authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(),
                            loginRequest.getPassword()));
            if (authentication.isAuthenticated()) {
                String token =  jwtService.generateToken(loginRequest.getUsername());
                JwtResponse jwtResponse = JwtResponse.builder().jwtToken(token).build();
                return ResponseEntity.ok(jwtResponse);
            } else {
                throw new UsernameNotFoundException("invalid user request !");
            }
        }
        @PostMapping("/register")
        public ResponseEntity<String> register(@RequestBody AppUser userInfo){
            String message = userInfoService.registerUser(userInfo);
            return ResponseEntity.ok(message);
        }
}