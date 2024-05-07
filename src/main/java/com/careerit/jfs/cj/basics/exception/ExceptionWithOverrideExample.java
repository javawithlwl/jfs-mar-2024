package com.careerit.jfs.cj.basics.exception;

import java.io.IOException;

class One{
    public void m1(){
        System.out.println("One m1");
    }

    public int m2(){
        return 10;
    }

    public Object m3(){
        return "One";
    }

    public Number m4(){
        return 10;
    }

    public void m5() throws IOException{
        System.out.println("One m5");
    }
}

class Two extends One{

    public void m1(){
        System.out.println("Two m1");
    }
    public int m2(){
        return 10;
    }
    public String m3(){
        return "Two";
    }

    public Integer m4(){
        return 10;
    }

    public void m5()  {
        System.out.println("Two m5");
    }

}
public class ExceptionWithOverrideExample {
}
