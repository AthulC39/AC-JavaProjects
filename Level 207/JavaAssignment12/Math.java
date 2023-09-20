
import java.util.concurrent.ThreadLocalRandom;
public class  Math extends Marks
{
    
    
   static void getMarks(){
    for(int i=0;i<ScienceMarks.length;i++){
        int randomNum = ThreadLocalRandom.current().nextInt(61, 100 + 1);
        MathMarks[i]= randomNum;
    }
    
    }
}

