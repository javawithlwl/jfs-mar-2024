package com.careerit.jfs.cj.basics.cf.iplstats;



import com.careerit.jfs.cj.basics.jsonexample.DecimalFormatter;

import java.text.DecimalFormat;
import java.util.Formatter;

public record TeamAndAmount(String teamName, double amount) {

    public void showTeamAndAmount(){

        DecimalFormat formatter = new DecimalFormat("#,###.00");
        String formattedAmount = formatter.format(amount);
        System.out.println("Team : "+teamName+" Amount : "+formattedAmount);

    }
}
