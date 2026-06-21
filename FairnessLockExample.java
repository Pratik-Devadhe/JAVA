import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class FairnessLockExample {
    private Lock lock = new ReentrantLock(true);

    public void accessResource(){
        lock.lock();

        try{
            System.out.println(Thread.currentThread().getName() + " is accesing lock");
            // Thread.sleep(1000);
        }catch(Exception e){
            System.err.println("error :" + e);
        }finally{
            System.err.println(Thread.currentThread().getName() + " is releasing lock");
            lock.unlock();
        }

    }
    public static void main(String[] args){

        FairnessLockExample example = new FairnessLockExample();

        Runnable task = new Runnable() {
            
            public void run(){
                example.accessResource();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");
        Thread t4 = new Thread(task, "Thread 4");
        Thread t5 = new Thread(task, "Thread 5");
        Thread t6 = new Thread(task, "Thread 6");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}
