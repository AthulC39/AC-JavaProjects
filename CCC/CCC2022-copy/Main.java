import java.util.*;

 
public class Main
{
     public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
    System.out.println(number(input.nextInt()));
}
public static int number(int a)
{
    int ways=0;
   if(a==10)
   {
       ways++;
   }
   if(a==9)
   {
       ways++;
   }
   if(a==8)
   {
       ways++;
   }
    
   return ways;
    }
   
}

