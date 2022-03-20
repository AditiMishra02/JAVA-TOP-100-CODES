
// Find the greatest among three numbers
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        System.out.println("Enter Third number");
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("All are equal");
        } else if (a > b && a > c) {
            System.out.println("First number is greater");
        } else if (b > a && b > c) {
            System.out.println("Second number is greater");
        } else {
            System.out.println("Third number is greater");
        }
    }

}
