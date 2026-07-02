package constroctorsInJava;

class Student0 {

    String name;   // Different for each object

    // Static variable
    // Same for every object
    static String school = "ABC School";

    // Constructor
    Student0(String n) {
        name = n;
    }

    // Method to display data
    void show() {
        System.out.println("Name: " + name);
        System.out.println("School: " + school);
    }

}
    
    public class Cons08 {
    public static void main(String[] args) {

        // Creating objects
        Student0 s1 = new Student0("Manish");
        Student0 s2 = new Student0("Rahul");

        // Display data
        s1.show();
        s2.show();
    }
}
    
//      Constructor:
//    	- Special method
//    	- Same name as class
//    	- No return type
//    	- Runs automatically
//
//    	Static variable:
//    	- Belongs to class
//    	- Shared by all objects
//    	- Only one copy