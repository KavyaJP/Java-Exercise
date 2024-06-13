
//Write a Program to Subject Percentage using Marks of three subjects(marks are out of 100)
import java.util.Scanner;

public class Set1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Marks of 3 Subjects : ");
        float a1, a2, a3, percentage;
        a1 = s.nextFloat();
        a2 = s.nextFloat();
        a3 = s.nextFloat();
        percentage = (a1 + a2 + a3) / 3;
        System.out.println("Percentage is : " + percentage);
        s.close();
    }
}