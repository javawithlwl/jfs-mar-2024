package com.careerit.sb.jpa.cbook.service;

import com.careerit.sb.jpa.cbook.domain.Contact;

import java.util.List;
import java.util.UUID;

public interface ContactService {

  Contact createContact(Contact contact);
  Contact getContact(UUID id);
  Contact updateContact(Contact contact);
  boolean deleteContact(UUID id);
  List<Contact> search(String name);

}
