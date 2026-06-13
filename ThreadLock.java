import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class  Bank{
    private int balance = 100;

    private Lock lock = new ReentrantLock();

    public void withdraw(int amount){

        System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);
        
            try{
                
                if(lock.tryLock(5000 , TimeUnit.MILLISECONDS)){  // wait until the time is over

                    if(balance >= amount){
                System.out.println(Thread.currentThread().getName() + " is  withdraw " + amount);
                
                balance -= amount;

                try{
                    Thread.sleep(3000);
                }catch(Exception e){
                    Thread.currentThread().interrupt();
                }finally{

                    System.out.println("Remainging balance " + balance);
                    lock.unlock();
                }

            }else{
               System.out.println(Thread.currentThread().getName() + " balance is insufficient" );
            }
                }else{
                    System.out.println(Thread.currentThread().getName() + " cannot withdraw");
                }
            }catch(Exception e){

            }
        
    }
}

public class ThreadLock {

    public static void main(String[] args){

        Bank sbi = new Bank();

        Runnable runnable = new Runnable() {
            public void run(){
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(runnable , "thread 1");
        Thread t2 = new Thread(runnable , "thread 2");

        t1.start();
        t2.start();

    }
}
