package com.careerit.jfs.cj.basics.day4;

public class SeatingArrangement {

    public int getRequiredRoomCount(int totalStudents,int roomCapacity){

        int requiredRooms = totalStudents / roomCapacity;
        if(totalStudents % roomCapacity != 0){
            requiredRooms += 1;
        }
        return requiredRooms;
    }

    public static void main(String[] args) {
        SeatingArrangement obj = new SeatingArrangement();

        int totalStudents = 90;
        int roomCapacity = 15;
        int requiredRooms = obj.getRequiredRoomCount(totalStudents, roomCapacity);
        System.out.println("Required rooms :"+requiredRooms);
    }
}
