package multithereding;

// Implementing Multithreading By extending the thread class.

class Mythread1 extends Thread{
	public void run() {
		while(true) {
			System.out.println("Thred ONE is running...");
			System.out.println("=======================");
			System.out.println("");
		}
	}
}

class Mythread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("Thred TWO is running...");
			System.out.println("=======================");
			System.out.println("");
		}
	}
}

public class Thred01 {
	public static void main(String[] args) {
	Mythread1 t1 = new Mythread1();
	Mythread2 t2 = new Mythread2();
	
	t1.start();
	t2.start();
	
	}
}
