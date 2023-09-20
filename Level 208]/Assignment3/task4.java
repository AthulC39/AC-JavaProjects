
import java.util.Scanner;
public class task4
{
 

 public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
    String s=input.nextLine();
    boolean stat=false;
    if(s.charAt(s.length()-1)=='y')
    {
        if(s.charAt(s.length()-2)=='l')
        {
            System.out.println("true");
             stat= true;
        }
    }
    if(stat==false){
      System.out.println("false");  
    }
    
  
 }

  }
        
 


