package Inheritance;

//Example 1 – Basic Inheritance
class Animal {
   public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    
}

public class Inherit01 {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}
