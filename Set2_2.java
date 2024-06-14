//Write a Program to encrypt a grade by adding 8 and multiplying 3 to it and decrypt to show the value

import java.util.Scanner;

public class Set2_2 {
    public static void main(String[] args) {
        float grade;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your grade : ");
        grade = s.nextFloat();
        grade = (grade + 8) * 3;
        System.out.println("Your Encrypted grade is : " + grade);
        grade = (grade / 3) - 8;
        System.out.println("Your Grade is : " + grade);
    }
}