
import java.util.Scanner;
public class Main
{
 

 public static void main(String[] args)
 {
    Scanner input = new Scanner(System.in);
    int amount1 = input.nextInt();
    String inGroup[]= new String[amount1];  
    for(int i=0; i<=amount1; i++)
    {
        inGroup[i]=input.nextLine();
    }
    int amount2=input.nextInt();  
    String noGroup[]= new String[amount2];
     for(int i=0; i<=amount2; i++)
    {
        noGroup[i]=input.nextLine();
    }
    int amount3=input.nextInt();
   String groups[]= new String[amount3];
     for(int i=0; i<=amount3; i++)
    {
        groups[i]=input.nextLine();
    }
    System.out.println(names(amount3));
 }
 public static int names(int a)
 {
     int violations=0;
     for(int i=0; i<a; i++)
     {
       //if(groups[i].indexOf(inGroup[0])  == -1 )
       {
           //violations++;
       }
     }
    return violations;
 }
  }
        
 


