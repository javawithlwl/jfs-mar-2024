package com.careerit.cbook.dao;

import com.careerit.cbook.domain.ContactDetails;

import java.util.List;

public interface ContactDetailsDao {
    ContactDetails addContact(ContactDetails contactDetails);
    ContactDetails updateMobile(String mobile,String contactId);
    boolean removeContact(String contactId);
    ContactDetails getContact(String contactId);
    List<ContactDetails> search(String str);
    List<ContactDetails> getAllContacts();
}
