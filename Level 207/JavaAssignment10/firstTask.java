import java.util.Scanner;
import java.util.Random;
public class firstTask{
public static void main(String[] args){

Scanner SC= new Scanner(System.in);
Random rand = new Random();

int minRange = 1, maxRange = 12;

int player= rand.nextInt(maxRange-minRange) + minRange;
int dealer = rand.nextInt(maxRange-minRange) + minRange;

System.out.println("Welcome to BlackJack");

System.out.println("You drew: " + player);
System.out.println("Dealer drew: " + dealer);

  }   
}
         
    

