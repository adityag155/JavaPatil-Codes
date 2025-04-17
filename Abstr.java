abstract class First
{
int a;
First(int num)
{
a=num;
}
abstract void meth1();
abstract void meth2();

void meth3()
{
System.out.println("This is meth3");
}
}

class Second extends First
{
int b;

Second(int num1, int num2)
{
super(num1);
b=num2;
}
void meth1()
{
System.out.println("This is meth1");
}
void meth2()
{
System.out.println("This is meth2");
}

void showab()
{
System.out.println("a=" +a+"b="+b);
}
}

class Abstr
{
public static void main(String args[])
{
Second s=new Second(10,11);
s.meth1();
s.meth2();
s.meth3();
s.showab();
}
}