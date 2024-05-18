package com.careerit.cbook.service;

import com.careerit.cbook.domain.UserDetails;

public interface UserDetailsService {

        UserDetails register(UserDetails userDetails);
        UserDetails login(String email,String password);
}
