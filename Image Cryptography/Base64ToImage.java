import java.awt.image.BufferedImage;  
 import java.io.*;  
 import java.util.Scanner;  
 import javax.imageio.ImageIO;
import java.util.Base64; 
  
 public class Base64ToImage {  
    Base64ToImage(){  
          String   base64=null,file="Decrypt.txt";
		  
           try (BufferedReader br = new BufferedReader(new FileReader(file))) {
    String line;
    while ((line = br.readLine()) != null) {
       base64=line;
           
		   byte[] base64Val= Base64.getDecoder().decode(new String(base64).getBytes("UTF-8"));
           try{writeByteToImageFile(base64Val, "Decrypt.png");}catch(Exception e){}  
           System.out.println("Saved the Decrypted image in the current as Decrypt.png");  
 }
}catch(Exception e){}    
      
   }  
        
      public static void writeByteToImageFile(byte[] imgBytes, String imgFileName) throws IOException  
      {  
           File imgFile = new File(imgFileName);  
           BufferedImage img = ImageIO.read(new ByteArrayInputStream(imgBytes));  
           ImageIO.write(img, "png", imgFile);  
      }  
 }  