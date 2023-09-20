
import java.util.Scanner;

 public class firstTask{
    
Scanner input= new Scanner(System.in);
String number;

int list=input.nextInt();
 firstTask()
 {
switch (list) {
    case 1: 
    number= "One";
    break;
    case 2: 
    number= "Two";
    break;
    case 3:
    number= "Buzz";
    break;
    case 4:
    number="Four";
    break;
    case 5:
    number="Fizz";
    break;
    case 6: 
    number="Buzz";
    break;
    case 7:
    number="Seven";
    break;
    case 8:
    number="Eight";
    break;
    case 9:
    number="Buzz";
    break;
    case 10:
    number="Fizz";
    case 11:
    number="Eleven";
    break;
    case 12:
    number="Buzz";
    break;
    case 13:
    number="Thirteen";
    break;
    case 14:
    number="Fourteen";
    break;
    case 15:
    number="FizzBuzz";
     break;
    }
 System.out.println(number);
}
public static void main(String[] args){
    firstTask secondNumber= new firstTask (); 
}
}

