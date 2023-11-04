
package calculator49;
import java.util.Scanner;
public class Calculator49 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your first number");
       int a = sc.nextInt();
       System.out.println("Enter your second number");
       int b = sc.nextInt();
       
       if(a==b) {
           System.out.println("The first and second number are the same");
       } else {
           System.out.println("The first and second number are not the same");
       }
    }
    
}
