package com.careerit.cbook.dao;

import com.careerit.cbook.domain.ContactDetails;
import com.careerit.cbook.domain.UserDetails;

import java.util.List;
import java.util.Optional;

public interface UserDetailsDao {

  UserDetails register(UserDetails userDetails);

  UserDetails login(String email, String password);


  Optional<UserDetails> findByEmailOrMobile(String email, String mobile);
}
