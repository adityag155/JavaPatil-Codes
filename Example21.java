class Figure
{
double dim1,dim2,dim3;

Figure(double d1, double d2, double d3){
dim1=d1;
dim2=d3;
dim3=d3;
}

Figure(double d1, double d2){
dim1=d1;
dim2=d2;
}

Figure(double d1){
dim1=d1;

Figure(double d1, double d2, double d3, int type){
dim1=d1;
dim2=d2;
dim3=d3;
}

void area(){
System.out.println("Area in Figure class");
}
}

class Cube extends Figure{
Cube(double side){
super(side, side, side);
}
void area(){
double area=6*dim1*dim1;
System.out.println("Area of cube="+area);
}
}

class Sphere extends Figure{
double radius;

Sphere(double r){
super(r, 0);
radius=r;
}

void area(){
double area=4.0/3.0*3.14*radius*radius*radius;
System.out.println("Area of sphere="+area);
}
}

class Cylinder extends Figure{
double radius;

Cylinder(double r){
super(r,0);
radius=r;
}

void area(){
double area=3.14*radius*radius;
System.out.println("Area of Cylinder="+area);
}
}

class Cone extends Figure{
double radius;
double length;

Cone(double r, double l){
super(r,0,0);
radius=r;
length=l;
}

void area()
{
double area=.0/3.0*3.14*radius*radius*length;
System.out.println("Area of Cone="+area);
}
}

class MyClass{
void myArea(Figure f){
f.area();
}
}

class Example21{
public static void main(String args[]){

Cube cb=new Cube(10);
Sphere sp=new Sphere(20);
Cylinder cy=new Cylinder(30);
Cone co=new Cone(40,50);

MyClass m=new MyClass();
m.myArea(cb);
m.myArea(sp);
m.myArea(cy);
m.myArea(co);
}
}