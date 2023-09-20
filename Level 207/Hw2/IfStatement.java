
import java.util.Scanner;


public class IfStatement{ 
      public static void main(String[] args){
{
    Scanner input= new Scanner(System.in);
   
 System.out.println("Enter your age: ");
 int number=input.nextInt();

 if (number<16) {
     System.out.println("You cannot drive yet");
    }else {
        System.out.println("You can drive");
    }
    if (number<18) {
        System.out.println("You cannot vote yet");
    }else{
        System.out.println("You can vote");
    }
     if (number<25) {
        System.out.println("You cannot rent a car yet");
    }else{
        System.out.println("You can do anything legal");
    }
    }
 }
} 
