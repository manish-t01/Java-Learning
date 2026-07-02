package constroctorsInJava;

//Consstroctor with parametar.
class Student2 {

    String name;

    Student2(String n) {
        name = n;
    }
}

public class Cons03 {
    public static void main(String[] args) {

        Student2 s = new Student2("Manish");

        System.out.println(s.name);
    }
}
