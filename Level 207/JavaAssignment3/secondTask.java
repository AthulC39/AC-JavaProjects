
import java.util.Scanner;

public class secondTask{

public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.print("Enter three different numbers");
int number1= input.nextInt();
int number2= input.nextInt();
int number3= input.nextInt();
int largestNumber;
if (number1>number2){
     largestNumber=number1;
}else{ 
    if (number2>number3){
        largestNumber=number2;
    }else{
        largestNumber=number3;
    }
} 
System.out.print("Your largest number is " + largestNumber);
}
}