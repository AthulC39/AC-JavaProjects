
import java.util.Scanner;

public class fifthTask{

public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Enter an integer to print a multiplication table till 5 ");
int number=input.nextInt();
for (int i=0; i<=5; ++i) {
   System.out.println(number + " x " + i + " = " + number * i); 
}
}
}



