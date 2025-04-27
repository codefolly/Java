//2081/12/19
// user defined exception 
// first example of user defined exception 
package chapter5;

import java.util.Scanner;

class NotEligibleException extends Exception {

    public NotEligibleException(String msg) {
        super(msg);
    }

}

public class VoterList {

    int age;

    VoterList(int age) {
        this.age = age;
    }

    void checkEligibility() {
        try {
            if (age < 18) {
                throw new NotEligibleException("Error this is due to ankit fault");
            }
            System.out.println("Congrat's you are eligible !");
        } catch (NotEligibleException nee) {
            System.out.println(nee.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age in years");
        int age = input.nextInt();
        VoterList person = new VoterList(age);
        person.checkEligibility();
    }

}
