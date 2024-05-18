package com.careerit.cbook.service;

import com.careerit.cbook.domain.ContactDetails;

import java.util.List;

public interface ContactDetailsService {
    ContactDetails addContact(ContactDetails contactDetails);
    ContactDetails updateMobile(String mobile,String contactId);
    boolean removeContact(String contactId);
    ContactDetails getContact(String contactId);
    List<ContactDetails> getAllContacts();
    List<ContactDetails> search(String str);
}
