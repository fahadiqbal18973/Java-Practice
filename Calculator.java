import java.util.Scanner; 
public class Calculator{
  public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    char operator;
    System.out.print("Enter the operator (+, -, *, /): ");
    operator = sc.next().charAt(0);
    int result;
    switch(operator){
      case '+':
        result = a + b;
        System.out.println("The sum is: " + result);
        break;
      case '-':
        result = a - b;     
    System.out.println("The difference is: " + result);
        break;
      case '*':
        result = a * b;
        System.out.println("The product is: " + result);
        break;  
      case '/':
        if(b != 0){
          result = a / b;
          System.out.println("The quotient is: " + result);
        } else {
          System.out.println("Error: Division by zero is not allowed.");  
        }
  }
}

  
}
  
  
