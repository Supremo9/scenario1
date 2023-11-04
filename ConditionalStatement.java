
package conditional.statement;
import java.util.Scanner;
public class ConditionalStatement {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Grade :");
        int grade = s.nextInt();
        
        if(grade < 80) {
            System.out.println("You failed");
        }else{
            System.out.println("You passed");
        }
    }
    
}
