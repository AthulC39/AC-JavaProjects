import java.util.ArrayList;
import java.util.Random;
import java.util.Collection;

public class task4
{
    public static void main(String[] args)
    {
    
        ArrayList<String> words = new ArrayList<String>();
    
            words.add("Alphabet starts with a");
            words.add("then e");
        words.add("then f");
       words.add("then d");
       words.add("then goes to b");
       words.add("then c");
       words.add("then j");
       words.add("then h");
       words.add("then i");
       words.add("then g");
       
        Collections.sort(words);
       
        for(int i=0; i<10; i++)
        {
            System.out.println(nums.get(i));
        }
    }
}
