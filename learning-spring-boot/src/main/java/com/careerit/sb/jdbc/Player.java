package com.careerit.sb.jdbc;

import lombok.Data;

@Data
public class Player {
    private long id;
    private String name;
    private String teamName;
    private String role;
    private double amount;

}
