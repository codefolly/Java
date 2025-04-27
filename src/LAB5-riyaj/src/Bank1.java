  //2081/12/29
//lab 5.3  check balance 
// user defined exception cases 


import java.util.Scanner;


  

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}

 class Bank2{
    int balance;
    Bank2(int balance){
        this.balance = balance;
    }
    void withdraw(int amount) {
        try{
        if(balance < amount){
            throw new InsufficientBalanceException("insufficient balance");
        }
        
        balance = balance - amount;
        System.out.println("withdrawn amount : " +amount);
        System.out.println("Remaining balance : "+balance);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
            //System.out.println("insufficient balance!!!!");
        }
       
    }
}
public class Bank1 {
    public static void main(String[] args) {
        Bank2 b = new Bank2(5000);
        Scanner sc = new Scanner(System.in); // standard input
        int amount;
        System.out.println("Enter the amount you want ..");
        amount = sc.nextInt();
        b.withdraw(amount);
        
        
    }
    
}


