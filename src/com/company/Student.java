package com.company;

public class Student {
    int BiletNomer;
    String Name;
    String LastName;
    int YearEducation;
    int MathEverage;
    int EconomicEverage;
    int ForeignEverage;
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

        Sabi.BiletNomer = 2;
        Sabi.Name = "Sabi";
        Sabi.LastName = "Buzik";
        Sabi.YearEducation = 2012;
        Sabi.MathEverage = 3;
        Sabi.EconomicEverage = 3;
        Sabi.ForeignEverage = 5;

        Dima.BiletNomer = 3;
        Dima.Name = "Dima";
        Dima.LastName = "Belyaev";
        Dima.YearEducation = 2013;
        Dima.MathEverage = 5;
        Dima.EconomicEverage = 4;
        Dima.ForeignEverage = 3;


        System.out.println("Everage " + Mike.Name + " " + Mike.LastName + "=" + (Mike.MathEverage + Mike.EconomicEverage + Mike.ForeignEverage) / 3);

        System.out.println("Everage " + Sabi.Name + " " + Sabi.LastName + "=" + (Sabi.MathEverage + Sabi.EconomicEverage + Sabi.ForeignEverage) / 3);

        System.out.println("Everage " + Dima.Name + " " + Dima.LastName + "=" + (Dima.MathEverage + Dima.EconomicEverage + Dima.ForeignEverage) / 3);
    }
}

