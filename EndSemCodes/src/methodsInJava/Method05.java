package methodsInJava;

class Method05 {

    public static void check(int num) {

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void main(String[] args) {
        check(4);
        check(7);
    }
}
