package getterAndSetter;

public class GSNotes03 {
//	        =============================
//			GETTER AND SETTER IN JAVA
//			Quick Revision
//			=============================
//
//			1. private
//			-----------
//			Used to hide variable.
//
//			Syntax:
//			private String name;
//
//			Meaning:
//			Only same class can access it.
//
//
//			2. Setter Method
//			----------------
//			Used to set/change value.
//
//			Syntax:
//			public void setName(String n) {
//			    name = n;
//			}
//
//			Example:
//			s.setName("Manish");
//
//
//			3. Getter Method
//			----------------
//			Used to get/read value.
//
//			Syntax:
//			public String getName() {
//			    return name;
//			}
//
//			Example:
//			System.out.println(s.getName());
//
//
//			4. Full Example
//			---------------
//
//			class Student {
//			    private String name;
//
//			    public void setName(String n) {
//			        name = n;
//			    }
//
//			    public String getName() {
//			        return name;
//			    }
//			}
//
//			public class Main {
//			    public static void main(String[] args) {
//
//			        Student s = new Student();
//
//			        s.setName("Manish");
//
//			        System.out.println(s.getName());
//			    }
//			}
//
//			Output:
//			Manish
//
//
//			5. Easy Trick
//			-------------
//			Getter = Get value
//
//			Setter = Set value
//
//			private = hidden
//
//
//			6. Exam Answer
//			--------------
//			Getter and Setter are methods
//			used to access and update
//			private variables in a class.
//
//			Getter -> read value
//			Setter -> change value
}
