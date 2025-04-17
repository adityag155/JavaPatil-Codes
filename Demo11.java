class CylinderArea
{
double radius;
CylinderArea(double radius)
{
   this.radius=radius;
}

void crossSectionalArea()
{

System.out.println("Cross Sectional area:"+3.14*radius*radius);
}
}
class CylinderVolume extends CylinderArea
{
double height;
CylinderVolume(double radius,double height)
{

super(radius);
this.height=height;
}

void volume()
{

System.out.println("Volume:"+3.14*radius*radius*height);
}
}
class Demo11
{
public static void main(String args[])
{
CylinderVolume cv=new CylinderVolume(10,25);

cv.crossSectionalArea();
cv.volume();		
}

}