
import java.util.Scanner;

public class secondTask{
    static int amount=50;

public static void main(String[] args){
     Scanner input= new Scanner(System.in);
     AddAmount obj = new AddAmount();
   
     System.out.println("I didn't do my chores this week, so I didn't get my allowance");
     System.out.println("My piggy bank balance is :");
     obj.noPAdd();
     System.out.println("I did my chores and got my allowance. My piggy bank balance is: ");
     obj.Add(10);

}
public  static class AddAmount{
  public void noPAdd(){
   int value=0;
    amount += value;
    System.out.println("$" + amount);
  }
  public void Add(int a){
      amount += a;
      System.out.println("$" + amount);
  }
   
}    
}





