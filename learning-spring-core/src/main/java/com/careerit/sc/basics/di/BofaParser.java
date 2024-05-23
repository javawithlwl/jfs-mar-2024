package com.careerit.sc.basics.di;

import org.springframework.stereotype.Service;

@Service("bofa")
public class BofaParser implements Parser {
  @Override
  public String parse(String fileName) {
    return "Bofa parser: " + fileName + " parsed successfully";
  }
}
