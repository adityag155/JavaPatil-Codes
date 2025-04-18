class MyThread implements Runnable
{
Thread t;

MyThread(String tname)
{
t=new Thread(this, tname);
t.start();
}

public void run()
{
for(int i=1;i<=4;i++)
{
System.out.println(t.getName()+":"+i);

try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{}
}
}
}


class ThreadDemo1
{
public static void main(String args[])
{
new MyThread("One");
new MyThread("Two");
new MyThread("Three");
}
}

/*
O/P:
One:1
Three:1
Two:1
Three:2
One:2
Two:2
Three:3
One:3
Two:3
Three:4
One:4
Two:4
*/