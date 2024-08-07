import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;

public class CWH_ch1_PS {
    public static void main(String args[]) {

//      Question1
//      WAP to sum three numbers in java
        int a = 4;
        int b = 7;
        int c = 6;
        int sum = a + b + c;
        System.out.println(sum);

        // Question2
////   Write a program to calculate CGPA using marks of three subjects(out of 100
//    float subject1 = 45;
//    float subject2 = 60;
//    float subject3 = 48;
//    float cgpa = (subject1 + subject2 + subject3)/30;
//    System.out.println(cgpa);

        //Question3
        System.out.println("What is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");

//    Question 4
//    Write a java program to convert kilometers to miles


//    Question5
//    Write a java program to detect whether a number
//    entered by the user is integer or not
        System.out.println("Enter your number");
//        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
