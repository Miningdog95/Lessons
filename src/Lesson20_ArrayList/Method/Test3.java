package Lesson20_ArrayList.Method;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Mihail");
        map.put(778, "Tregulov Zaur");
        map.put(779, "Sidorova Maria");
        map.put(780, "Petrov Petr");
        map.put(781, "Tregulov Zaur");
        map.remove(781);
        map.toString();
        System.out.println("map = " + map);

    }
}
