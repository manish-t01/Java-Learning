package keywordsInJava;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name);
    }
}     

public class this01 {
    public static void main(String[] args) {
        Student s1 = new Student("Manish");

        s1.show();
    }
}