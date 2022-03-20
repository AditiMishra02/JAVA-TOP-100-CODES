
// Swapping without third variable
import java.util.Scanner;
public class Q8 {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter  First number");
      int a = sc.nextInt();
      System.out.println("Enter Second number");
      int b = sc.nextInt();
      System.out.println("Before swapping");
      System.out.println("First number is " + a);
      System.out.println("Second number is " + b);

      // suppose a = 10 and b = 20
      a = a + b; // a= a+b; a=30
      b = a - b; // b=a-b; b=10
      a = a - b; // a=a-b; a=20
      //thus a = 20 and b = 10

      System.out.println("After Swapping");
      System.out.println("First number is " + a);
      System.out.println("Second number is " + b);
   }
}
