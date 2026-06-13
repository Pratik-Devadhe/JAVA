import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class ReentrantExample{

    private final Lock lock = new ReentrantLock();
    
    public void outerMethod(){
        try{
            lock.lock();
            System.out.println("Outer Method");
            innerMethod();

        }catch(Exception e){

        }finally{
            lock.unlock();
        }
    }

    public  void innerMethod() {
        try{
            lock.lock();
            System.out.println("Inner Method");
        }finally{
            lock.unlock();
        }
    }
    public static void main(String[] agrs){

        ReentrantExample example = new ReentrantExample();

        example.outerMethod();

    }
}
