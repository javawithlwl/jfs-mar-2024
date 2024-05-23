package com.careerit.sc.basics.javaconfig;

public class ContactDaoImpl implements ContactDao {

  private DataBaseUtil dataBaseUtil;

  public ContactDaoImpl(DataBaseUtil dataBaseUtil) {
    this.dataBaseUtil = dataBaseUtil;
  }
  @Override
  public long count() {
    return dataBaseUtil.count();
  }


}
