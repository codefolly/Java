/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopchapter3;

/**
 *
 * @author DELL
 */


// 2081/11/12

public class Shape { // this is main class because it include main method . this  is always public to assess by JVM.
    double length, breadth; // this is instance variable
    void area(){
        System.out.println("The area is "+ length * breadth);
    }
  
    public static void main(String[] args) { // this is main method . if static then this belongs to class. if we make static then it make for all objects.(instance)
       
        Shape area1 = new Shape();
        Shape area2 = new Shape();
        Shape area3 = new Shape();
      
        
        area1.length=5;
        area1.breadth=5;
        
        area2.length=8;
        area2.breadth=5;
        
        area3.length = 3.0009;
        area3.breadth = 4.5678;
        
        area1.area();
        area2.area();
        area3.area();
      
    }
    
}
