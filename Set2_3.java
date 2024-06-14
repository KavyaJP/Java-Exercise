//Use comparison operator to find out if a give number is greater than number entered by user or not

import java.util.Scanner;

public class Set2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 100;
        System.out.print("Enter a number : ");
        int b = scanner.nextInt();
        System.out.println("My Number is : " + a);
        System.out.println("Your Number is greater than My number : " + (b > a));
        scanner.close();
    }
}
