import java.util.*;
import java.io.*;
import java.lang.Object;
import java.util.Base64.*;
import java.awt.*;
import javax.swing.*;
public class Hello{
	Hello(String Path){
		String key=null;
	File file =  new File(Path);
     
      
            String encodedfile = null;
            try {
                FileInputStream fileInputStreamReader = new FileInputStream(file);
                byte[] bytes = new byte[(int)file.length()];
                fileInputStreamReader.read(bytes);
             
			    encodedfile = Base64.getEncoder().encodeToString(bytes);
			    key = JOptionPane.showInputDialog("Enter Your Private Key");
			  //System.out.println(key);
            } catch (FileNotFoundException e) {
               
                e.printStackTrace();
            } catch (IOException e) {
               
                e.printStackTrace();
            }
  // System.out.println(encodedfile);
   try{
    
	BufferedWriter out = new BufferedWriter(new FileWriter("Base64.txt"));
    out.write(encodedfile);   
    out.close();
}catch(Exception e){}


new MatrixNew(key);











}   }