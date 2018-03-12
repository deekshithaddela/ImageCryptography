import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.*;
import java.util.Base64.*;
import java.lang.*;
public class BrowseImg extends JFrame{
     JButton button1,encrypt;
    JLabel label;
    JFrame frame;
	public char Path[]=null;
	public char Pathnew[];
    public BrowseImg(){
    super("CHOOSE AN IMAGE TO ENCRYPT");
    button1 = new JButton("Browse Image");
    button1.setBounds(200,300,130,40);
	 button1.setBackground(new Color(71,161,240));
     button1.setForeground(Color.WHITE);
     button1.setFocusPainted(false);
     button1.setFont(new Font("Tahoma", Font.BOLD, 12));
   
    encrypt = new JButton("Encrypt");
    encrypt.setBounds(350,300,130,40);  
	encrypt.setEnabled(false);
 encrypt.setBackground(new Color(246,41,89));
     encrypt.setForeground(Color.WHITE);
     encrypt.setFocusPainted(false);
     encrypt.setFont(new Font("Tahoma", Font.BOLD, 12));
   	
    label = new JLabel();
	
    label.setBounds(10,10,670,250);
    add(button1);
    add(label);
	add(encrypt);
    
    button1.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
        
          JFileChooser file = new JFileChooser();
          file.setCurrentDirectory(new File(System.getProperty("user.home")));
          //filter the files
          FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "jpeg");
		  
file.setFileFilter(filter);
          int result = file.showSaveDialog(null);
           //if the user click on save in Jfilechooser
          if(result == JFileChooser.APPROVE_OPTION){
              File selectedFile = file.getSelectedFile();
              String path = selectedFile.getAbsolutePath();
              label.setIcon(ResizeImage(path));
			  
          }
           //if the user click on save in Jfilechooser


          else if(result == JFileChooser.CANCEL_OPTION && Path==null ){
              JOptionPane.showMessageDialog(frame,"No file chosen","Please choose an image",JOptionPane.WARNING_MESSAGE);

          }
        }
    });
	
		

	encrypt.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
      
for(int i=0;i<Path.length;i++){char character = Path[i];
int ascii = (int) character;
if (ascii==92){Path[i]='/';}

}
System.out.println(Path);
String text = String.copyValueOf(Path);
Hello h=new Hello(text);
		//h.convertTo64(text);
















	   }
        });
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setSize(700,400);
    setVisible(true);
	setLocationRelativeTo(null); 
    }
     
     // Methode to resize imageIcon with the same size of a Jlabel
    public ImageIcon ResizeImage(String ImagePath)
    { Path=ImagePath.toCharArray();
	    encrypt.setEnabled(true); 
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
	
  
    public static void main(String[] args){
        File File1 = new File("Base64.txt");File1.delete();
		File File2 = new File("out.txt");File2.delete();
		File File3 = new File("Decrypt.png");File3.delete();
		File File4 = new File("decrypt.txt");File4.delete();
		new BrowseImg();
		
    }
   }