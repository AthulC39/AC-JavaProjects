
import java.util.Scanner;
public class task3
{
 

 public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two string");
    String s=input.nextLine();
    String r=input.nextLine();
     
    s=s.replace('t',' ' );
    r=r.replace('t', ' ');
    System.out.println(s.concat(r));
  
 }

  }
        
 


