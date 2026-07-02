package encapsulatin;

class Student {

    // private variable
    private String name;

    // setter method
    public void setName(String n) {
        name = n;
    }

    // getter method
    public String getName() {
        return name;
    }
}

public class Encap01 {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Manish");

        System.out.println(s.getName());
    }
}
