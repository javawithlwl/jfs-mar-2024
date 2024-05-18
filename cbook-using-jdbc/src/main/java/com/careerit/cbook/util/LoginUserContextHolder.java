package com.careerit.cbook.util;

import com.careerit.cbook.domain.UserDetails;

public final class LoginUserContextHolder {

  private static UserDetails userDetails = null;
  public static void setLoginUser(UserDetails loginUser) {
    userDetails = loginUser;
  }
  public static UserDetails getUserDetails(){
        return userDetails;
  }

}
