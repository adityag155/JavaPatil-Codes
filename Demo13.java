class Rectangle
{
double width,length;
Rectangle(double w, double l)
{
width=w;
length=l;
}
}

class Triangle
{
double base,height;
Triangle(double b, double h){
base=b;
height=h;
}
}

class Area
{
double rectangleArea;
double triangleArea;

Area(doule rectArea, double triArea)
{
rectangleArea=rectArea;
triangleArea=triArea;
}
}

class MyLogic
{
Area calculate(Rectangle r, Triangle t)
{
double rectArea=r.width*r.length;
double triArea=0.5*t.base*t.height;
return new area(rectArea, triArea);
}
}
class Demo13
{
public static void main(String args[])
{

Rectangle rectangle=new Rectangle(10,20);
Triangle triangle=new Triangle(30,40);

Mylogic MyLog=new MyLogic();
Area result=MyLog.calculate(rectangle,triangle);

System.out.println("Rectangle Area:"+result.RectangleArea);
System.out.println("Triangle Area:"+result.TriangleArea);
}
}
