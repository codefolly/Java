//2081/12/17

// try and finally code 
//exception handling of try and finally only

package chapter5;


public class FinallyMain {
    public static void main(String[] args) {
        
        
         int[] a= {10,20,30,40,50};
       double result=0;
       
       try{
           // result=a[4]/,0;  // exception part this is checked(compile time) exception 
           result = a[4]/0;   // runtime exception i.e unchecked exception 
       }
      
        
    
       finally{
         System.out.println("The result is : "+result);
       }
    }
    
}
