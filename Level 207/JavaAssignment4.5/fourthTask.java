
import java.util.Scanner;

public class fourthTask{

public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Select a number to print cubes up to");
int Limit=input.nextInt();
for (int i=1; i<=Limit; ++i) {
   System.out.println("Number is: " + i + " and the cube of it is " + i * i * i); 
}
}
}


