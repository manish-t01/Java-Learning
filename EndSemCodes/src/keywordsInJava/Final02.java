package keywordsInJava;

//Final method
class Animal4 {

    final void sound() {
        System.out.println("Animal sound");
    }
}

class Dog4 extends Animal4 {
	
}

public class Final02 {
    public static void main(String[] args) {
        Dog4 d = new Dog4();

        d.sound();
    }
}
