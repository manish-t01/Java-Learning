package encapsulatin;

class Bank {

    private int balance;

    public void setBalance(int b) {
        balance = b;
    }

    public int getBalance() {
        return balance;
    }
}

public class Encap02 {
    public static void main(String[] args) {

        Bank b = new Bank();

        b.setBalance(500);

        System.out.println(b.getBalance());
    }
}
