package chapter4;

import java.util.Scanner;

class School {
    String School_address;
    String School_name;
    int School_code;

    School(String School_address, String School_name, int School_code) {
        this.School_code = School_code;
        this.School_name = School_name;
        this.School_address = School_address;
    }

    void display() {
        System.out.println("School Address: " + School_address);
        System.out.println("School Name: " + School_name);
        System.out.println("School Code: " + School_code);
    }
}

class Student extends School {
    int Student_id;
    String Student_name;
    double Student_percentage;
    int Student_age;

    Student(String School_address, String School_name, int School_code, int Student_id, String Student_name, double Student_percentage, int Student_age) {
        super(School_address, School_name, School_code);
        this.Student_id = Student_id;
        this.Student_name = Student_name;
        this.Student_percentage = Student_percentage;
        this.Student_age = Student_age;
    }

    void display() {
        super.display();
        System.out.println("Student ID: " + Student_id);
        System.out.println("Student Name: " + Student_name);
        System.out.println("Student Percentage: " + Student_percentage);
        System.out.println("Student Age: " + Student_age);
    }

    void search(int id) {
        if (this.Student_id == id) {
            System.out.println("Student found:");
            display();
        } else {
            System.out.println("Student not found with ID: " + id);
        }
    }
}

public class ResultMain {
    public static void main(String[] args) {
        Student s1 = new Student("hetauda-4, Schoolroad", "HSM School", 1010, 1, "suroj rana", 85.5, 22);
        Student s2 = new Student("hetauda-5", "hsm", 1010, 2, "Aman kumar mandal", 99.7, 21);

        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the id you want to search: ");
        int idToSearch = Sc.nextInt();
        
        s1.search(idToSearch);
        s2.search(idToSearch);
    }
}
