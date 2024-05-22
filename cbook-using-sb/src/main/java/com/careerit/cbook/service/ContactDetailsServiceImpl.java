package com.careerit.cbook.service;

import com.careerit.cbook.dao.ContactDetailsDao;
import com.careerit.cbook.domain.ContactDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ContactDetailsServiceImpl implements ContactDetailsService{

  private final ContactDetailsDao contactDetailsDao;
  @Override
  public List<ContactDetails> getAllContacts() {
    List<ContactDetails> contactDetails = contactDetailsDao.selectAllContacts();
    log.info("Total contacts found : {}", contactDetails.size());
    return contactDetails;
  }
}
