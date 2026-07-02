package keywordsInJava;

class Animal {

    String name = "Animal";
}

class Dog extends Animal {

    String name = "Dog";

    void show() {
        System.out.println(super.name);
        System.out.println(name);
    }
}

public class Supar01 {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.show();
    }
}
