
package calculator47;
import java.util.Scanner;
public class Calculator47 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first number");
        int a = sc.nextInt();
        System.out.println("Enter your second number");
        int b = sc.nextInt();
        
        
       
        if(a>=b) {
              System.out.println("The first number should be greater than second");
        }else{
            System.out.println("The 2nd number should be greater than first");
        }
    }
    
}
