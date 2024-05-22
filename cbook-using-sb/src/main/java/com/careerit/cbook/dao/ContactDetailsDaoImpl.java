package com.careerit.cbook.dao;

import com.careerit.cbook.domain.ContactDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class ContactDetailsDaoImpl implements ContactDetailsDao {


  private final JdbcTemplate jdbcTemplate;


  @Override
  public ContactDetails insertContact(ContactDetails contactDetails) {
    return null;
  }

  @Override
  public ContactDetails updateMobile(String mobile, String contactId) {
    return null;
  }

  @Override
  public boolean deleteContact(String contactId) {
    return false;
  }

  @Override
  public ContactDetails selectContact(String contactId) {
    return null;
  }

  @Override
  public List<ContactDetails> search(String str) {
    return null;
  }

  @Override
  public List<ContactDetails> selectAllContacts() {
    String query = "select id,name,email,mobile,user_id from contact_details";
    return jdbcTemplate.query(query, (rs, rowNum) -> {
      ContactDetails contactDetails = new ContactDetails();
      contactDetails.setId(UUID.fromString(rs.getString("id")));
      contactDetails.setName(rs.getString("name"));
      contactDetails.setEmail(rs.getString("email"));
      contactDetails.setMobile(rs.getString("mobile"));
      contactDetails.setUserId(UUID.fromString(rs.getString("user_id")));
      return contactDetails;
    });
  }
}
