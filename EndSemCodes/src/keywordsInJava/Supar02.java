package keywordsInJava;

//Parent method example
class Animal1 {

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog1 extends Animal1 {

    void sound() {
        System.out.println("Dog barks");
    }

    void show() {
        super.sound();
        sound();
    }
}

public class Supar02 {
    public static void main(String[] args) {
        Dog1 d = new Dog1();

        d.show();
    }
}
