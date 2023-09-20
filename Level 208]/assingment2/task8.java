
import java.util.Scanner;
public class task8
{
 

 public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
     String s =input.nextLine();
     int reps=0;
     for(int i=0; i<s.length(); i++)
     {
         char ch=s.charAt(i);
         if(ch==i)
         {
             reps++;
         }
     }
    System.out.println(reps);
 }

  }
        
 


