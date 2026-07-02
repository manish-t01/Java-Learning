package encapsulatin;

class Bank1 {

    private int balance;

    public void setBalance(int b) {
        if (b >= 0) {
            balance = b;
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Encap03 {
    public static void main(String[] args) {

        Bank1 b = new Bank1();

        b.setBalance(-100);

        System.out.println(b.getBalance());
    }
}


//Encapsulation =
//Hiding data using private variables
//and accessing it with getter/setter methods.
//
//private → hide data
//
//setter → set value
//
//getter → get value