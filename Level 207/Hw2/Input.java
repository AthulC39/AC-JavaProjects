
import java.util.Scanner;

public class Input{

public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Enter first number: ");
int numberOne=input.nextInt();
System.out.println("Enter second number: ");
int numberTwo=input.nextInt();
System.out.println("Enter third number ");
int numberThree=input.nextInt();
int result=(numberOne + numberTwo + numberThree)/2;
System.out.println("The result is "+result);
} 
}