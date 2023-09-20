import java.util.Scanner;

public class fourthTask{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Please print 10 numbers");
int []array= new int[10];
int sum = 0;
for (int i=0; i<=9; ++i) {
     array[i] =input.nextInt();
   
}
for (int i=0; i<=9; ++i) {
    sum= sum + array[i];
}
System.out.print("The sum of the entered array is :" + sum);
}
}