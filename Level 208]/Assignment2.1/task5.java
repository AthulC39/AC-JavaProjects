import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class task5
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
        swap(nums);
        System.out.print("ArrayList: [");
        for(int i=0; i<nums.size(); i++)
        {
            System.out.print(nums.get(i) + ",");
            if(i==nums.size()-1)
            {
            System.out.print("]");
            }
        }
       
        
    }
    public static void swap(ArrayList<Integer> nums)
    {
        for(int i=0; i<nums.size()-1; i++)
        {
          int temp =nums.get(i+1); 
           nums.set(i+1,nums.get(i));
           nums.set(i,temp);
           
        }
    }
}
