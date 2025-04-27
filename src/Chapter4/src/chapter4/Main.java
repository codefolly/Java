//2081/12/14
// multilevel inheritance
// this is necessary to have each instance variable in each sub-class.

package chapter4;

class M{
    int d,e;
    M(int d, int e){
        this.d=d;
        this.e=e;
    }
    void multiply(){
        System.out.println("The multiplication is : "+d*e);
    }
}
class AM extends M{
    int c;
    AM(int c , int d, int e){
        super(d,e);
        this.c=c;
    }
    void Squareroot(){
        System.out.println("The square root is : " +Math.sqrt(c) );
    }
}
class SAM extends AM{
    int a,b;
    SAM(int a, int b,int c,int d, int e){
        super(c,d,e);
        this.a=a;
        this.b=b;
        
        
    }
    void power(){
        System.out.println("Raising to the power of : " + Math.pow(a, b));
    }
}

public class Main {
    public static void main(String[] args) {
        SAM s1 = new SAM(2,3,4,4,5);
    
        s1.multiply();
        s1.Squareroot();
        s1.power();
        
    }
    
}
