package chapter7;

class SharedPrinter {
    int number = 100; // Starting number

    synchronized void printEven() {
        while (number < 200) {
            if (number % 2 != 0) {
                try {
                    wait(); // Wait if it's not this thread's turn
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + " : " + number);
            number++;
            notify(); // Notify the other thread to proceed
        }
    }

    synchronized void printOdd() {
        while (number < 200) {
            if (number % 2 == 0) {
                try {
                    wait(); // Wait if it's not this thread's turn
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + " : " + number);
            number++;
            notify(); // Notify the other thread to proceed
        }
    }
}

public class NumberThread {
    public static void main(String[] args) {
        SharedPrinter sharedPrinter = new SharedPrinter();

        Thread evenThread = new Thread(() -> sharedPrinter.printEven(), "EvenThread");
        Thread oddThread = new Thread(() -> sharedPrinter.printOdd(), "OddThread");

        evenThread.start();
        oddThread.start();
    }
}