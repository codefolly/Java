
//2081/12/14
// exception handling and error handling in java
// exception in differnet cases like ArithmeticException  and  ArrayIndexOutOfBoundsException
package chapter5;


public class Abc {

    
    public static void main(String[] args) {
       int[] a= {10,20,30,40,50};
       double result=0;
       
       try{
           result=a[4]/0;  // exception part
       }
       catch(ArrayIndexOutOfBoundsException ex){
           System.out.println(ex);  //if uer is technical 
          // System.out.println("You are trying to divide out of bound !!");
           
        
    }
       catch(ArithmeticException ex){
           System.out.println(ex);
           
       }
       finally{
           System.out.println("The result is : "+result);
       }
    }
    
}
