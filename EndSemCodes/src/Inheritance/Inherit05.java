package Inheritance;

//Constructor in Inheritance
class Animal4 {

    Animal4() {
        System.out.println("Animal constructor");
    }
}

class Dog4 extends Animal4 {

    Dog4() {
        System.out.println("Dog constructor");
    }
}

public class Inherit05 {
    public static void main(String[] args) {

        Dog4 d = new Dog4();
    }
}
