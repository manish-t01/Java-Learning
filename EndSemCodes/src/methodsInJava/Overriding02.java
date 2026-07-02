package methodsInJava;

class Animal1 {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal1 {

    void sound() {
        System.out.println("Meow Meow");
    }
}

public class Overriding02 {
    public static void main(String[] args) {

        Animal1 a = new Animal1();
        a.sound();

        Cat c = new Cat();
        c.sound();
    }
}