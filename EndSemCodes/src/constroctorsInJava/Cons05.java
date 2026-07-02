package constroctorsInJava;

//Constroctor with getter and setter.
class Student4 {

    private String name;
    private int age;

    // Constructor
    Student4(String n, int a) {
        name = n;
        age = a;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }
}

public class Cons05 {
    public static void main(String[] args) {

        Student4 s = new Student4("Manish", 18);
            

        System.out.println(s.getName());
        System.out.println(s.getAge());

        s.setName("Rahul");
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}