package com.careerit.jfs.cj.basics.jsonexample;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private long id;
    private String name;
    private double price;
    private String description;
}
