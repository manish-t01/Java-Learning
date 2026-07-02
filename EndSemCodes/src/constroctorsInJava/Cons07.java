package constroctorsInJava;

//Static Variable Example
class Studenttt {

    // Static variable
    // Shared by all objects
    static String school = "ABC School";
    
}

    public class Cons07 {
    public static void main(String[] args) {

        // Creating objects
        Studenttt s1 = new Studenttt();
        Studenttt s2 = new Studenttt();

        // Display static variable
        System.out.println("School: " + s1.school);
        System.out.println("School: " + s2.school);
    }
}
