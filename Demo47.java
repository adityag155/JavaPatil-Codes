class Rectangle {
double width, length;

Rectangle(double w, double l) {
width = w;
length = l;
}
}

class MyLogic {
void area(Rectangle r) {
double area = r.width * r.length; 
System.out.println("Area of Rectangle = " + area);
}

void perimeter(Rectangle r) {
double perimeter = 2 * (r.width + r.length); 
System.out.println("Perimeter of Rectangle = " + perimeter);
}
}

public class Demo47 {
public static void main(String args[]) {

Rectangle rect = new Rectangle(10, 20);
MyLogic ml = new MyLogic();

ml.area(rect);
ml.perimeter(rect); 
}
}

/*
O/P:
Area of Rectangle = 200.0
Perimeter of Rectangle = 60.0
*/