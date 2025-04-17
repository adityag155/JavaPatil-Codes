class First
{
int a=100;
}

class Second extends First
{
int a=200;

void access()
{
System.out.println(super.a);
}
}

Class Demo
{
public static void main(String args[])
{
Second s=new Second();
System.out.println(s.a);
s.access();
}
}