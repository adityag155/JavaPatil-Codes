abstract class First
{
abstract void meth();
}
class Second extends First
{
void meth()
{
System.out.println("Meth defined in Second claa");
}
}

class Third extends First
{
void meth()
{
System.out.println("Meth defined in Third class");
}
}

class MyClass
{
void myMeth(First f)
{
f.meth();
}
}

class Abstract
{
public static void main(String args[])
{
Second s=new Second();
Third t=new Third();

MyClass m=new MyClass();
m.myMeth(s);
m.myMeth(t);
}
}