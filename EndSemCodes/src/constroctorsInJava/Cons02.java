package constroctorsInJava;

//Constructor with values
class Student1 {

    String name;

    Student1() {
        name = "Manish";
    }
}

public class Cons02 {
    public static void main(String[] args) {

        Student1 s = new Student1();

        System.out.println(s.name);
    }
}