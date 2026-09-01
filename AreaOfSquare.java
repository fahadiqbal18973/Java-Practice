import java.util.Scanner;
public class AreaOfSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the side of the square(in cm): ");
    float side = sc.nextFloat();
    float area = side * side;
    System.out.println("The area of the square is: " + area + " square units.");
  }
  
}
