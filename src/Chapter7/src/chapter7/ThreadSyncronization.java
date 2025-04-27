//2082/01/05

//example of thread synchronization
package chapter7;

import java.util.logging.Level;
import java.util.logging.Logger;

class BankAcoount {

    int balance = 1000;

    void withdraw(String name, int amount) { //synchronized method is  here  whole method will be synchronized before void 
        synchronized (this) {  //this is synchronized block uses lines for synchronized 
            if (balance >= amount) {
                try {
                    Thread.sleep(600);
                } catch (InterruptedException ex) {
                    //Logger.getLogger(BankAcoount.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                }
                balance = balance - amount;
                System.out.println(name + " has withdrawn " + amount);
                System.out.println("The remaining balance is :" + balance);
            } else {
                System.out.println(name + " has insufficient balance .");
                System.out.println("waiting for deposit.....");
                //deposit("rahul",100);
                try {
                    wait();
                } catch (InterruptedException ex) {
                    //Logger.getLogger(BankAcoount.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex);
                }

            }
        }
    }

    synchronized void deposit(String name, int amount) {
        System.out.println(name + " is depositing ..." + amount);
        balance += amount;
        System.out.println("Balance after deposite " + balance);
        notify();

    }
}

class Person implements Runnable { // also we can do like 

    int amount;
    String name;
    BankAcoount b1;  // this is the shared entity
    boolean iswithdraw;

    Person(BankAcoount b1, int amount, String name, boolean iswithdraw) {
        this.b1 = b1;
        this.amount = amount;
        this.name = name;
        this.iswithdraw = iswithdraw;

    }

    @Override
    public void run() {
        if (iswithdraw) {
            try {
                b1.withdraw(name, amount);
                Thread.sleep(5000);

            } catch (InterruptedException ex) {
                // Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);

            }

        } else {
            b1.deposit("rahul", 100);
        }

    }
}

public class ThreadSyncronization {

    public static void main(String[] args) {

        BankAcoount b2 = new BankAcoount();

        Person p1 = new Person(b2, 600, "ram", true);
        Thread t = new Thread(p1);

        Person p2 = new Person(b2, 500, "hari", true);
        Thread t1 = new Thread(p2);

        Person p3 = new Person(b2, 100, "rahul", false);
        Thread t2 = new Thread(p3);

        t.start();
        t1.start();

        try {

            Thread.sleep(5000);

        } catch (InterruptedException ex) {
            // Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);

        }
        t2.start();

    }

}
