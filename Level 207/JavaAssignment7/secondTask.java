import java.util.Scanner;

public class secondTask{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
System.out.println("Please enter your mark value");
String value=mark(input.nextInt());
System.out.println(value);
    }
    public static String mark(int a) {
      String result="blank";
        if (a>=50 && a<=59)
        {
             result="fail";
            }     
        
       else if(a>=60 && a<=69)
       {
            result="D";
        }   
        else if(a>=70 && a<=79)
        {
            result="C";
        }
        else if(a>=80 && a<=89)
        {
            result="B";
        }
        else if(a>=90 && a<=94)
        {
            result="A";
        }
        else if(a>=95)
        {
            result="A+";
        }
        
       return result;

  }   
}
         
    

