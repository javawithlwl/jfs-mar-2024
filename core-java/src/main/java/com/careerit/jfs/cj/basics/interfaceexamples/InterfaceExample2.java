package com.careerit.jfs.cj.basics.interfaceexamples;

import java.util.ArrayList;
import java.util.List;

interface MyMath{
    boolean isPrime(int num);
    default int countPrimes(int lb,int ub){
       return getPrimes(lb, ub).size();
    }
    default int[] getPrimeNumbers(int lb,int ub){
        List<Integer> list = getPrimes(lb, ub);
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    private List<Integer> getPrimes(int lb,int ub){
        List<Integer> list = new ArrayList<>();
        for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static int max(int a,int b, int c){
        return Math.max(a, max(b,c));
    }
    private static int max(int a,int b){
        return Math.max(a, b);
    }
}

class PrimeNumberV1 implements MyMath{
    @Override
    public boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
class PrimeNumberV2 implements MyMath{
    @Override
    public boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }


}

public class InterfaceExample2 {

    public static void main(String[] args) {

            MyMath obj = new PrimeNumberV2();
            System.out.println(obj.isPrime(13));
            int count = obj.countPrimes(1, 100);
            System.out.println("Total prime numbers in the range 1 to 100 is :"+count);
    }
}
