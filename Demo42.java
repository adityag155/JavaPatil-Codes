class First{
void meth(){
System.out.println("Meth defined in 1st class");
}
}

class Second extends First{
void meth(){
System.out.println("Meth defined in 3rd class");
void access()
}
super.meth();
}

class Third extends First{
void meth(){
System.out.println("Meth defined in 3rd class");
void access()
}
super.meth();
}

class Demo42{
public static void main(String args[]){
Second s=new Second();
s.meth();
s.access

}
}
