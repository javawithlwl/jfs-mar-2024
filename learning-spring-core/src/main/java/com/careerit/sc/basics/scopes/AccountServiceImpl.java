package com.careerit.sc.basics.scopes;

import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
  @Override
  public String getAccountInfo(long id) {
    return "Account number: "+id+" balance: 1000";
  }
}
