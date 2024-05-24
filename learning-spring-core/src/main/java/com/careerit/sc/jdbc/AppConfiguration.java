package com.careerit.sc.jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@PropertySource("classpath:application.properties")
@Configuration
public class AppConfiguration {

  @Value("${db.url}")
  private String dbUrl;

  @Value("${db.username}")
  private String dbUser;

  @Value("${db.password}")
  private String dbPassword;

  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setUrl(dbUrl);
    dataSource.setUsername(dbUser);
    dataSource.setPassword(dbPassword);
    return dataSource;
  }

  @Bean
  public JdbcTemplate jdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }

}
