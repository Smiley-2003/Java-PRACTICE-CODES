import java.sql.SQLOutput;

public class operators {
    public static void main(String[] args){
//      1. Arithmetic Operators
        int a = 4;
        int b = 6 - a;//subtraction operator
        int c = b * a;//multiplication
        int d = 6 % a;//modulo operator
//        4. 8%1.1 --> returns Decimal Remainder
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

     //2.Assignment Operators
        int e = 9;
        e += 3;
        System.out.println(e);
        int f = 9;
        f *= 3;
        System.out.println(f);

        //3.Comparison operator
        System.out.println(6==6);
        System.out.println(64<6);//Comparison Operators
        System.out.println(6==7);

        //4.Logical Operators
        System.out.println(64>5 && 64>98);
        System.out.println(65>5 || 64>98);
        System.out.println(2&3);


        //5.Bitwise Operator
        //10
        //11
        //-------
        //10

//        4. 8%1.1 --> returns Decimal Remainder

    }
}
