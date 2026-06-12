class Counter {

    private int count;

    Counter (int count){

        this.count = count;

    }

    public void Increment(){
        
        synchronized(this){  // allow only one thread at a time
            count++;
        }
        
    }

    public int getCount(){
        return count;
    }
}

class MyThread extends Thread {

        private Counter counter;

        MyThread(Counter count){
            this.counter = count;
        }

        public void  run(){
            for(int i =0; i < 1000; i++){
                counter.Increment();
            }
        }
}


public class ThreadSynchronization {
    public static void main(String[] args){

        Counter counter = new Counter(0);
        
        Thread t1= new MyThread(counter);
        Thread t2 = new MyThread(counter);

        t1.start();

        t2.start();

        try{
            t1.join();
            t2.join();

        }catch (InterruptedException e){
            System.out.print(e);
        }

        System.out.println(counter.getCount());
    }
}
