package keywordsInJava;

class Animal23 {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog23 extends Animal23 {

    void eat() {
        System.out.println("Dog is eating");
    }

    void show() {
        super.eat();   // Call parent's eat()
        eat();         // Call child's eat()
    }
}

public class Supar04 {
    public static void main(String[] args) {

        Dog23 d = new Dog23();
        d.show();
    }
}
