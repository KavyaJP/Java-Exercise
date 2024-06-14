
//Write the following expression in java program : (𝑣^2−𝑢^2)/2𝑎𝑠
import java.util.Scanner;

public class Set2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r;
        System.out.print("Enter value of u : ");
        float u = sc.nextFloat();
        System.out.print("Enter value of v : ");
        float v = sc.nextFloat();
        System.out.print("Enter value of a : ");
        float a = sc.nextFloat();
        System.out.print("Enter value of s : ");
        float s = sc.nextFloat();
        r = ((v * v - u * u) / (2 * a * s));
        System.out.println("The Answer of Expression (v^2-u^2)/2as is : " + r);
        sc.close();
    }
}