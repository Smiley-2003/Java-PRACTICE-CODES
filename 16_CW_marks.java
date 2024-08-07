import java.util.Scanner;
import java.io.*;

class Subject{
    int max = 100;
    int obtd;
}
public class CW_marks {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Subject s1 = new Subject();
        System.out.println("Enter Science Marks:");
        s1.obtd = sc.nextInt();

        System.out.println("Enter English Marks:");
        Subject s2 = new Subject();
        s2.obtd = sc.nextInt();

        System.out.println("Enter SocialScience Marks:");
        Subject s3 = new Subject();
        s3.obtd = sc.nextInt();

        System.out.println("Enter Hindi Marks:");
        Subject s4 = new Subject();
        s4.obtd = sc.nextInt();

        int obtd = (s1.obtd)+(s2.obtd)+(s3.obtd)+(s4.obtd);
        int per = (obtd+100/500);
        System.out.println("Percentage obtained :"+per);

    }
}
