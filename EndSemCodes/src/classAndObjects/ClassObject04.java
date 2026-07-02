package classAndObjects;

//Class with real life example of student.
class Student {
    String name;
    int age;
}

public class ClassObject04 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Manish";
        s1.age = 22;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}

//Class = blueprint/template
//
//Object = real thing made from class
//
//Syntax:
//
//class ClassName {
//    variables;
//    methods;
//}
//
//ClassName obj = new ClassName();

