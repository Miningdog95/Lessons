package Lesson6;

public class MethodOverLoading2 {
    int sum(int i1, int i2) {
        return i1 + i2;

    }

    String sum(String s1, String s2) {
        return s1 + s2;
    }
}

class MethodOverLoadingTest2 {
    public static void main(String[] args) {
        MethodOverLoading2 mO2 = new MethodOverLoading2();
        int a = mO2.sum(5, 7);
        System.out.println(a);
        String s = mO2.sum("privet ", "moy drug");
        System.out.println(s);


    }
}
