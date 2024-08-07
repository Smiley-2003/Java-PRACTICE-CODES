public class cwh_12_ps2 {

    public static void main(String[] args) {

        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        //Write a java program to encrypt  a grade by
//        adding 8 to it.Decrypt it to show the correct grade
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        //Decrypting the grade
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
