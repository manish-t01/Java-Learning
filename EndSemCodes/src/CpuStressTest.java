public class CpuStressTest {

    static class Worker extends Thread {
        public void run() {
            double result = 0;

            while (true) {
                for (int i = 1; i < 1_000_000; i++) {
                    result += Math.sqrt(i) * Math.sin(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();

        System.out.println("Logical CPUs: " + cores);
        System.out.println("Starting stress test...");

        for (int i = 0; i < cores; i++) {
            new Worker().start();
        }
    }
}