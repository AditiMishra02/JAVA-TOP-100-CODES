//Find the Sum of the Numbers in a Given Interval
//formula used :sum = b*(b+1)/2 – a*(a+1)/2 + a)
import java.util.Scanner;
public class Q4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        int sum = b*(b+1)/2 - a*(a+1)/2 + a;
        System.out.println("Sum of the series is " +sum);
    }
    
}
