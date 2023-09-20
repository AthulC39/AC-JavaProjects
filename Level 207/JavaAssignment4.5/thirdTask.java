
import java.util.Scanner;

public class thirdTask{

public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Enter 5 integers: ");
int number1=input.nextInt();
int number2=input.nextInt();
int number3=input.nextInt();
int number4=input.nextInt();
int number5=input.nextInt();
int Sum= number1 + number2 + number3 + number4 + number5;
int average= (number1 + number2 + number3 + number4 + number5)/5;
System.out.println("The sum of your 5 numbers is " + Sum);
System.out.println("The Average of your 5 numbers are " + average);
}
}


