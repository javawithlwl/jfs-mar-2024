package com.careerit.jfs.cj.basics.jsonexample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerDetails {
    private String name;
    private String role;
    @JsonProperty("teamName")
    private String team;
    private double amount;
}
