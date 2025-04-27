/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopchapter3;

// Method overloading 

class Addition{
    int add(int a, int b){
          //  System.out.println("The sum of integers is "+(a+b));
          return a+b;
}

    double  add(int a, int b , int c){
           // System.out.println("The sum of Decimals numbers is "+(a+b));
           return a+b+c;
    }
}
public class AdditionMain {
    public static void main(String[] args) {
        Addition a = new Addition();
        //Addition Decimals = new Addition();
        //Integers.add(10, 20);
        //Decimals.add(10.09,30);
        
        System.out.println("The sum is "+a.add(2,3));
        System.out.println("The sum is "+a.add(1,2,3));
    }
    
}
