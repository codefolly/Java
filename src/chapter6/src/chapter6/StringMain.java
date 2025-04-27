//2081/12/21

//string creation by string literals and using new keyword 


package chapter6;


public class StringMain {

    
    public static void main(String[] args) {
       //  String word = "apple";  // string creation using string literals
        
       // String word = new String("apple"); // using new keyword 
        
       // System.out.println(word + " cat "); // concatination or merging string using + .
       // System.out.println(word.concat(" cat")); // concating using concat() method.
        
        
        int a =121212;
        //String word =  Integer.toString(a);  // type conversion  of integer into string .
        System.out.println(Integer.toString(a).length());
        
        double b = 1.2223;
        System.out.println(Double.toString(b).length());// type conversion of double into string 
        System.out.println(String.valueOf(b).length()); // it can handle null pointer exception 
        
        
        String word = " Ball is very big.";
        System.out.println(word.charAt(7)); // checks the character in given position single at a time 
        
        char[]buff = new char[20] ; 
        word.getChars(13, 17, buff, 0); // use to extract multiple string at a time like from above we can extract "ball".
        System.out.println(buff);
        
        System.out.println(word.toCharArray()); // change given string into character array.
        
        
       
    }
    
}
