package Lesson20_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        //   ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
//        Object[] array1 = list1.toArray();
//        for (Object s : array1) {
//           // System.out.println(s);
//        }
//        StringBuilder[] array2 = list1.toArray(new StringBuilder[1]);
//        for (StringBuilder sb : array2) {
//            System.out.println(sb);

        StringBuilder[] array = {sb2, sb3, sb3, sb3};
        List<StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);
        array[0] = new StringBuilder("!!!");
        System.out.println(list8);
    }
}

