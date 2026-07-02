package Inheritance;

//Parent constructor with parameter
class Animal7 {

    Animal7(String name) {
        System.out.println(name);
    }
}

class Dog7 extends Animal7 {

    Dog7() {
        super("Tommy");
    }
}

public class Inherit08 {
    public static void main(String[] args) {

        Dog7 d = new Dog7();
    }
}



//CONSTRUCTOR IN INHERITANCE
//
//1. Child object created
//2. Parent constructor runs first
//3. Then child constructor runs
//
//Keyword:
//super()
//
//Use:
//Call parent constructor
//
//Rule:
//super() must be first line
//
//Java adds super() automatically
//if not written