//2082/01/02

package chapter7;

import java.util.logging.Level;
import java.util.logging.Logger;


  class ThreadExample extends Thread{
    
    @Override
    public void run(){
        for(int i=10;i<=20;i++){
            System.out.println(i);
             try {
                 //Thread t = Thread.currentThread(); // check whick thread is running
                //System.out.println(i+":"+t.getName()); 
                
                 System.out.println(Thread.currentThread().getName() + " : "+i);
                Thread.sleep(600);
            } catch (InterruptedException ex) {
               // Logger.getLogger(ExampleThresds.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
        
    }
}
class ThreadExamples extends Thread{
    
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
             try {
                 //Thread t = Thread.currentThread(); // check whick thread is running
                //System.out.println(i+":"+t.getName()); 
                
                 System.out.println(Thread.currentThread().getName() + " : "+i);
                Thread.sleep(600);
            } catch (InterruptedException ex) {
               // Logger.getLogger(ExampleThresds.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
        
    }
}

public class MultiThreadind {
    public static void main(String[] args) {
       ThreadExample t = new ThreadExample(); // thread is create here .
       ThreadExamples t1 = new ThreadExamples();
   
       t.setName("one");
       t1.setName("two");
       
        System.out.println("t priority is: "+t.getPriority());
        System.out.println("t1 priority is :"+t1.getPriority());
        
        t1.setPriority(1);
        t.setPriority(10);
        
       t.start();
       
        try {
            t.join(); // restrict the second thread till the end of task of 1st thread
        } catch (InterruptedException ex) {
           // Logger.getLogger(MultiThreadind.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
       
       t1.start();
        
        
        
    }

   
    
}
    

