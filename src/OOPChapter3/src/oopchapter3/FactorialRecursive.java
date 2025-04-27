
package oopchapter3;

// 2081/11/22
public class FactorialRecursive {
    
    //just using static without instance
    static int  factorial(int n){
        if(n==0 || n==1) // base case 
            return 1;
        return n * factorial(n-1);  // recursive case 
    }


    public static void main(String[] args) {
        
     //  FactorialRecursive f = new FactorialRecursive();
      //  System.out.println("Factorial : "+f.factorial(5));
        System.out.println("Factorial "+FactorialRecursive.factorial(3));
    }
    
}
