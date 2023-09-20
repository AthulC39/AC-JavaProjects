import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class task2
{
    public static void main(String[] args)
    {
        int upperbound=100; //limit to random numbers
           Random rand = new Random();
           Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int int_random = rand.nextInt(upperbound); 
        for(int i=0; i<10; i++)
        {
           
            nums.add((upperbound-i) + int_random);
        }
        System.out.print("ArrayList: [");
        for(int i=0; i<nums.size(); i++)
        {
            System.out.print(nums.get(i) + ",");
            if(i==nums.size()-1)
            {
            System.out.print("]");
            }
        }
        System.out.println("Enter Value to find: ");
        int value= input.nextInt();
        for(int i=0; i<nums.size(); i++)
        {
            if(value==nums.get(i))
            {
              System.out.println("Value: " + nums.get(i) + " is in the array list");
              break;
            }
        }
        
    }
}
