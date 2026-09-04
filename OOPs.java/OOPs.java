

public class OOPs {
  public static void main(String args[]){
    Pen p1 = new Pen();  // created a  Pen object
    p1.setcolor("blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);

    BankAccount myAccount = new BankAccount();
    myAccount.username = "fahad";
    myAccount.setPassword("12345"); 
    // This line will cause an error because password is private

  }


  
}

class BankAccount{
  public String username;
  private String password;
  public void setPassword(String pwd){
    password = pwd;
  }
}
class Pen{
  String color;
  int tip;


  void setcolor(String newColor){
    color = newColor;
  }
  void setTip(int newTip){
    tip = newTip;
  }
}


class Student {
  String name;
  int age;
  float percentage;

  void calcPercentage(int phy   , int chem , int maths ){
    percentage = (phy + chem + maths) / 3;
  } 
}
