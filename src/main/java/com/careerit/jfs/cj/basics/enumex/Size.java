package com.careerit.jfs.cj.basics.enumex;

public enum Size {

    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private String size;

    private Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }


    public static void main(String[] args) {

        for (Size s : Size.values()) {
            System.out.println(s + " " + s.getSize());
        }

    }

}
