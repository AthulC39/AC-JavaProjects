
import java.util.Scanner;
public class task7
{
 

 public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
    String s=input.nextLine();
    if(s.substring(0,3)=="red")
    {
        System.out.print("red");
    }
    else if(s.substring(0,4)=="blue")
    {
        System.out.print("blue");
    }
    else
    {
        System.out.print("-");
    }
    
 }

  }
        
 


