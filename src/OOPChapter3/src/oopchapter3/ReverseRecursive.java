 /*while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            num = num / 10;
*/

// 2081/11/22

package oopchapter3;


public class ReverseRecursive {

   

    static int reverse(int num, int rev) { // if we use static then we dont need to call object and no need of creating object.
       
       
        if(num == 0){ // base case
        return rev;
}
        return reverse(num/10, rev*10 + num%10); //recursive case
            
        }
    
    // static used only one twwwwwwwwwe o return values
    public static void main(String[] args) {
        System.out.println("Reverse is " +reverse(456,0));

    }
}


