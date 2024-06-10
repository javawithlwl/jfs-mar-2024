package com.careerit.iplstats.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "player")
@Getter
@Setter
public class Player {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @Column(name = "name")
  private String name;
  @Column(name = "team_name")
  private String teamName;
  @Column(name = "role")
  private String role;
  @Column(name = "amount")
  private double amount;
}
