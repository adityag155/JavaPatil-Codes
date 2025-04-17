import java.util.*;
class Cylinder
{
double radius,height;
Cylinder(double radius, double height)
this.radius=radius;
this.height=height;
}
}
class CylinderResult
{
double area,volume;
CylinderResult(Double area, double volume)
{
this.area=area;
this.volume=volume;
}
}
class MyLogic
{
CylinderResult calculate(Cylinder c)
{

double area=3.14*c.radius*2;
double volume=3.14*c.radius*2*c.height;

CylinderResult r=new CylinderResult(area,volume);
return r;
}
}
Class CalCylinder
{
Punlic static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter Radius");
double radius=sc.nextInt();

System.out.println("Enter height");
double height=sc.nextInt();

Cylinder c=new Cylinder(radius,height);

CylinderResult res;
MyLogic m=new MyLogic();
res=m.calculate(c);

System.out.println("The area of Cylinder"+c.radius+"and" +c.height+"is"+res.volume);
}
}