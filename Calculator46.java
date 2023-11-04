
package calculator46;
import java.util.Scanner;
public class Calculator46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter you first number");
        double a = sc.nextDouble();
        System.out.println("Enter your second number");
        double b = sc.nextDouble();
        
        double c;
        c = a+b;
        
        System.out.println("Total amount is " + c);
        
    }
    
}
