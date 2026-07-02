package multithereding;

// Implementing Multithreading By extending the thread class.

class Mythread3 extends Thread{
	public void run() {	
		int i = 0;
		while(i < 1000) {
			System.out.println("Thred ONE is running...");
			System.out.println("=======================");
			System.out.println("");
			i++;
		}
	}
}

class Mythread4 extends Thread{
	public void run() {
		int i = 0;
		while(i < 1000) {
			System.out.println("Thred TWO is running...");
			System.out.println("=======================");
			System.out.println("");
			i++;
		}
	}
}

public class Thread02 {
	public static void main(String[] args) {
	Mythread3 t1 = new Mythread3();
	Mythread4 t2 = new Mythread4();
	
	t1.start();
	t2.start();
	
	}
}
