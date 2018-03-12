import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.Base64.*;
import java.lang.Object;
public class Keyinsert extends JFrame{
    JButton encrypt;
    JLabel label;
    JFrame frame;
	public char Path[]=null;
	public char Pathnew[];
    public Keyinsert(){
    super("PLEASE ENTER A KEYWORD( IN BASE64) TO ENCRYPT");
   
    encrypt = new JButton("Encrypt");
    encrypt.setBounds(350,300,130,40);  
	encrypt.setEnabled(false);
 encrypt.setBackground(new Color(246,41,89));
     encrypt.setForeground(Color.WHITE);
     encrypt.setFocusPainted(false);
     encrypt.setFont(new Font("Tahoma", Font.BOLD, 12));
   	
    label = new JLabel();
	
    label.setBounds(10,10,670,250);
    
    add(label);
	add(encrypt);
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
        new BrowseImg();
    }
   }





























/*import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.Base64.*;
import java.lang.Object;

public class Keyinsert extends JFrame{
frame = new JFrame("LOGIN PAGE");
		frame.setBounds(165,60,350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();    
        
        frame.add(panel);
		frame.setResizable(false);
      
                
		panel.setLayout(null);
        
        JLabel userLabel = new JLabel("User");
       
         userLabel.setBounds(10,20,80,25);
		panel.add(userLabel);                        
        
        userText = new JTextField(10);
		userText.setBounds(100,20,165,25);
		userText.setFont(font1);
		panel.add(userText);
      
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		passwordText = new JPasswordField(10);
		passwordText.setBounds(100,50,165,25);
		
        passwordText.setFont(font1);
		panel.add(passwordText);
		
		passwordCheckbox=new JCheckBox("Show Password");
		passwordCheckbox.setBounds(20,100,165,25);
		panel.add(passwordCheckbox);
	
        JButton loginButton = new JButton("login");
		loginButton.setBounds(200, 100, 80, 25);
		panel.add(loginButton);
		panel.setVisible(true);
		frame.setVisible(true);
		loginButton.addActionListener(this);
	
	passwordCheckbox.addItemListener(new ItemListener() 
				{
				public void itemStateChanged(ItemEvent e) 
					{
					if (e.getStateChange()==ItemEvent.SELECTED) 
						{
						passwordText.setEchoChar((char) 0);
						} 
					else 
						{
						passwordText.setEchoChar('*');
												}
					}
				});
		
		  public static void main(String[] args){
        new Keyinsert();
		}
}*/