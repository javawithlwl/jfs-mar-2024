package com.careerit.sb.jpa.cbook.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @Column(name = "address")
  private String address;
  @Column(name = "city")
  private String city;
  @Column(name = "state")
  private String state;
  @Column(name = "country")
  private String country;
  @Column(name = "zipcode")
  private String zipCode;

  @OneToOne(mappedBy = "address")
  private Contact contact;
}
