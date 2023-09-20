
import java.util.Scanner;


public class secondTask{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Enter 3 different integers to create a count loop");
System.out.print("Enter a small, medium, then large number in order");
int End=input.nextInt();
int numberOne=input.nextInt();
int numberTwo=input.nextInt();
int numberThree=numberOne+numberTwo;
System.out.println("Printing numbers");
System.out.println(numberOne);
System.out.println(numberTwo);
for (int i=numberOne; i<=End; ++i) {
    
    System.out.println(numberThree);
    numberOne=numberTwo;
    numberTwo=numberThree;
    numberThree=numberOne+numberTwo;

}
 }   
}

        
    
        
    
