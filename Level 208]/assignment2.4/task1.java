import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class task1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
         System.out.println("Hello, what currency would you like to convert to from canadian dollar?");
         System.out.println("Please enter the choice of your number");
         System.out.println("1.Rupee");
         System.out.println("2.Euro");
         System.out.println("3.Yen");
         System.out.println("4.Pound");
         System.out.println("5.American Dollar");
         int currency = input.nextInt();
         System.out.println("How much money would you like to convert?");
         double value = input.nextDouble();
         if (currency==1)
         {
             System.out.println(Rupee(value));
         }
         else if (currency == 2)
         {
            System.out.println(Euro(value)); 
         }
         else if (currency == 3)
         {
             System.out.println(Yen(value));
         }
         else if (currency == 4)
         {
           System.out.println(Pound(value));  
         }
         else if (currency == 5)
         {
             System.out.println(ADollar(value));
         }
    }
    public static double Rupee(double a)
    {
     double value=0;
     value = a * 59.04;
     return value;
    }
    public static double Euro(double a)
    {
     double value=0;
     value = a * 0.70;
     return value;
    }
    public static double Yen(double a)
    {
     double value=0;
     value = a * 90.89;
     return value;
    }
    public static double Pound(double a)
    {
     double value=0;
     value = a * 0.59;
     return value;
    }
    public static double ADollar(double a)
    {
     double value=0;
     value = a * 0.79;
     return value;
    }
}
