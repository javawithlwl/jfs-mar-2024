package com.careerit.cbook.dao;

import com.careerit.cbook.domain.UserDetails;
import com.careerit.commons.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;
import java.util.UUID;

public class UserDetailsDaoImpl implements UserDetailsDao {

  private static final String REGISTER_USER = """
          INSERT INTO user_details (id,email,mobile,password) VALUES (?,?,?,?);
      """;

  private static final String LOGIN_USER = """
          SELECT id,email,mobile,password FROM user_details
           WHERE (email = ? AND password = ?) or (mobile = ? AND password = ?)
      """;

  private static final String FIND_BY_EMAIL_MOBILE = """
          SELECT id,email,mobile,password FROM user_details
           WHERE email = ?  or mobile = ?
      """;


  @Override
  public UserDetails register(UserDetails userDetails) {
    Connection con = null;
    PreparedStatement st = null;
    try {
      con = ConnectionUtil.getConnection();
      st = con.prepareStatement(REGISTER_USER);
      UUID id = UUID.randomUUID();
      st.setObject(1, id);
      st.setString(2, userDetails.getEmail());
      st.setString(3, userDetails.getMobile());
      st.setString(4, userDetails.getPassword());
      int count = st.executeUpdate();
      if (count == 1) {
        userDetails.setId(id);
      }
      return userDetails;
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(con, st);
    }
    return null;
  }

  @Override
  public UserDetails login(String emailOrMobile, String password) {
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      con = ConnectionUtil.getConnection();
      st = con.prepareStatement(LOGIN_USER);
      st.setString(1, emailOrMobile);
      st.setString(2, password);
      st.setString(3, emailOrMobile);
      st.setString(4, password);
      rs = st.executeQuery();
      if (rs.next()) {
        UserDetails user = new UserDetails();
        user.setId(UUID.fromString(rs.getString("id")));
        user.setEmail(rs.getString("email"));
        user.setMobile(rs.getString("mobile"));
        user.setPassword(rs.getString("password"));
        return user;
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(con, st, rs);
    }
    return null;
  }

  @Override
  public Optional<UserDetails> findByEmailOrMobile(String email, String mobile) {

    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      con = ConnectionUtil.getConnection();
      st = con.prepareStatement(FIND_BY_EMAIL_MOBILE);
      st.setString(1, email);
      st.setString(2, mobile);
      rs = st.executeQuery();
      if (rs.next()) {
        UserDetails user = new UserDetails();
        user.setId(UUID.fromString(rs.getString("id")));
        user.setEmail(rs.getString("email"));
        user.setMobile(rs.getString("mobile"));
        user.setPassword(rs.getString("password"));
        return Optional.of(user);
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      ConnectionUtil.close(con, st, rs);
    }
    return Optional.empty();

  }
}
