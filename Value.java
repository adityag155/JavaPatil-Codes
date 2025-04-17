class Box
{
double width,height,length;
void volume()
{
System.out.println("Volume="+ width*height*length);
}
}
class Value
{
public static void main(String args[])
{
Box b=new Box();
b.width=10;
b.height=11;
b.length=12;
b.volume();
}
}