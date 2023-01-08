package com.company;

import java.awt.dnd.DragGestureEvent;

public class Student {
    Student(int id1, String name1, String surname1, int yearEducation1, int b1, int c1, int d1) {

        id = id1;
        name = name1;
        surname = surname1;
        yearEducation = yearEducation1;
        mathEverage = b1;
        economicEverage = c1;
        foreignEverage = d1;
    }

    Student(int id2, String name2, String surname2, int yearEducation2) {
        this(id2, name2, surname2, yearEducation2, 0, 0, 0);
    }

    Student(){
    }

    int id;
    String name;
    String surname;
    int yearEducation;
    int mathEverage;
    int economicEverage;
    int foreignEverage;

}

class StudentTest {

    public static void main(String[] args) {

        Student Mike = new Student(1, "Mike", "Ivanov", 2, 4, 5, 4);
        System.out.println(Mike.id + " " + Mike.name + " " + Mike.surname + " " + Mike.yearEducation + " " + Mike.mathEverage + " " + Mike.economicEverage + " " + Mike.foreignEverage);
        Student Sabi = new Student(2, "Sabi", "Buz",1);
        System.out.println(Sabi.id + " " + Sabi.name + " " + Sabi.surname+ " " + Sabi.yearEducation);
        Student Gena = new Student();
        System.out.println(Gena.id + Gena.name + Gena.surname);

    }
}

