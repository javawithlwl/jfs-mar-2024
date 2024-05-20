package com.careerit.empstats.dao;

import com.careerit.commons.ConnectionUtil;

import java.sql.Connection;
import java.sql.Statement;

public class SeedDataUtil {

    public static void clearData(String tableName){

      Connection con = null;
      Statement st = null;
      try{
        con = ConnectionUtil.getConnection();
        st = con.createStatement();
        st.executeUpdate("delete from "+tableName);
      }catch (Exception e) {
        e.printStackTrace();
      }finally{
        ConnectionUtil.close(con, st);
      }

    }
}
