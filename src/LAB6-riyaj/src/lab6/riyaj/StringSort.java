//2082/01/03
//lab 6.1 sort the planet names in ascending order

package lab6.riyaj;


public class StringSort {
    public static void main(String[] args) {
        String[] planet={"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
       // System.out.println(s.compareTo(r)); // compare the adjacent and diff from each to compare . if both are same then result will be 0.
        
       for(int i=0;i<planet.length-1;i++){
           for(int j=0;j<planet.length - i-1;j++){
               if (planet[j].compareTo(planet[j + 1]) > 0) {
                    String t = planet[j];
                    planet[j] = planet[j + 1];
                    planet[j + 1] = t;

                }
           }
       }
       System.out.println("Sorted planets in acsending order ");
        for(int i=0;i<planet.length-1;i++){
            System.out.println(planet[i]);
        }

        
    }
    
}
