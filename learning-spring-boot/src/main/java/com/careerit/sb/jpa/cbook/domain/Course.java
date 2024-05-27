package com.careerit.sb.jpa.cbook.domain;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToMany
    @JoinTable(name = "course_student"
            , joinColumns = @JoinColumn(name = "course_id")
            , inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Student> students;
}
