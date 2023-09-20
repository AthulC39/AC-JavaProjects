public class invoiceItem{
    String id;
    String desc;
    int qty;
    double unitPrice;
    
    public String getID(String a){
        id=a;
        return id;
    }
    public String getDesc(String a){
        desc=a;
        return desc;
    }
    public int getQty(int a){
        qty=a;
        return qty;
    }
    public void setQty(int a){
        qty=a;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double a){
        unitPrice=a;
    }
    public double getTotal(){
        return unitPrice*qty;
    }
    
    
    
    
    
    
    
    
    
}