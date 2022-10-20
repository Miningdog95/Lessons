package com.company;

public class Student {
    int BiletNomer;
    String Name;
    String LastName;
    int YearEducation;
    int MathEverage;
    int EconomicEverage;
    int ForeignEverage;

    double everage() {
        double everage = (MathEverage + EconomicEverage + ForeignEverage) / 3;
        return everage;
    }
}


class StudentTest {

    public static void main(String[] args) {

        Student Mike = new Student();
        Student Sabi = new Student();
        Student Dima = new Student();

        Mike.BiletNomer = 1;
        Mike.Name = "Mike";
        Mike.LastName = "Ivanov";
        Mike.YearEducation = 2012;
        Mike.MathEverage = 5;
        Mike.EconomicEverage = 5;
        Mike.ForeignEverage = 5;
        System.out.println(Mike.everage());

        Sabi.BiletNomer = 2;
        Sabi.Name = "Sabi";
        Sabi.LastName = "Buzik";
        Sabi.YearEducation = 2012;
        Sabi.MathEverage = 3;
        Sabi.EconomicEverage = 3;
        Sabi.ForeignEverage = 5;
        System.out.println(Sabi.everage());

        Dima.BiletNomer = 3;
        Dima.Name = "Dima";
        Dima.LastName = "Belyaev";
        Dima.YearEducation = 2013;
        Dima.MathEverage = 5;
        Dima.EconomicEverage = 4;
        Dima.ForeignEverage = 3;
        System.out.println(Dima.everage());


    }
}

