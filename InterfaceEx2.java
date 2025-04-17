interface MyInter{
	int num=100;
}

class MyClass implements MyInter{}

public class InterfaceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(MyInter.num);
System.out.println(MyClass.num);
	}

}
