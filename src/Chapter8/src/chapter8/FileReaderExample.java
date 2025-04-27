//2082/01/10
//file 
package chapter8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class FileReaderExample {

    public static void main(String[] args) throws IOException {
        String path = ("C:\\Users\\DELL\\Documents\\RIYAZ MONSTER FILES\\RIYAZ JAVA(all)\\Chapter8\\file");
       
        
       
        FileReader fr=null;
        fr = new FileReader(path +"\\test.txt"); //Logger.getLogger(FileReaderExample.class.getName()).log(Level.SEVERE, null, ex);
        try{
        int t;
        while ((t = fr.read())!=-1){
            System.out.print((char)t);
        }
        }
        catch(IOException ex){
            System.out.println(ex);
        }
        finally{
            try{
                
            if(fr !=null){
            fr.close();
            }
            }
            catch(IOException ex){
                System.out.println(ex);
            }
        }
    }
}

    
    


