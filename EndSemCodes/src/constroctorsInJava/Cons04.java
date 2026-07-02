package constroctorsInJava;

//Constroctor with two parameter values.
class Student3 {

    String name;
    int age;

    Student3(String n, int a) {
        name = n;
        age = a;
    }
}

public class Cons04 {
    public static void main(String[] args) {

        Student3 s =  new Student3("Manish", 18);
                

        System.out.println(s.name);
        System.out.println(s.age);
    }
}