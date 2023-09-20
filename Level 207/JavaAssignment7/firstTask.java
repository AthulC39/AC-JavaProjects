import java.util.Scanner;

public class firstTask{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
int counter=0;
for (int i=1;i<=20;++i){
    if (i==3 || i==6 || i==9 || i==12 || i==18) {
        System.out.print("Fizz");
        counter=i;

    }
    if (i==5|| i==10 || i==20) {
    System.out.print("Buzz");
    
    }
    if (i==15) {
    System.out.print("FizzBuzz");
   
    }
    System.out.println(i);
   

    
     
        }
    }
}
             
         
    

