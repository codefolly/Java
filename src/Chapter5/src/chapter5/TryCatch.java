//2081/12/17

// try catch example 


//try ma those code which can cause exception 
// finallly ma those code which doesnot matter it made exception or not but it should be run 


package chapter5;


public class TryCatch {
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
             // System.out.println("You are trying to divide out of bound !!");
           
       }
      // finally{
        //   System.out.println("The result is : "+result);
       //}
        
    }
    
}
