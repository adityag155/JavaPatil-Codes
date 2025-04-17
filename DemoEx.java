interface MyInter{
int VAR_NUM=400;
}

class MyClass implements MyInter{
}

class DemoEx{
public static void main(String args[]){
System.out.println(MyInter.VAR_NUM);
}
}