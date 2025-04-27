//2082/01/10
//file write 
package chapter8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileWriteExample {

    public static void main(String[] args) throws IOException {
        String path = ("C:\\Users\\DELL\\Documents\\RIYAZ MONSTER FILES\\RIYAZ JAVA(all)\\Chapter8\\file");
        FileWriter fw = null;
        try {
            fw = new FileWriter(path + "\\test.txt",true);
            fw.write("This is upadate in this file .");
        } catch (IOException ex) {
            //Logger.getLogger(FileWriteExample.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } finally {
            if(fw!=null){
                
            fw.flush();
            fw.close();
            }
        }

    }

}
