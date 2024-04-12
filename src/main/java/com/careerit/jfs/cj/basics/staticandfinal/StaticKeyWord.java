package com.careerit.jfs.cj.basics.staticandfinal;

import static java.lang.Math.*;
import static java.lang.System.*;
import  static com.careerit.jfs.cj.basics.staticandfinal.MyConstants.*;
// static key word: variable, method, block, inner class, imports
public class StaticKeyWord {

    public static void main(String[] args) {

        out.println(sqrt(16));
        out.println(PI);
        out.println(E);
        out.println(random());
        out.println(max(10, 20));

        out.println(DAYS_IN_WEEK);
        out.println(noOfDaysInMonth(2024,2));
    }

    // Variables: instance, local, class(static)
}
