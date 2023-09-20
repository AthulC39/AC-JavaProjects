
import java.util.Scanner;


public class Thirdtask
{

public static void main(String[] args)
{
    Scanner input= new Scanner(System.in);
 System.out.println("Enter your Earth Weight: ");
 int number= input.nextInt();
 System.out.println("Please enter the corresponding number to the planet you would like to convert to. 1.Venus, 2.Mars, 3.Jupiter,4.Saturn, 5.Uranus,6.Neptune");
 int planetNumber=input.nextInt();
 if (planetNumber==1) {
    System.out.print("Your weight on Venus is " + number * 0.87); 
 }
 if (planetNumber==2) {
     System.out.print("Your weight on Venus is " + number * 0.39);
 }
 if (planetNumber==3) {
     System.out.print("Your weight on Jupiter is " + number * 2.65);
 }
 if (planetNumber==4) {
     System.out.print("Your weight on Saturn is " + number *1.17);
 }
 if (planetNumber==5) {
     System.out.print("Your weight on Uranus is " + number * 1.05);
 }
 if (planetNumber==6) {
     System.out.print("Your weight on Neptune is " + number * 1.23);
 }
}
}