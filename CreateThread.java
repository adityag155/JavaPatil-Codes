class MyThread implements Runnable
{
Thread t;

MyThread(String tname)
{
t = new Thread(this, tname);
t.start();
}

public void run()
{
for(int i=1;i<=4;i++)
{
System.out.println(t.getName()+":"+i);

try
{
Thread.sleep(10000);
}

catch(InterruptedException ie)
{}
}
}
}

class CreateThread
{
public static void main(String args[])
{
new Thread("One");
new Thread("Two");
new Thread("Three");
}
}