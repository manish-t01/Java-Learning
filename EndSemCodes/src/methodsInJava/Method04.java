package methodsInJava;

class Method04 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = add(5, 3);

        System.out.println(result);
        System.out.println(add(1, 2)); //this also works.
    }
}