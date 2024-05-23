package com.careerit.sc.basics.xmlconfig;

public class ContactServiceImpl implements ContactService {

  private ContactDao contactDao;

  public ContactServiceImpl(ContactDao contactDao) {
    this.contactDao = contactDao;
  }

  @Override
  public long getContactCount() {
    return contactDao.count();
  }

}
