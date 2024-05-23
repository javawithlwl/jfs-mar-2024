package com.careerit.sc.basics.annotationconfig;

import org.springframework.stereotype.Repository;

@Repository
public class ContactDaoImpl implements ContactDao {


  private final DataBaseUtil dataBaseUtil;

  public ContactDaoImpl(DataBaseUtil dataBaseUtil) {
    this.dataBaseUtil = dataBaseUtil;
  }

  @Override
  public long count() {
    return dataBaseUtil.count();
  }


}
