//2081/12/28
//chapter 7 threads in java 

package chapter7;

import java.util.logging.Level;
import java.util.logging.Logger;


class ExampleThresds extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running.... ");
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException ex) {
               // Logger.getLogger(ExampleThresds.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        }
    }
}
public class ThreadsNew {

    public static void main(String[] args) {
        ExampleThresds e = new ExampleThresds();
        e.start();  // we can calll run method in this this is not threading so we calls starts() methods which calls run method
       // e.run(); // if we use this multi threading system will made mistake
    }
    
}
