package com.careerit.jfs.cj.basics.staticandfinal;
import java.util.Arrays;

import static com.careerit.jfs.cj.basics.staticandfinal.InterestCalculator.*;
final class InterestCalculator {

    private InterestCalculator() {
    }
    public static double simpleInterest(double p, double t, double r) {
        return p * t * r / 100;
    }

    public static double compoundInterest(double p, double t, double r) {
        return p * Math.pow(1 + r / 100, t) - p;
    }

    public static double emi(double p, double t, double r) {
        r = r / 12 / 100;
        return p * r * Math.pow(1 + r, t) / (Math.pow(1 + r, t) - 1);
    }
}

public class StaticMethodExample {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        double p = 10000;
        double t = 2;
        double r = 10;

        double si = simpleInterest(p, t, r);
        double ci = compoundInterest(p, t, r);
        double emi = emi(p, t, r);

        System.out.println("Simple Interest : "+si);
        System.out.println("Compound Interest : "+ci);
        System.out.println("EMI : "+emi);
        System.out.println(Double.parseDouble(args[3]));
    }
}

// 123 Hello 10.56 =>  new String[]{"123","Hello","10.56"}