package Lesson19_Varargs;

public class Homework {
    public static String[] abc(String[]... in) {
        int lenght = 0;
        for (String[] str : in) {
            lenght += str.length;
        }
        String[] target = new String[lenght];
        int count = 0;
        for (String[] array2 : in) {
            for (String s : array2) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        Homework test = new Homework();
        String[] target = abc(new String[]{"21", "123", "5"}, new String[]{"a"}, new String[]{"a", "b", "c", "d"});
        String a = "12";
        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) {
                    target[i] = null;
                }
            }
        }
        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
