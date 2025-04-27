//2082/01/10
//file copy operation 
package chapter8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileCopyExample {

    public static void main(String[] args) throws IOException {
        String path = ("C:\\Users\\DELL\\Documents\\RIYAZ MONSTER FILES\\RIYAZ JAVA(all)\\Chapter8\\file");
        FileReader fr = null;
        FileWriter fw = null;
        try {

            fr = new FileReader(path + "\\test.txt");
            fw = new FileWriter(path + "\\hsm.txt");
            BufferedReader br = new BufferedReader(fr);
            String t;
            while ((t = br.readLine()) != null) {
                fw.write(t);
            }
        } catch (IOException ex) {
            // Logger.getLogger(FileCopyExample.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } finally {
            if (fw != null && fr != null) {
                fw.flush();
                fw.close();
                fr.close();

            }

        }
    }

}
