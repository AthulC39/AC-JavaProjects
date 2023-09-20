import java.util.Scanner;

public class firstTask{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
int []array= new int[10];
System.out.println("Please enter 10 integers");
for (int i=0; i<=array.length; ++i) {

     array[i] =input.nextInt();
    System.out.println(array[i]);
}
}
}