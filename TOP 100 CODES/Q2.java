
//Check Whether a Number is Even or Odd in Java
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Even");

        else
            System.out.println("Odd");
        
    }

}

