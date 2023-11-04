package calculator45;
import java.util.Scanner;
public class Calculator45 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your first number : ");
        int a = sc.nextInt();
        System.out.print("Enter you second number : ");
        float b = sc.nextFloat();
        
        
        float c = a+b;
        
        System.out.println(" The total amount is " + c);
    }
    
}
