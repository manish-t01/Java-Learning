package arrayInJava;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1st way of making array
        int marksss[] = {0, 10, 20, 30, 40};

        System.out.print("Enter index for first array (0-4): ");
        int index1 = sc.nextInt();
        System.out.println("Value = " + marksss[index1]);

        // 2nd way of making array
        int marks[] = new int[10];
        marks[5] = 50;
        marks[6] = 60;
        marks[7] = 70;
        marks[8] = 80;
        marks[9] = 90;

        System.out.print("Enter index for second array (0-9): ");
        int index2 = sc.nextInt();
        System.out.println("Value = " + marks[index2]);

        // 3rd way of making array
        int markss[];
        markss = new int[15];
        markss[10] = 100;
        markss[11] = 110;
        markss[12] = 120;
        markss[13] = 130;
        markss[14] = 140;

        System.out.print("Enter index for third array (0-14): ");
        int index3 = sc.nextInt();
        System.out.println("Value = " + markss[index3]);

        sc.close();
    }
}