package com.careerit.cbook.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserDetails {

    private UUID id;
    private String email;
    private String mobile;
    private String password;

}
