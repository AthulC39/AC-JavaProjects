import java.util.ArrayList;
import java.util.Random;


public class task1
{
    public static void main(String[] args)
    {
        int upperbound=100; //limit to random numbers
           Random rand = new Random();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int int_random = rand.nextInt(upperbound); 
        for(int i=0; i<10; i++)
        {
           
            nums.add((upperbound-i) + int_random);
        }
        for(int i=0; i<10; i++)
        {
            System.out.println(nums.get(i));
        }
    }
}
