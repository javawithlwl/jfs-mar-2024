package com.careerit.jfs.cj.basics.staticandfinal;

public class InterviewQuestions {

    static {
        System.out.println("Static block 1");
    }

    {
        System.out.println("IIB block 1");
    }



    public static void main(String[] args) {
        System.out.println("Main method started");
        InterviewQuestions obj = new InterviewQuestions();
        System.out.println("End of main method");
    }

    {
        System.out.println("IIB block 2");
    }


}
