import java.util.Scanner; 
public class FeverChecker {
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the temperature in Fahrenheit: ");
    float temp = sc.nextFloat();
    if(temp > 100){
      System.out.println("You have a fever.");
    } else {
      System.out.println("You do not have a fever."); 

    }
      
  }
  
}
