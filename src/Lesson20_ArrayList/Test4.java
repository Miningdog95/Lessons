package Lesson20_ArrayList;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("poka");
        list.add(sb);
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        for (StringBuilder sb1 : list) {
            System.out.print(sb + " ");
        }
        System.out.println(list.indexOf(new StringBuilder("poka")));
        System.out.println(list.contains(sb));
    }
}
