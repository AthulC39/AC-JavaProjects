

public class Square extends Rectangle
{
    double side;
    public Square(){
        side=1.0;
    }
      void setSide(double a){
     side=a;
      
  }
  public double getSide(){
      return side;
    }
  public double getArea(){
      area= side*side;
      return area;
  }
  public double getPerimeter(){
      perimeter=side*4;
      return perimeter;
  }
}
