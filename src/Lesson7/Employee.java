package Lesson7;

public class Employee {
    private double salary;
    public String surname;
    int id;

    public void method1(double salary) {
        System.out.println(salary);
    }

    public void metgod2(String surname) {
        System.out.println(surname);
    }

    public int method3(int id) {
        System.out.println(id);
        return id;
    }

    public Employee(int id2) {
        id = id2;
    }

    Employee(String surname2) {
        surname2 = surname;
    }

    private Employee(double salary2) {
        salary = salary2;
    }

}

class Test3 {
    Employee test = new Employee(5);
    Employee test2 = new Employee("Srting");
    //Employee test3 = new Employee(55.5);
}


