 import java.util.Scanner;
public class BillCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the price of pencil: ");
    float pencilPrice = sc.nextFloat();
    System.out.print("Enter the price of pen: ");
    float penPrice = sc.nextFloat();
    System.out.print("Enter the price of eraser: ");
    float eraserPrice = sc.nextFloat();
    float totalPrice = pencilPrice + penPrice + eraserPrice;
    System.out.println("Total price of pencil, pen and eraser is: " + totalPrice);
  }
  
}
