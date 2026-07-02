package interfaceinjava;

interface Animal0{
	void sound();
}

interface Animal1{
	void eats();
}

class Dog1 implements Animal0, Animal1{
	public void sound() {
		System.out.println("Dog Barks. ");
	}
	
	public void eats() {
		System.out.println("Dog Eats. ");
	}
}
public class interface02 {
	public static void main(String[] args) {
	Dog1 d = new Dog1();
	
	d.sound();
	d.eats();
	
	}
}
