
import java.util.Scanner;

public class firstTask{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("A number between 1 and 10 has been chosen. Try to guess what the number is.");
int guess=input.nextInt();
int i=3;
int guess2;
while (i!=guess) {
System.out.println("That number isn't it, please try again.");
guess=input.nextInt();
if (i==guess) {
break;
}
}
System.out.print("That guess was correct!Nice!");
}
}





