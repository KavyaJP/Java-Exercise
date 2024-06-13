
//Write a Program to ask user his/her name and greet them with text “Hello <name>, have a good day”
import java.util.Scanner;

public class Set1_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = s.nextLine();
        System.out.println("Hello " + name + ", have a good day");
        s.close();
    }
}