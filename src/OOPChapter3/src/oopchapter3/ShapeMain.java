



// method overloading





package oopchapter3;




class Shape
{
    void area(int l ,int b){ // rectangle area
        System.out.println("The area of rectangle is "+l*b);
    }
    void area(int l){ // square area
        System.out.println("The area of square is "+l*l);
    }
    
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape rectangle = new Shape();
        
        Shape square = new Shape();
        
        rectangle.area(3,4);
        square.area(4);
       
    }
    
}
