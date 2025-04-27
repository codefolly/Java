//2082/01/02
// runnable interface

package chapter7;


 class RunnableExamples implements Runnable {
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

public class RunnableDemo {
    public static void main(String[] args) {
       
        RunnableExamples t = new RunnableExamples();
        Thread b = new Thread(t);
        b.start();
        
        RunnableExamples t1 = new RunnableExamples();
        Thread c = new Thread(t1);
        c.start();
       
       
    }
    
}
    

