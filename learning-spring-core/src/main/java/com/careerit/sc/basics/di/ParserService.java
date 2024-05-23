package com.careerit.sc.basics.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ParserService {

  @Autowired
  @Qualifier("bofa")
  private Parser parser;

  public void readData(String fileName) {
    System.out.println(parser.parse(fileName));
  }
}
