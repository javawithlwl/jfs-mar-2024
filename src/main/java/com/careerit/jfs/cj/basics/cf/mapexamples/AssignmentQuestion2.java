package com.careerit.jfs.cj.basics.cf.mapexamples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

record Faculty(int id, String name, String dept, double salary) {
}
public class AssignmentQuestion2 {

    public static void main(String[] args) {

        List<Faculty> faculties = getFaculties();

        // Create map of faculties with dept name as key and list of faculties as value

        Map<String,List<Faculty>> deptFacultyMap = new HashMap<>();

    }
    public static List<Faculty> getFaculties(){
        return List.of(
                new Faculty(1001, "Krish", "CS", 45000),
                new Faculty(1002, "Manoj", "EC", 25000),
                new Faculty(1003, "Charan", "IS", 15000),
                new Faculty(1004, "Suresh", "CS", 35000),
                new Faculty(1005, "Ramesh", "EC", 5000),
                new Faculty(1006, "Rajesh", "IS", 2000),
                new Faculty(1007, "Mahesh", "CS", 3000),
                new Faculty(1008, "Naresh", "EC", 1500),
                new Faculty(1009, "Ganesh", "IS", 1000),
                new Faculty(1010, "Srinivas", "CS", 500)
        );
    }
}
