package collection.framework;

import  java.util.ArrayList;

//Introduction to ArrayList.
public class ArrayList_01 {
    public static void main(String[] args) {

        //This is static way of making array in java.
        //String []studentName = new String[5];
        //studentName[0] = "John";
        //studentName[1] = "Doe";
        //studentName[5] = "Manish";

        //Here is dynamic way of making array in java using ArrayList.
        ArrayList<String> name = new ArrayList<>();
        name.add("Manish");
        name.add("Mahesh");
        name.add("Ram");
        name.add("Ravi");
        System.out.println(name);
        System.out.println(name.get(0));
     }
}

