package keywordsInJava;

//Parent constructor example
class Animal2 {

    Animal2() {
        System.out.println("Animal constructor");
    }
}

class Dog2 extends Animal2 {

    Dog2() {
        super();

        System.out.println("Dog constructor");
    }
}

public class Supar03 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
    }
}
