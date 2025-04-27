//2081/12/28

//threads example 
//this is single threaded process

package chapter7;
class ExampleThreads extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running.... ");
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread t = Thread.currentThread(); // check whick thread is running
                System.out.println(i+":"+t.getName());
                Thread.sleep(600);
            } catch (InterruptedException ex) {
               // Logger.getLogger(ExampleThresds.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
    }
}

public class ThreadsMains {
    public static void main(String[] args) {
         ExampleThreads e1 = new ExampleThreads();
         ExampleThreads e2 = new ExampleThreads();
         ExampleThreads e3 = new ExampleThreads();
         e1.start();
         e2.start();
         e3.start();
    }
    
}
