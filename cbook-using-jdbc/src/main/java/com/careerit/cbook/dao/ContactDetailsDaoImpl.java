package com.careerit.cbook.dao;

import com.careerit.cbook.domain.ContactDetails;
import com.careerit.cbook.util.ConnectionUtil;
import com.careerit.cbook.util.LoginUserContextHolder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactDetailsDaoImpl implements ContactDetailsDao {

  private static final String ADD_CONTACT = "insert into contact_details(id,name,email,mobile,user_id) values(?,?,?,?,?)";
  private static final String GET_ALL_CONTACTS = "select id,name,email,mobile,user_id from contact_details where user_id = ?";
  @Override
  public ContactDetails addContact(ContactDetails contactDetails) {
    Connection con = null;
    PreparedStatement st = null;
    try {
      UUID userId = LoginUserContextHolder.getUserDetails().getId();
      con = ConnectionUtil.getConnection();
      UUID id = UUID.randomUUID();
      st = con.prepareStatement(ADD_CONTACT);
      st.setObject(1, id);
      st.setString(2, contactDetails.getName());
      st.setString(3, contactDetails.getEmail());
      st.setString(4, contactDetails.getMobile());
      st.setObject(5, userId);
      int count = st.executeUpdate();
      if (count == 1) {
        contactDetails.setId(id);
        contactDetails.setUserId(userId);
        return contactDetails;
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(con, st);
    }
    return null;
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
  public List<ContactDetails> search(String str) {
    return null;
  }

  @Override
  public List<ContactDetails> getAllContacts() {
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    List<ContactDetails> contactDetailsList = new ArrayList<>();
    try {
      UUID userId = LoginUserContextHolder.getUserDetails().getId();
      con = ConnectionUtil.getConnection();
      st = con.prepareStatement(GET_ALL_CONTACTS);
      st.setObject(1, userId);
      rs = st.executeQuery();
      while (rs.next()) {
        ContactDetails contactDetails = new ContactDetails();
        contactDetails.setId(UUID.fromString(rs.getString("id")));
        contactDetails.setName(rs.getString("name"));
        contactDetails.setEmail(rs.getString("email"));
        contactDetails.setMobile(rs.getString("mobile"));
        contactDetails.setUserId(UUID.fromString(rs.getString("user_id")));
        contactDetailsList.add(contactDetails);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(con, st, rs);
    }
    return contactDetailsList;
  }
}
