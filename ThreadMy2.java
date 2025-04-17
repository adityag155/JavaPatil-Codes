class ThreadLogic1 implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(Thread.currentThread().getName()+":"+i);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{}
}
}
}

class ThreadLogic2 implements Runnable
{
public void run()
{
for(int i=11;i<=20;i++)
{
System.out.println(Thread.currentThread().getName()+":"+i);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{}
}
}
}

class MyThread
{
Thread t1,t2;
MyThread(String tname1,String tname2)
{
t1=new Thread(new ThreadLogic1(),tname1);
t2=new Thread(new ThreadLogic2(),tname2);

t1.start();
t2.start();
}
}

class ThreadMy2
{
public static void main(String args[])
{
new MyThread("One","Two");
}
}

/*
O/P
One:1
Two:11
One:2
Two:12
One:3
Two:13
One:4
Two:14
One:5
Two:15
One:6
Two:16
One:7
Two:17
One:8
Two:18
One:9
Two:19
One:10
Two:20
*/