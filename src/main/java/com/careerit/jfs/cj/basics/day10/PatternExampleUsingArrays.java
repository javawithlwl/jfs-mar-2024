package com.careerit.jfs.cj.basics.day10;

public class PatternExampleUsingArrays {


    public static void main(String[] args) {

            printNewPattern();
    }

    public static  void printNewPattern(){
        int[][] arr = new int[][]
                {
                        {1,1,1,1,1},
                        {1,0,0,0,1},
                        {1,0,0,0,1},
                        {1,1,1,1,1},
                        {1,0,0,0,1},
                        {1,0,0,0,1},
                        {1,0,0,0,1}
                };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /*
    A
    A B
    A B C
    A B C D
    A B C D E
     */
    public static void printPattern(){

    }

    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
     */

    public static void printPattern1(){

    }

    /*
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
     */
    public static void printPattern2(){

    }
    /*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
     */
    public static void printPattern3(){

    }
    /*
         1
       1 2 1
     1 2 3 2 1
    1 2 3 4 3 2 1
  1 2 3 4 5 4 3 2 1

     */

    public static void printPattern4(){

    }

}
