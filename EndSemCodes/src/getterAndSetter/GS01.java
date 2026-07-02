package getterAndSetter;

class Student {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class GS01 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Manish");

        System.out.println(s1.getName());
    }
}