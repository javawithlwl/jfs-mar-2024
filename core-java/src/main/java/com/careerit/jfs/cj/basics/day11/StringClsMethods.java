package com.careerit.jfs.cj.basics.day11;

public class StringClsMethods {

    public static void main(String[] args) {

        String name = "Krish";
        System.out.println(name.concat(" T"));
        System.out.println(name);

        name = name.concat(" T");
        System.out.println(name);

        String t1 = "Core";
        String t2 = "Core Java";
        t1 = t1.concat(" Java");
        System.out.println(t1 == t2);
        System.out.println(t1.equals(t2));

        String str1 = null;
        String str2 = "Hello";
        System.out.println(str2.equals(str1));

        String message = " Good Morning ";
        System.out.println(message.length());
        message = message.trim();
        System.out.println(message.length());

        login(" krish.t@gmail.com ", "!abc@");
        login(" krish.t@gmail.com", "!abc@");

        String data = "KRISH";

        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            System.out.println(ch);
        }

        // Print characters in reverse order

        for (int i = data.length() - 1; i >= 0; i--) {
            char ch = data.charAt(i);
            System.out.println(ch);
        }

        String d1 = "malayalam";
        String d2 = "liril";
        String d3 = "corejava";
        System.out.println(isPalindrome(d1));
        System.out.println(isPalindrome(d2));
        System.out.println(isPalindrome(d3));

    }

    private static boolean login(String username, String password) {
        String uname = "krish.t@gmail.com";
        String pwd = "!abc@";
        username = username.trim();
        return username.equals(uname) && password.equals(pwd);
    }

    private static boolean isPalindrome(String str) {

        for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
