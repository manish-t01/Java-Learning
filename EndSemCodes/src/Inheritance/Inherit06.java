package Inheritance;

//Example 2 – Child uses parent data
class Animal5 {

    String name;

    Animal5() {
        name = "Dog";
    }
}

class Dog5 extends Animal5 {

    Dog5() {
        System.out.println(name);
    }
}

public class Inherit06 {
    public static void main(String[] args) {

        Dog5 d = new Dog5();
    }
}
