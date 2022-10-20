import java.util.Arrays;

class Main {

    public static void main(String[] args){
        String str2 = "X*III";

        System.out.println(str2.charAt(0));

        char[] chars = new char[str2.length()];
        System.out.println(str2.length());
        for (int i=0; i<str2.length(); i++){
            chars[i] = str2.charAt(i);
        }
        System.out.println(Arrays.toString(chars));


    }
    }
