package methodsInJava;

//Parent class
class Animal {

 void sound() {
     System.out.println("Animal makes sound");
 }
}

//Child class
class Dog extends Animal {

 // overriding parent method
@Override
 void sound() {
     System.out.println("Animal makes sound");
 }
}

public class Overriding01 {
 public static void main(String[] args) {

     Dog d = new Dog();

     d.sound();
 }
}
