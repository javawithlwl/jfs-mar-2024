package com.careerit.sc.basics.annotationconfig;

import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {


  private final  ContactDao contactDao;

  public ContactServiceImpl(ContactDao contactDao) {
    this.contactDao = contactDao;
  }


  @Override
  public long getContactCount() {
    return contactDao.count();
  }


}
