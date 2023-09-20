
public class Rectangle
{
 
  double length;
  double width;
  double area;
  double perimeter;
  public Rectangle()
  {
      length=1.0;
      width=1.0;
  }
  void setLength(double a){
      length=a;
      
  }
  void setWidth(double a){
      width=a;
      
  }
  public double getLength(){
      return length;
  }
  public double getWidth(){
      return width;
  }
  public double getArea(){
      area= length*width;
      return area;
  }
  public double getPerimeter(){
      perimeter=2*(length+width);
      return perimeter;
  }
  }

