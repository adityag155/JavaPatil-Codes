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
Area a=new Area(rectangleArea,trianglleArea)
return a;
}
}


class Demo14
{
public static void main(String args[])
{

Rectangle rect=new Rectangle(10,20);
Triangle t=new Triangle()
}
}
