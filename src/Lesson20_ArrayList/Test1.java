package Lesson20_ArrayList;

import java.util.ArrayList;
import java.util.List;


public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));
        ArrayList<String> list2 = new ArrayList();
        ArrayList<String> list5 = new ArrayList<>(list2);
        System.out.println(list2.equals(list5));
        list2.add("sad");
        list2.add("s");
        List<StringBuilder> list3 = new ArrayList<>();

    }

}

class Car {
}

class Student {

}
