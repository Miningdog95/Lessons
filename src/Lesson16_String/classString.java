package Lesson16_String;

public class classString {
    public static void main(String[] args) {
        String s1 = "privet ";
        String s2 = "     ";
        System.out.println(s2.isEmpty());
        String s3 = "asd as sa";
        System.out.println(s3.isEmpty());
        String s4 = "    privet       ";
        System.out.println(s4);
        String s5 = "poka";
        String s6= s5.trim();
        System.out.println(s5==s6);

    }
}
