package com.careerit.jfs.cj.basics.day11;

public class StringBuilderExample3 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("radar"));
    }

    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
