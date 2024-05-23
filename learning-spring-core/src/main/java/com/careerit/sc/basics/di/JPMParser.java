package com.careerit.sc.basics.di;

import org.springframework.stereotype.Service;

@Service("jpm")
public class JPMParser implements Parser{
  @Override
  public String parse(String fileName) {
    return "JP Morgan parser: " + fileName + " parsed successfully";
  }
}
