//2082/01/02
//thread wala 

package chapter7;

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

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadExamples t = new ThreadExamples(); // thread is create here .
        
        ThreadExamples t1 = new ThreadExamples();
        ThreadExamples t2 = new ThreadExamples();
        ThreadExamples t3 = new ThreadExamples();
        
        t.setName("one");
        t1.setName("two");
        t2.setName("three");
        t3.setName("four");
        
       
        
        t1.setPriority(1); // least priority
        t.setPriority(10); // max priority
        t2.setPriority(5);// norm priority 
        t3.setPriority(1);

        System.out.println("t priority is: "+t.getPriority());
        System.out.println("t1 priority is :"+t1.getPriority());
        System.out.println("t2 priority is :"+t2.getPriority());
        System.out.println("t3 priority is :"+t3.getPriority());
        
        
        t.start();  // we can calll run method in this this is not threading so we calls starts() methods which calls run method
       // t.run(); // if we use this multi threading system will made mistake
       
      
       
       t1.start();
       t2.start();
       t3.start();
    }
    
}
