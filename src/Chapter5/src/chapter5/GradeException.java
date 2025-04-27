//2081/12/19
// user defined exception 
package chapter5;

import java.util.Scanner;

 class InvalidGradeException extends Exception {

    InvalidGradeException(String msg) {
        super(msg);
    }
}

public class GradeException {

    int grade;

    GradeException(int grade) {
        this.grade = grade;
    }

    
        void gradeligilibity(){
    try {
            if (grade < 0 || grade > 100) {
                throw new  InvalidGradeException("Error : you are not elligible !!!");
            }
            System.out.println("You are elligible...");
        }
   
    catch(InvalidGradeException e){
        System.out.println(e.getMessage());
    }
}
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Your grade : ");
        int grade = sc.nextInt();
        GradeException person = new GradeException(grade);
        person.gradeligilibity();
        

    }

}
