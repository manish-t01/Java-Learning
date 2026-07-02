package Inheritance;

//Example 4 – Multilevel inheritance
class Animal3 {
    void eat() {
        System.out.println("Animal is Eating");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog is Barking");
    }
}

class Puppy extends Dog3 {
    void weep() {
        System.out.println("Puppy is Weeping");
    }
}

public class Inherit04 {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}


