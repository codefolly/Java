/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopchapter3;


class Rectangle{
     double length, breadth; // this is instance variable
     
    /*void area(){       // without calling function no return type
        System.out.println("The area is "+ length * breadth);
    }*/
                     
     void get_input(double x , double y){
         length = x;
         breadth =  y;
         
     }
    double area(){
        return length * breadth;
    }
}
public class UsingReferenceVariable {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        Rectangle r2= new Rectangle();
        r1.get_input(5,6);
        r2.get_input(9,8);// this is user defined method
        
        System.out.println("The area is "+r1.area());
        System.out.println("The second area is "+r2.area());
    }
    
}
