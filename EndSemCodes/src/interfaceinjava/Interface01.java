package interfaceinjava;

interface Animal {
	void sound();
}

class Dog implements Animal{
	public void sound(){
		System.out.println("Dog Barks...");
	}
}

class Cat implements Animal{
	public void sound() {
		System.out.println("Cat Meos...");
	}
}

public class Interface01 {
	public static void main(String[] args) {
	Dog d = new Dog();
	Cat c = new Cat();
	
	d.sound();
	c.sound();
	
	}
}

