//2081/12/15
//lab 3 my distance 
// lab qn and board exam qn vvi
package lab3.riyaj;



class Distance {

    int inch;
    int feet;

    Distance(int feet, int inch) {
        this.inch = inch;
        this.feet = feet;
    }

    Distance addDistance(Distance temp) {
        int final_inch = this.inch + temp.inch;
        int final_feet = this.feet + temp.feet;
        
        if(final_inch>=12){
            final_feet = final_inch/12 + final_feet;
            final_inch = (this.inch + temp.inch)%12;
            
        }
        Distance t = new Distance(final_feet,final_inch);
        return t;
    }

    Distance subDistance(Distance temp) {
        int after_inch =this.inch - temp.inch;
        int after_feet =this.feet - temp.feet;
        if(after_inch<= 0 || after_feet<=0){
            after_feet=Math.abs(after_inch);
            after_inch=Math.abs(after_feet);
        }
        Distance d= new Distance(after_feet,after_inch);
        return d;

    }

    void displayDistance() {
        System.out.println("The Total distance is :  "+ this.feet + " Feet " +this.inch + " inch " );
        
        
       
    }
}

public class NewDistance {
    

    public static void main(String[] args) {
        Distance d1 = new Distance(9, 8);
        Distance d2 = new Distance(6, 6);
        
        d1.addDistance(d2);
        d1.subDistance(d2);
        
        System.out.println("Displaying Inputs: ");
        d1.displayDistance();
        d2.displayDistance();
        
        System.out.println("Displaying Sum : ");
        Distance s= d1.addDistance(d2);
        s.displayDistance();
        
        System.out.println("Displaying Sub : ");
        Distance e = d1.subDistance(d2);
        e.displayDistance();

    }

}
