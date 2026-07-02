package interfaceinjava;

interface Animal2 {
    void sound();
}

class Dog3 implements Animal2 {

    public void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat3 implements Animal2 {

    public void sound() {
        System.out.println("Cat Meows");
    }
}

public class Interface03 {
    public static void main(String[] args) {

        Dog3 d = new Dog3();
        Cat3 c = new Cat3();

        d.sound();
        c.sound();
    }
}




