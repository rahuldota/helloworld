import java.lang.*;
import java.util.*;



class Circle{

public double radius;


public double areaOfCircle()
{
double area;
area=3.14*radius*radius;
return area;
}
public double parameterOfCircle()
{
double parameter;
parameter=2*3.14*radius;
return parameter;
}
}

public class NewClass{

public static void main(String arg[])
{
        
    Circle c1=new Circle();
      c1.radius=7;

System.out.println(c1.areaOfCircle());



}



}


