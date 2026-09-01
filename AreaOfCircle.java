import java.util.Scanner;
public class AreaOfCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius of the circle(in cm): ");
    float radius = sc.nextFloat();
    float area = (float) (Math.PI * radius * radius);
    System.out.println("The area of the circle is: " + area + " square units.");
  }
  
}
