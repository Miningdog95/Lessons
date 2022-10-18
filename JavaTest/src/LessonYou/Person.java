package LessonYou;
class Person1{
    String name;
    int age;

    void setNameAndAge(String username, int userage){
        name = username;
        age = userage;

    }

    int calculateYearsToRetirement(){
        int Years = 65-age;
        return Years;
    }
    void speak(){
        for(int i = 0; i<3; i++){
        System.out.println("My name is " + name + ", i'm is " + age + " years");
        }
    }
    void sayHello(){
        System.out.println("Privet!");
    }
    }
public class Person {
    public static void  main(String[] args){
        Person1 person1 = new Person1();
        person1.setNameAndAge("Roman", 20);
        String s1 = "Vova";
        Person1 person2 = new Person1();
        person2.setNameAndAge(s1, 30);
        person1.speak();
        person2.speak();

    }
}

