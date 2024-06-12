package com.careerit.bookstore.auth.service;

import com.careerit.bookstore.auth.domain.AppUser;
import com.careerit.bookstore.auth.domain.UserInfoDetails;
import com.careerit.bookstore.auth.repo.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AppUserService implements UserDetailsService {

  @Autowired
  private  AppUserRepo appUserRepo;

  @Autowired
  private  PasswordEncoder encoder;
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    AppUser appUser = appUserRepo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User with username : " + username + " not found"));
    return new UserInfoDetails(appUser);
  }

  public String registerUser(AppUser userInfo) {
    userInfo.setPassword(encoder.encode(userInfo.getPassword()));
    userInfo = appUserRepo.save(userInfo);
    return "User is added successfully with id :"+userInfo.getId();
  }
}
