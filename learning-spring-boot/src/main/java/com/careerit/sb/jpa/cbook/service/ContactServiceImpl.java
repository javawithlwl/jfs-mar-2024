package com.careerit.sb.jpa.cbook.service;

import com.careerit.sb.jpa.cbook.domain.Contact;
import com.careerit.sb.jpa.cbook.repo.ContactRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {


  private final ContactRepository contactRepository;

  @Override
  public Contact createContact(Contact contact) {
    Assert.notNull(contact, "Contact can't be null");
    Contact savedContact = contactRepository.save(contact);
    log.info("Contact saved with id : {}", savedContact.getId());
    return contact;
  }

  @Override
  public Contact getContact(UUID id) {
    Assert.notNull(id, "Id can't be null");
    Optional<Contact> optionalContact = contactRepository.findById(id);
    return optionalContact.orElseThrow(() -> new ContactNotFoundException("Contact with id : " + id + " not found"));
  }

  @Override
  public Contact updateContact(Contact contact) {
    Assert.notNull(contact, "Contact can't be null");
    Assert.notNull(contact.getId(), "Id can't be null");
    if (contactRepository.existsById(contact.getId())) {
      Contact updatedContact = contactRepository.save(contact);
      log.info("Contact with id : {} is updated successfully", contact.getId());
      return updatedContact;
    } else {
      throw new ContactNotFoundException("Contact with id : " + contact.getId() + " not found");
    }
  }

  @Override
  public boolean deleteContact(UUID id) {
    Assert.notNull(id, "Id can't be null");
    if (contactRepository.existsById(id)) {
      contactRepository.deleteById(id);
      log.info("Contact with id : {} deleted", id);
      return true;
    } else {
      throw new ContactNotFoundException("Contact with id : " + id + " not found");
    }
  }

  @Override
  public List<Contact> search(String name) {
    Assert.notNull(name, "Name can't be null");
    return contactRepository.search(name);
  }
}
