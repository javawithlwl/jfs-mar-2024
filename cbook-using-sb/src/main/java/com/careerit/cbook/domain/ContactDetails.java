package com.careerit.cbook.domain;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
public class ContactDetails {

        private UUID id;
        private String name;
        private String email;
        private String mobile;
        private UUID userId;
}
