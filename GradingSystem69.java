
package grading.system.pkg69;
import java.util.Scanner;
public class GradingSystem69 {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      
      System.out.print("Enter your average in Calculus 1: ");
      int cal = sc.nextInt();
      System.out.print("Enter your average in Computer Fundamentals: ");
      int comfun = sc.nextInt();
      System.out.print("Enter your average in Computer Programming: ");
      int comprog = sc.nextInt();
      System.out.print("Enter your average in Understanding the Self: ");
      int uts = sc.nextInt();
      System.out.print("Enter your average in Purposive Communication: ");
      int purposive = sc.nextInt();
      System.out.print("Enter your average in Euthenics: ");
      int euthenics = sc.nextInt();
      
      if(cal>=80) {
          System.out.println("Your average in Calculus1 is " + cal +" :You passed!");
      }
      else {
          System.out.println("Your average in Calculus1 is " + cal+ " :You failed!");
      }
      if(comfun>=80) {
          System.out.println("Your average in Computer Fundamentals is "+ comfun +" :You passed!");
      } else {
          System.out.println("Your average in Computer Fundamentals is "+ comfun + " :You failed");
      }
      if(comprog>=80) {
          System.out.println("Your average in Computer Programming is " + comprog +" :You passed");
      }else {
          System.out.println("Your average in Computer Programming is " + comprog +" :You failed!");
      }
      if(uts>=80) {
          System.out.println("Your average in Underatanding The Self is " + uts +" :You passed!");
      } else{
          System.out.println("Your average in Understanding The Self is " + uts +" :You failed!");
      }
      if(purposive>=80) {
          System.out.println("Your average in Purposive Communication is " + purposive +" :You passed!");
      } else {
          System.out.println("Your average in Purposive Communication is " + purposive +" :You failed!");
      }
      if(euthenics>=80) {
          System.out.println("Your average in Euthenics is " + euthenics +" :You passed!");
      } else {
          System.out.println("Your average in Euthenics is " + euthenics +" :You failed!");
      }
      
    }
    
}
