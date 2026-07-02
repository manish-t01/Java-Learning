package multithereding;

//Implementing Multithreading By Runnable interface.

class MythreadRunnable1 implements Runnable{
	public void run() {
		int i = 0;
		while(i < 1000) {
			System.out.println("Thread ONE is running.");
			System.out.println("======================");
			System.out.println("");
			i++;
		}
	}
}

class MythreadRunnable2 implements Runnable{
	public void run() {
		int i = 0;
		while(i < 1000) {
			System.out.println("Thread TWO is running.");
			System.out.println("======================");
			System.out.println("");
			i++;
		}
	}
}

public class Thread03 {
	public static void main (String[] args) {
		MythreadRunnable1 bullet1 = new MythreadRunnable1();
		Thread gun1 = new Thread(bullet1);
		
		MythreadRunnable2 bullet2 = new MythreadRunnable2();
		Thread gun2 = new Thread(bullet2);
		
		gun1.start();
		gun2.start();
	}

}
