class Figure
{
double dim1,dim2;
Figure(double d1)
{
dim1=d1;
}
Figure(double d1, double d2) 
{
dim1=d1;
dim2=d2;
}

void area()
{
System.out.println("Area in figure class");
}
}

class Rectangle extends Figure
{
Rectangle(double width, double length)
{
super(width,length);
}

void area()
{
System.out.println("Area of Rectangle=" +dim1*dim1);
}
}

class Triangle extends Figure
{
Triangle(double base, double height)
{
super(base,height);
}
void area()
{
System.out.println("Area of Triangle="+0.5*dim1*dim2);
}
}
class MyClass
{
void myArea(Figure f)
{
f.area();
}
}

class Demo
{
public static void main(String args[])
{
Rectangle rect=new Rectangle(10,20);
Triangle t=new Triangle(5,10);

MyClass m=new MyClass();
m.myArea(rect);
m.myArea(t);
}
} 