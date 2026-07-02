package arrayInJava;

public class DisplaingArray {
    public static void main(String[] args) {
        
        // ==========================================
        // 1. ARRAY DECLARATION & THE .length PROPERTY
        // ==========================================
        
        // Creating an integer array of marks
        int[] marks = {98, 45, 79, 99, 80};
//        int marks[] = {98, 45, 79, 99, 80}; This is also valid.
        
        // Using the .length property to get the size of the array [00:01:53]
        System.out.println("--- Array Basics ---");
        System.out.println("The total number of elements (length) is: " + marks.length); 
        System.out.println("The first element (index 0) is: " + marks[0]);
        System.out.println();


        // ==========================================
        // 2. FORWARD TRAVERSAL (Using Standard for-loop)
        // ==========================================
        // Used when you need the index counter 'i' [00:07:27]
        // Loops from index 0 up to length - 1
        System.out.println("--- 1. Forward Print (Standard for loop) ---");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Element at index " + i + ": " + marks[i]);
        }
        System.out.println();


        // ==========================================
        // 3. REVERSE TRAVERSAL (Using Standard for-loop)
        // ==========================================
        // Used to print or process the array backwards [00:09:25]
        // Starts at (length - 1) and decrements down to 0
        System.out.println("--- 2. Reverse Print (Standard for loop) ---");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println("Element at index " + i + ": " + marks[i]);
        }
        System.out.println();


        // ==========================================
        // 4. THE FOR-EACH LOOP (Enhanced for-loop)
        // ==========================================
        // Cleanest syntax introduced for quick data retrieval [00:11:05]
        // Note: The index position ('i') is NOT available inside this loop!
        System.out.println("--- 3. Forward Print (Enhanced for-each loop) ---");
        for (int element : marks) {
            System.out.println("Value: " + element);
        }
        System.out.println();


        // ==========================================
        // 5. BONUS: WORKING WITH OTHER DATA TYPES
        // ==========================================
        // Arrays can be created for any data type, like Strings [00:03:36]
        System.out.println("--- 4. String Array Example ---");
        String[] students = {"Harry", "Rohan", "Shubham", "Lovish"};
        
        // Printing the String array using a for-each loop
        for (String student : students) {
            System.out.println("Student Name: " + student);
        }
    }
}