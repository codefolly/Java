// 2081/12/10
// method overriding 
// use of super keyword
package chapter4;

class Student {

    int total_mark;
    int obtained_mark;

    Student(int total_mark, int obtained_mark) {
        this.total_mark = total_mark;
        this.obtained_mark = obtained_mark;
    }

    void percentage() {
        double p = ((obtained_mark * 100) / total_mark);
        System.out.println("normal percentage is : " + p);
    }

}

class SpecialStudent extends Student {

    int total_mark;

    SpecialStudent(int total_mark, int obtained_mark) {
        super(total_mark, obtained_mark);
        this.total_mark = 200;

    }

    void percentage() {
        double p = ((obtained_mark * 100) / total_mark) + 5;
        System.out.println("special  percentage is : " + p);

        super.percentage();
        System.out.println("The total mark of normal student  is : " + super.total_mark);
    }

}

public class MethodOverriding {

    public static void main(String[] args) {
        SpecialStudent s1 = new SpecialStudent(50, 20);    // here s1 is reference variable

        s1.percentage();
        System.out.println("The total marks of special student  is : " + s1.total_mark);
        // System.out.println("The total mark is : "  +super.total_mark);  this is wrong because it is non static value and we assign it to static function 

    }

}
