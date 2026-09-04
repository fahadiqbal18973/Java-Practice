import java.util.Scanner;
public class ResultStatus
{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the obtained marks: ");
    int marks = sc.nextInt();
    String status = marks >= 33 ? "pass" : "fail";
    System.out.println("Status: " + status);
  }
}
