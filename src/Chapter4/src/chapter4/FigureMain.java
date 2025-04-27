// 2081/12/11

// abstract class example 


package chapter4;

abstract class Figure {

    int dim1;
    int dim2;

    Figure(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract void area();  // abstract method   only declaration 
    
    
    /*
void display(){ // concrete method
        System.out.println("This is display : ");
    }
        
    */
}

class Rectangle extends Figure{
    Rectangle(int dim1,int dim2){
        super(dim1,dim2);
    }
    @Override
    void area(){
        System.out.println(" The area of rectangle is : "+dim1*dim2);
    }

}

class Square extends Figure {
    Square(int dim1,int dim2){
        super(dim1,dim1);
        
    }
    @Override
     void area(){
         
        System.out.println("The area of square is :  " +dim1*dim1 );
    }

}

public class FigureMain {

    public static void main(String[] args) {
        Rectangle r= new Rectangle(12,13);
        Square s = new Square(12,12);
        r.area();
        s.area();

    }

}
