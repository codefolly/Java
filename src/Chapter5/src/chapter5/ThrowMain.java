//2081/12/17

//exception handling 
// use of throw 
package chapter5;


public class ThrowMain {
    public static void checkname(String name){
   // String name ="suroj";
    int len = name.length();
    if(len < 5){
    throw new IllegalArgumentException("Name must be longer then 5 letter.");
            
}
    System.out.println("Name is valid : "+name);
    
}
    public static void main(String[] args) {
        try{
            checkname("Rabina");
        }
        catch(IllegalArgumentException e){
            //System.out.println(e.getMessage());  // this is library function i.e getMessage() directly print the message of throw.
            System.out.println(e);
        }
        
            
        
        
    }
    
}
