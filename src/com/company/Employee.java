package com.company;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;
    double salaryX2(){
        salary *= 2;
        return salary;
    }

}
class EmployeeTest{
public static void main(String[] args){
    Employee Petr = new Employee();
    Employee Gena = new Employee();

    Petr.id = 1;
    Petr.surname = "Petr";
    Petr.age = 35;
    Petr.salary = 100;
    Petr.department = "ASU TP";
    Petr.salaryX2();
    System.out.println(Petr.salary);

    Gena.id = 1;
    Gena.surname = "Gena";
    Gena.age = 48;
    Gena.salary = 85;
    Gena.department = "Stroy";
    Gena.salaryX2();
    System.out.println(Gena.salary);
}
}