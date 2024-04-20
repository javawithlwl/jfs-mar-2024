package com.careerit.jfs.cj.basics.abstractcls;

public abstract class  One{
    public abstract  int add(int a,int b);
    public abstract  int sub(int a,int b);

    public void showResult(int a,int b){
        System.out.println("The result of "+a+" and "+b+" is "+add(a, b));
        System.out.println("The result of "+a+" and "+b+" is "+sub(a, b));
    }
}