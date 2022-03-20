// Find the Greatest of the Two Numbers
import java.util.Scanner;
public class Q5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  First number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
       if (a==b){
           System.out.println("Both are equal");
       }
       else if (a>b){
           System.out.println("First number is greater");
       }
       else{
           System.out.println("Second number is greater");
       }
       }
    }

