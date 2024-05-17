package com.careerit.jfs.cj.basics.exception;

import java.io.*;

public class ExceptionExample2 {

    public static void main(String[] args)  {

            // Open the file and find the size of the file, write the content of the file to another file

        File file = new File("data.txt");
        File file1 = new File("data1.txt");
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            bw = new BufferedWriter(new FileWriter(file1));
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
                bw.write(line);
                bw.newLine();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(bw != null){
                    bw.close();
                }
                if(br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
