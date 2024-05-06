package com.careerit.jfs.cj.basics.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionExample4 {


    public static void main(String[] args) {
        try {
            List<String> list = readDataFromFile("data.txt");
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("End of main method");
    }

    public static List<String> readDataFromFile(String fileName) throws IOException {
        List<String> list = new ArrayList<>();
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        while((line = br.readLine()) != null){
            list.add(line);
        }
        return list;
    }

    public static int res(int num1, int num2) {
        if(num2 == 0){
            throw new ArithmeticException("Denominator should not be zero");
        }
        return num1 / num2;
    }
}
