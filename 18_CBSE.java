//Write a program to calculate percentage of a given
//student in CBSE board exam.His marks from 5 subjects must be taken
//as input from the keyboard

import java.util.Scanner;
import java.io.*;

public class CBSE {
    public static void main(String[] args) {

        System.out.println("Enter your 5 subjects marks: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Maths Marks: ");
        int num1 = sc.nextInt();
        System.out.println("Enter English Marks: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Hindi Marks: ");
        int num3 = sc.nextInt();
        System.out.println("Enter Science Marks: ");
        int num4 = sc.nextInt();
        System.out.println("Enter Social Studies Marks: ");
        int num5 = sc.nextInt();

        int average = (num1+ num2 + num3 + num4 + num5)/5;
        System.out.println("The average marks in 5 subjects  is: " + average);

    }
}
