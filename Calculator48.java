
package calculator48;
import java.util.Scanner;
public class Calculator48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        
        
        if(a<=b) {
            System.out.println("The first number should be less than second");
        }else{
            System.out.println("The second number should be less than first");
        }
    }
    
}
