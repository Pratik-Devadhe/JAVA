class MyThread  extends Thread{
    public void run(){
        System.out.println("thread is  running");
    }
}

public class ThreadDemo02 {
    public static void main(String[] args){
        Thread t = new MyThread();

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println(e);
        }

        t.start();

        System.out.println(Thread.currentThread().getName());

    }
}
