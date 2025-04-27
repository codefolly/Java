/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopchapter3;


// Initilize object Using constructor
// constructor doesnot have return type
// constructor is a special type of method which is used to initilize object when object is created.
// it is automatically called and same as class name


class Rectangle{
     double length, breadth; // this is instance variable
     
    /*void area(){       // without calling function no return type
        System.out.println("The area is "+ length * breadth);
    }*/
                     
     Rectangle(double length , double  breadth){ // there is no return type for constructor
         this.length = length;
         this.breadth =  breadth;
         
     }
    double area(){
        return length * breadth;
    }
}
public class UsingConstructor {
    public static void main(String[] args) {
        
        Rectangle r1= new Rectangle(3,4); // using constructor
        Rectangle r2= new Rectangle(7,8);
        System.out.println("The area is "+r1.area());
        System.out.println("The second area is "+r2.area());
        
    }
    
}
