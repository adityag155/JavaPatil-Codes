class CylinderArea
{
double radius;
CylinderArea(double radius)
{
this.radius=radius;
}
void area()
{
System.out.println("Areaof cylinder="+3.14*radius*radius);
}
}
class CylinderVolume extends CylinderArea


{
double height;
CylinderVolume(double radius, double height)
{
super(radius);
this.height=height;
}
void volume()
{
System.out.println("Volume of cylinder=" + 3.14*radius*radius*height); 

}
}
class Demo
{
public static void main(String args[])
{
CylinderVolume cv=new CylinderVolume(10,20);
cv.area();
cv.volume();
}
}




