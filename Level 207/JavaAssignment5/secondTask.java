
import java.util.Scanner;

public class secondTask{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Enter a number to be squared");
int number=input.nextInt();

if (number>0) {
    System.out.print("Your number squared is: " + number*number);
}
else {
        System.out.print("Please enter a positive number");
        number=input.nextInt();
    
    }
}}







