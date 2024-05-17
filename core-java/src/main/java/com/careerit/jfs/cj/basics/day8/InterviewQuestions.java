package com.careerit.jfs.cj.basics.day8;

public class InterviewQuestions {


    // if n value is 10 => 0 1 1 2 3 5 8 13 21 34
    public static void printFibonacciSeries(int N){
            if(N == 1){
                System.out.println(0);
            }else if(N == 2){
                System.out.println(0+" "+1);
            }else{
                System.out.print(0+" "+1+" ");

                int a = 0;
                int b = 1;
                for(int i=3;i<=N;i++){
                    int c = a + b;
                    System.out.print(c+" ");
                    a = b;
                    b = c;
                }
            }
    }

    public static int countPrimeInRange(int lb,int ub){
        int count = 0;
        for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num){
        if(num < 2 || (num % 2 == 0 && num != 2 )){
            return false;
        }else{
            for(int i=2;i<=num/2;i++){
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    // num 234567
    public static int countPrimeDigits(int num){
        int count = 0;
        while(num !=0){
            int r = num % 10;
            if(isPrime(r)){
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {

            printFibonacciSeries(10);
    }

}
