class MyThread extends Thread{
            public void run(){

                for(int i=1; i<= 5; i++){
                    System.out.println(i);
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.print(e);
                    }
                }
            }
    }

class ThreadDemo01{

    public static void main(String args[]){

        Thread t1 = new MyThread();

        System.out.println(Thread.currentThread().getName());
        

        t1.start();


        System.out.println("done");




    }

    
}