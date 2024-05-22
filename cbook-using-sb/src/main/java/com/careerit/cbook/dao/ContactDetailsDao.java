package com.careerit.cbook.dao;

import com.careerit.cbook.domain.ContactDetails;

import java.util.List;

public interface ContactDetailsDao {
    ContactDetails insertContact(ContactDetails contactDetails);
    ContactDetails updateMobile(String mobile,String contactId);
    boolean deleteContact(String contactId);
    ContactDetails selectContact(String contactId);
    List<ContactDetails> search(String str);
    List<ContactDetails> selectAllContacts();
}
