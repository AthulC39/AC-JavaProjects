public class Account{
    String id;
    String name;
    int balance=0;
    public String getID(String a){
        return id;
    }
    public String getName (String a){
        return name;
    }
    public int getbalance(int a){
        return balance;
    }
    public int credit(int a){
        int credit=a;
        credit += balance;
        return credit;
    }
    public int debit(int a){
        int debit=a;
        if (debit<=balance){
            balance -= debit;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(String anotherAccountBalance, int a){
      if (a<=balance){
            anotherAccountBalance += a;
        }
        else{
            System.out.println("Amount exceeded balance");
        }
        return balance;  
    }
    
    
    
    
    
    
    
    
    
    
    
}