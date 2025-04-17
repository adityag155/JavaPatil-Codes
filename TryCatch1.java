class TryCatch1{
public static void main(String args[]){

try
{
int m=100, n=Integer.parseInt(args[2]);
int k=m/n;
System.out.println("K="+k);
}

catch(ArithmeticException e)
{
System.out.println("Can't divided by zero");
}
System.out.println("After catch");
}
}