class MyThread1 implements Runnable {
    Thread t;
    Thread obj;

    MyThread1(String tname, Thread obj) {
        this.obj = obj;
        t = new Thread(this, tname);
        t.start();
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(t.getName() + " " + i);
            try {
                Thread.sleep(1000);
                if (i == 5)
                    obj.join();

            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

class MyThread2 implements Runnable {
    Thread t;
    Thread obj;

    MyThread2(String tname, Thread obj) {
        this.obj = obj;
        t = new Thread(this, tname);
        t.start();
    }

    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(t.getName() + " " + i);
            try {
                Thread.sleep(1000);
                if (i == 15)
                    obj.join();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

class MyThread3 implements Runnable {
    Thread t;
    Thread obj;

    MyThread3(String tname, Thread obj) {
        this.obj = obj;
        t = new Thread(this, tname);
        t.start();
    }

    public void run() {
        for (int i = 21; i <= 30; i++) {
            System.out.println(t.getName() + " " + i);
            try {
                Thread.sleep(1000);
                if (i == 25)
                    obj.join();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}

class DemoThread11 {
    public static void main(String args[]) {
        Thread thread1 = new Thread(new MyThread1("One", Thread.currentThread()));
        Thread thread2 = new Thread(new MyThread2("Two", Thread.currentThread()));
        Thread thread3 = new Thread(new MyThread3("Three", Thread.currentThread()));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}