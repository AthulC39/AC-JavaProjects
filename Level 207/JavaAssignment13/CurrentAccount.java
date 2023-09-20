 
public class CurrentAccount extends Account
{
   static double overdraftLimit;
   public static double setOverdraftLimit(double a){
       overdraftLimit=a;
       return overdraftLimit;
   }
}
