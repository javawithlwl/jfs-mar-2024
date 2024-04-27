package com.careerit.jfs.cj.basics.cf.empservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyWithSymbol {
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Symbol")
    private String symbol;
}
