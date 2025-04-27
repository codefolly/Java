/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopchapter3;


// 2081/11/19


// this is the example of constructor overloading
//within same method, same method name , and different parameter

class Shape2{
    
    int length, breadth;  // this is instance variable
    
    
    // constructor for rectangle
    Shape2(int length, int breadth){
        this.length = length;
        this.breadth= breadth;
    }
    
    
    // constructor for square
    Shape2(int length){
        this.length = length;
        this.breadth = length;
    }
    
    int area(){
        return (length*breadth);
        //return(length*length);
    }
    int perimeter(){
        
        return 2*(length + breadth);
    }
    
}
public class ShapeConstructor {
    public static void main(String[] args) {
        Shape2 rectangle = new Shape2(2,3);
        Shape2 square= new Shape2(3);
        
        
        System.out.println("the areaof rectanglr is "+   rectangle.area());
        System.out.println("The area of square is "+square.area());
       
        System.out.println("The perimeter of rectangle is "+rectangle.perimeter());
        System.out.println("The perimeter of square is "+square.perimeter());
         
}
}
