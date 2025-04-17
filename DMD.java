class First
{
void meth()
{
System.out.println("meth defined in first class");
}
}
class Second extends First
{
void meth()
{
System.out.println("meth defined in second class");
}
}

class Third extends First
{
void meth()
{
System.out.println("meth defined in third class");
}
}

class Myclass
{
void myMeth(First f)
{
f.meth();
}
}

class Demo
{
public static void main(String args[])
{
First f=new First();
Second s=new Second();
Third t=new Third();

MyClass m=new MyClass();
m.myMeth(f);
m.myMeth(s);
m.myMeth(t);
}
}