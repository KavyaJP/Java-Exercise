
//Write a Java Program to Convert Kilometers to Miles (1 km = 0.62 miles)
import java.util.Scanner;

public class Set1_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Kilometers : ");
        float km = s.nextFloat();
        float miles = km * 0.62f;
        System.out.println(km + " Kilometers = " + miles + " Miles");
        s.close();
    }
}