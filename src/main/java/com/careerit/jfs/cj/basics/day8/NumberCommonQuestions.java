package com.careerit.jfs.cj.basics.day8;

public class NumberCommonQuestions {



        // 1. Write a method to accept number and return the sum of digits of the number

        // 2. Write a method to accept number and return the reverse of the number

        // 3. Write a method to accept number and return true if the number is palindrome else return false

        // 4. Write a method to accept number and return true if the number is armstrong number else return false

        public int sumOfDigits(int num){
            int sum = 0;
            while(num != 0){
                int r = num % 10;
                sum += r;
                num = num / 10;
            }
            return sum;
        }

        public int reverseOfNumber(int num){
            int rev = 0;
            while(num != 0){
                int r = num % 10;
                rev = rev * 10 + r;
                num = num / 10;
            }
            return rev;
        }

        public boolean isPalindrome(int num){
            return reverseOfNumber(num) == num;
        }
        // 153 = 1^3 + 5^3 + 3^3
        public boolean isArmstrong(int num){
            int temp = num;
            int sum = 0;
            while(temp != 0){
                int r = temp % 10;
                sum += r * r * r;
                temp = temp / 10;
            }
            return sum == num;
        }


    public static void main(String[] args) {

            int num = 12345;

            NumberCommonQuestions obj = new NumberCommonQuestions();
            int sumOfDigits = obj.sumOfDigits(num);

            System.out.println("Sum of digits of "+num+" is "+sumOfDigits);

            int reverse = obj.reverseOfNumber(num);
            System.out.println("Reverse of "+num+" is "+reverse);

            boolean isPalindrome = obj.isPalindrome(num);
            System.out.println(num+" is palindrome : "+isPalindrome);

            boolean isArmstrong = obj.isArmstrong(num);
            System.out.println(num+" is armstrong : "+isArmstrong);
            num = 153;
            isArmstrong = obj.isArmstrong(num);
            System.out.println(num+" is armstrong : "+isArmstrong);


    }


}
