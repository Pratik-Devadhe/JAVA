class MyThread  extends Thread{
    public void run(){
        System.out.println("thread is  running");
    }
}

public class ThreadDemo03 {
    public static void main(String[] args){

        Thread t1 = new MyThread();

        
        System.out.println(Thread.currentThread());

        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setName("worker");

        System.out.println(Thread.currentThread().getName());

        System.out.println(t1.isAlive());

        System.out.println(t1.isDaemon());

        System.out.println(t1.isInterrupted());

        t1.interrupt();

        System.out.println(t1.isInterrupted());

    }
}
