package Lesson8;

import Lesson7_1.Test;

public class Test1 {
    public final int a=10;

    public static void main(String[] args) {
        Test1 t = new Test1();

        System.out.println(t.a);
    }
    public void abc(final short s){
        final byte b;
        b=10;
        System.out.println(s+b);
    }

}
