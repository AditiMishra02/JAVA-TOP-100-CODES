
// Swapping two numbers using third variable
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        System.out.println("Before swapping");
        System.out.println("First number is " + a);
        System.out.println("Second number is " + b);
        int num = a;
        a = b;
        b = num;

        System.out.println("After Swapping");
        System.out.println("First number is " + a);
        System.out.println("Second number is " + b);
    }
}