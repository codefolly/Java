//2081/12/29
//lab 5.3  check balance 
// user defined exception cases 


package lab5_riyaj;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}

class Bank{
    int balance;
    Bank(int balance){
        this.balance = balance;
    }
    void withdraw(int amount) throws InsufficientBalanceException {
        if(balance < amount){
            throw new InsufficientBalanceException("insufficient balance");
        }
        balance = balance - amount;
        System.out.println("withdrawn amount : " +amount);
        System.out.println("Remaining balance : "+balance);
    }
    
}
public class BankMain {
    public static void main(String[] args) {
        Bank b = new Bank(5000);
        Scanner sc = new Scanner(System.in); // standard input
        int amount;
        System.out.println("Enter the amount you want ..");
        amount = sc.nextInt();
        
        try{
        b.withdraw(amount);
        }
        catch(InsufficientBalanceException e){
           // System.out.println(e);
            System.out.println("insufficient balance!!!!");
        }
       
    }
    
}
