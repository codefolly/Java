//2082/01/12
//serialization in file 
//store byte stream file 
package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

    int id;
    int age;
    String name;

    Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

}

public class FileNewMain {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String path = ("C:\\Users\\DELL\\Documents\\RIYAZ MONSTER FILES\\RIYAZ JAVA(all)\\Chapter8\\file");
        try (
                FileOutputStream fos = new FileOutputStream(path + "\\student.ser"); //it create file 
                 ObjectOutputStream oos = new ObjectOutputStream(fos) //it manage or converts 
                ) {
            Student s = new Student(101, 21, "suroj");
            Student s1 = new Student(102, 21, "ram");
            Student s2 = new Student(103, 21, "hari");
            Student s3 = new Student(104, 21, "aman");
            Student s4 = new Student(105, 21, "om");
            
            oos.writeObject(s);
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.writeObject(s3);
            oos.writeObject(s4);
            System.out.println("Object written to file .");

        }
        try(FileInputStream fis = new FileInputStream(path+"\\student.ser");
                ObjectInputStream ois = new ObjectInputStream(fis) )
        {
          
            
          
            Student s = (Student)ois.readObject();
            Student s1 = (Student)ois.readObject();
            Student s2 = (Student)ois.readObject();
            Student s3 = (Student)ois.readObject();
            Student s4= (Student)ois.readObject();
            
          
            System.out.println("Deserilized student ->  ID: "+s.id+ " age "+s.age + " name "+s.name);
            System.out.println("Deserilized student ->  ID: "+s1.id+ " age "+s1.age + " name "+s1.name);
            System.out.println("Deserilized student ->  ID: "+s2.id+ " age "+s2.age + " name "+s2.name);
            System.out.println("Deserilized student ->  ID: "+s3.id+ " age "+s3.age + " name "+s3.name);
            System.out.println("Deserilized student ->  ID: "+s4.id+ " age "+s4.age + " name "+s4.name);

            
        }
    }

   
    
}
