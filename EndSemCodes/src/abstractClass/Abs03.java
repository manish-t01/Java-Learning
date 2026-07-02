package abstractClass;

//Abstract class can also have normal methods
abstract class Animal1 {

    abstract void sound();

    void eat() {
        System.out.println("Animal eats food");
    }

}

class Dog1 extends Animal1 {

    void sound() {
        System.out.println("Dog barks");
    }

}

public class Abs03 {

    public static void main(String[] args) {

        Dog1 d = new Dog1();

        d.sound();
        d.eat();

    }

}


//ABSTRACT CLASS
//
//- incomplete class
//- created with abstract keyword
//- cannot make object
//
//ABSTRACT METHOD
//
//- method without body
//- child class must override it
//
//SYNTAX
//
//abstract class Animal {
//    abstract void sound();
//}
//
//class Dog extends Animal {
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}

