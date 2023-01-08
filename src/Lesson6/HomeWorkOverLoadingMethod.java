package Lesson6;

public class HomeWorkOverLoadingMethod {
    int sum1() {
        int output = 0;
        System.out.println(output);
        return output;
    }
    int sum1(int a) {
        int output = a;
        System.out.println(output);
        return output;
    }

    int sum1(int a, int b) {
       int output = a+b;
        System.out.println(output);
        return output;
    }

    int sum1(int a, int b, int c) {
        int output = a+b+c;
        System.out.println(output);
        return output;
    }

    int sum1(int a, int b, int c, int d) {
        int output = a+b+c+d;
        System.out.println(output);
        return output;
    }

    int sum1(int a, int b, int c, int d, int e) {
        int output = a+b+c+d+e;
        System.out.println(output);
        return output;
    }
}
class HomeWorkOverLoadingMethodTest{
public static void main(String[] args){
HomeWorkOverLoadingMethod test = new HomeWorkOverLoadingMethod();
test.sum1();
test.sum1(1);
test.sum1(1,2);
test.sum1(1,2,3);
test.sum1(1,2,3,4);
test.sum1(1,2,3,4,5);
}
}
