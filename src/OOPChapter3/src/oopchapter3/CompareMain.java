

// 2081/11/20

// using objects as parameters

package oopchapter3;




class Compare{
    int x,y;
    Compare(int x, int y){
        this.x=x;
        this.y=y;
    }
    void display(Compare k){
       
        System.out.println("c1 : x : "+this.x);
        System.out.println("c1 : y : "+this.y);
        System.out.println("c2 : x : "+k.x);
        System.out.println("c2 : y : "+k.y);
        
         if(this.x==k.x && this.y==k.y ){
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal");
        }
    }
}
public class CompareMain {
    public static void main(String[] args) {
        Compare c1= new Compare(6,7);
        Compare c2= new Compare(6,7);
        c1.display(c2);
        
    }
    
}
