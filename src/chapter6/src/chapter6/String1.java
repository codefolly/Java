//2081/12/21

//2081/12/26 again edited 
// string handle and string user input 
package chapter6;

import java.util.Scanner;


public class String1 {
    public static void main(String[] args) {
       /** String word;
        Scanner sc = new Scanner(System.in);
        sc.next(); // word by word 
        sc.nextLine(); // line by line 
        */
       String s = " Apple ";
       String r = " apple ";
       String q = new String(" apple ");
       String t =" apple ";
       String u = " cat ";
       String[] z = {"apple" , "is" , "red" , "and", "banana","is","yellow"};
       String a = " The house is red ";
       String b = "The car is Black";
       int e=123;
       
       /**
        System.out.println(s==r); //this check the address belongs to which location 
        System.out.println(s==q);
        System.out.println(s==t);
        System.out.println(s==u);
         */
       
        System.out.println(s.equals(r));
        System.out.println(s.equals(q));
        System.out.println(s.equals(t));
        System.out.println(s.equals(u));
        System.out.println(s.equals(t));
        
        System.out.println(s.equalsIgnoreCase(t));
        
        System.out.println(s.startsWith(" ap"));
        System.out.println(s.startsWith("ap",1));
        
        System.out.println(s.endsWith("le "));
        
        System.out.println(s.compareTo(r)); // compare the adjacent and diff from each to compare . if both are same then result will be 0.
        
        System.out.println(r.regionMatches(false, 1, t, 1,2));
        
        System.out.println(a.regionMatches(false, 11, b, 9,0));
        
        System.out.println(r.indexOf('p'));
        System.out.println(s.lastIndexOf('p'));
        
        System.out.println(r.substring(3));//substing extract
        
        System.out.println(s.replace('l', 'w'));
        
        String w = "hello".replace('o', 'a');
        System.out.println(w);
        
        System.out.println(s.trim()); //removes all unnecessary spaces in front of string and last of the string .
        
        System.out.println(s.valueOf(b));
        
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        
      
        
        
    }
    
}
