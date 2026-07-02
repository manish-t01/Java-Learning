package getterAndSetter;

class Studentt {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class GS02 {
    public static void main(String[] args) {

        Studentt s = new Studentt();

        s.setName("Manish");
        s.setAge(18);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}