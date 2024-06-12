package com.careerit.bookstore.auth.common;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtResponse {
    private String jwtToken;
}