package Inheritance;

class Animal6 {

    Animal6() {
        System.out.println("Parent constructor");
    }
}

class Dog6 extends Animal6 {

    Dog6() {
        super();

        System.out.println("Child constructor");
    }
}

public class inherit07 {
    public static void main(String[] args) {

        Dog6 d = new Dog6();
    }
}
