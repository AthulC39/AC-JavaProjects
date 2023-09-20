

public class Circle
{
     double radius;
     double area;
  double perimeter;
  public Circle()
  {
      radius=1.0;
  }
  void setRadius(double a){
      radius=a;
      
  }
  public double getRadius(){
      return radius;
    }
  public double getArea(){
      area= 3.14*(radius*radius);
      return area;
  }
  public double getPerimeter(){
      perimeter=2*3.14*radius;
      return perimeter;
  }
  }

   
