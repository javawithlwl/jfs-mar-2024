package com.careerit.cbook.service;

import com.careerit.cbook.dao.ContactDetailsDao;
import com.careerit.cbook.domain.ContactDetails;

import java.util.List;

public class ContactDetailsServiceImpl implements ContactDetailsService{

  private ContactDetailsDao contactDetailsDao;

  public ContactDetailsServiceImpl(ContactDetailsDao contactDetailsDao){
    this.contactDetailsDao = contactDetailsDao;
  }

  @Override
  public ContactDetails addContact(ContactDetails contactDetails) {
    // Validation
    return contactDetailsDao.addContact(contactDetails);

  }

  @Override
  public ContactDetails updateMobile(String mobile, String contactId) {
    return null;
  }

  @Override
  public boolean removeContact(String contactId) {
    return false;
  }

  @Override
  public ContactDetails getContact(String contactId) {
    return null;
  }

  @Override
  public List<ContactDetails> getAllContacts() {
    return contactDetailsDao.getAllContacts();
  }

  @Override
  public List<ContactDetails> search(String str) {
    return null;
  }
}
