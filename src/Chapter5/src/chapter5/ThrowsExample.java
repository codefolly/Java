//2081/12/19
//throws is declaration of exception 
package chapter5;

public class ThrowsExample {
    public static void main(String[] args) {
        int a=12;
        try{
            a=a/0;
            
        }
         catch(ArithmeticException e){
            System.out.println("divide by zero ");
        }
        catch(ArrayIndexOutOfBoundsException ab){
            System.out.println("Exception");
        }
         catch(Exception ex){
            System.out.println(" this is exception ");
        }
       
       
    }
    
}
