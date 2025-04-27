//2081/12/22
//lab 4.2 
package lab4.riyaj;

class Rectangle implements Shape {

    int dim1, dim2;

    Rectangle(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;

    }

    public void area() {
        System.out.println("the area of rectangle is : " + dim1 * dim2);
    }

    public void perimeter() {
        System.out.println("The perimeter of rectangle is : " + 2 * (dim1 + dim2));
    }
}

class Circle implements Shape {

    int dim1;

    Circle(int dim1) {
        this.dim1 = dim1;

    }

    @Override
    public void area() {
        System.out.println("the area of circle is : " + 3.14 * dim1 * dim1);
    }

    public void perimeter() {
        System.out.println("The perimeter of circle is : " + 2 * (3.14 * dim1));
    }
}
class Triangle implements Shape {

    int dim1, dim2,dim3;

    Triangle(int dim1, int dim2,int dim3) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3=dim3;

    }

    public void area() {
        System.out.println("the area of rectangle is : " + (1/2)*(dim1 * dim2));
    }

    public void perimeter() {
        System.out.println("The perimeter of rectangle is : " + dim1+dim2+dim3);
    }
}

public class ShapeMain1 {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(12, 13);
        Circle c = new Circle(10);
        Triangle t = new Triangle(12,12,13);

        r.area();
        r.perimeter();
        c.area();
        c.perimeter();
        t.area();
        t.perimeter();
        
               
    }

}
