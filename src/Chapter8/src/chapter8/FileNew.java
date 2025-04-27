//2082/01/09

package chapter8;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileNew {

    public static void main(String[] args) {
      String path = ("C:\\Users\\DELL\\Documents\\RIYAZ MONSTER FILES\\RIYAZ JAVA(all)\\Chapter8\\file");
      /*
      File f = new File(path+"\\hsm.txt");
      
        try {
            f.createNewFile();
        } catch (IOException ex) {
          //  Logger.getLogger(FileNew.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.exists());
        System.out.println(f.canExecute());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.isDirectory());
        System.out.println(f.length());
        System.out.println(f.getAbsolutePath());
      
        System.out.println(f.getFreeSpace());
        System.out.println(f.getClass());
        System.out.println(f.getParentFile());
        System.out.println(f.delete());
        */
        
        
        
        File f = new File(path+"\\newfolder");
       // f.mkdir();
        f.mkdirs();
        
  
      
      
      
    }
    
}
