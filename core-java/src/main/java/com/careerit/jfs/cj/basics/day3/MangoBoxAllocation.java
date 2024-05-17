package com.careerit.jfs.cj.basics.day3;

public class MangoBoxAllocation {

    public static void main(String[] args) {

            int totalMangoes = 96;
            int boxSize = 12;

            int totalBoxes = totalMangoes / boxSize;
            if(totalMangoes % boxSize != 0) {
                totalBoxes += 1;
            }
            System.out.println("Total boxes required :"+totalBoxes);
    }
}
