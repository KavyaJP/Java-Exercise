
//Write a Program to see if the number entered by user is integer or not
import java.util.Scanner;

public class Set1_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        boolean isInteger = s.hasNextInt();
        System.out.println(isInteger);
        s.close();
    }
}