import java.util.Scanner;

public class Set1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Three Numbers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + sum);
        scanner.close();
    }
}