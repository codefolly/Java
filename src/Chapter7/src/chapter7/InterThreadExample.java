//2082/01/09

package chapter7;

import java.util.logging.Level;
import java.util.logging.Logger;

class SharedPrinter{
   SharedPrinter sp;
    public synchronized void printer(int i){
        if(i%2==0){
            System.out.println(Thread.currentThread().getName()+ ":"+i);
            notify();
            try {
                wait();
            } catch (InterruptedException ex) {
               // Logger.getLogger(SharedPrinter.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
            
        }
    else{
            System.out.println(Thread.currentThread().getName()+ ":"+i);
            notify();
            try {
                wait();
            } catch (InterruptedException ex) {
              //  Logger.getLogger(SharedPrinter.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
            
        }
    }
    
}
class EvenThread extends Thread{

    SharedPrinter sp;
    public EvenThread(SharedPrinter sp){
        this.sp = sp;
    }
    @Override
    public void run(){
        for(int i=10 ; i<=50 ; i++){
            if(i%2==0){
                sp.printer(i);
                
            }
        }
    }
    
}
class OddThread extends Thread{

SharedPrinter sp;
    public OddThread(SharedPrinter sp){
        this.sp = sp;
    }
@Override
    public void run(){
      for(int i=10 ; i<=50 ; i++){
            if(i%2!=0){
                sp.printer(i);
                
            }
        }
    }
    
}
public class InterThreadExample {
    public static void main(String[] args) {
        SharedPrinter sp = new SharedPrinter();
        EvenThread e = new EvenThread(sp);
        OddThread o = new OddThread(sp);
        e.setName("Even Thread");
        o.setName("Odd Thread");
        e.setPriority(10);
        o.setPriority(1);
        e.start();
        o.start();
        
    
}
}
 