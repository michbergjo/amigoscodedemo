package com.amigoscodeproject.amigoscodedemo.student;

import java.util.UUID;

public class Student {

    private final UUID studentID;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Gender gender;

    enum Gender {
        MALE,FEMALE
    }

    public Student(UUID studentID, String firstName, String lastName, String email, Gender gender) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public UUID getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }
}
