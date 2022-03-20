//Find the Sum of First N Natural Numbers
//Formula to Find the Sum of N terms
//Sum = ( Num * ( Num + 1 ) ) / 2

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = (num * (num + 1)) / 2;
        System.out.println("Sum of first " + num + " natural numbers is " + sum);
    }
    
}
