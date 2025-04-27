//2081/12/15
//lab 3 qn 

package lab3.riyaj;



class Box{
    int length,breadth;
    
    Box(int length,int breadth){
        this.length = length;
        this.breadth= breadth;
    }
    int getLength(){
        return length;
    }
    int getBreadth(){
        return breadth;
    }
    int  area(){
        return (getLength() * getBreadth());
    }
    
}

public class BoxDemo {

   
    public static void main(String[] args) {
        Box b1 = new Box(12,13);
        Box b2 = new Box(14,15);
        System.out.println("The area of box 1 is : "+b1.area());
        System.out.println("The area of box 2 is : "+ b2.area());
        
        if(b1.area() > b2.area()){
            System.out.println("The largest is : " + b1.area());
        }
            else{
                    System.out.println("The largest is : "+b2.area());
                    }
                   
        }
       
        
        
       
    }
    

