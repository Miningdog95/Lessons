package Lesson20_ArrayList.Method;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> all2 = new ArrayList<String>(); // <> дженерики, лучше всегда использовать
//        all2.add(new Test2());
        all2.add("three");
        all2.add("four");
        all2.add("ten");
        for (Object o : all2) {
            System.out.println("Number = " + o + " and length = " + ((String)o).length());
        }
    }
}


