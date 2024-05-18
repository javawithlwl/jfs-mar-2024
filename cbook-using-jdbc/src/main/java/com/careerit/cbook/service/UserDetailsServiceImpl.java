package com.careerit.cbook.service;

import com.careerit.cbook.dao.UserDetailsDao;
import com.careerit.cbook.dao.UserDetailsDaoImpl;
import com.careerit.cbook.domain.UserDetails;
import com.careerit.cbook.exception.BadCredentialsException;
import com.careerit.cbook.exception.UserAlreadyExistsException;

public class UserDetailsServiceImpl implements UserDetailsService {

    private UserDetailsDao userDetailsDao;

    public UserDetailsServiceImpl(UserDetailsDao userDetailsDao) {
        this.userDetailsDao = userDetailsDao;
    }

    @Override
    public UserDetails register(UserDetails userDetails) {
        if(userDetails == null){
            throw new IllegalArgumentException("UserDetails is required");
        }
        if(userDetails.getEmail() == null || userDetails.getEmail().trim().isEmpty()){
            throw new IllegalArgumentException("Email is required");
        }
        if(userDetails.getPassword() == null || userDetails.getPassword().trim().isEmpty()){
            throw new IllegalArgumentException("Password is required");
        }
        if(userDetails.getMobile() == null || userDetails.getMobile().trim().isEmpty()){
            throw new IllegalArgumentException("Mobile is required");
        }
        if(userDetailsDao.findByEmailOrMobile(userDetails.getEmail(), userDetails.getMobile()).isPresent()){
            throw new UserAlreadyExistsException("User already exists with email or mobile");
        }
        return userDetailsDao.register(userDetails);
    }

    @Override
    public UserDetails login(String email, String password) {
        if(email == null || email.trim().isEmpty()){
            throw new IllegalArgumentException("Email is required");
        }
        if(password == null || password.trim().isEmpty()){
            throw new IllegalArgumentException("Password is required");
        }
        UserDetails userDetails = userDetailsDao.login(email, password);
        if(userDetails == null){
            throw new BadCredentialsException("Invalid email or password");
        }
        return userDetails;
    }
}
