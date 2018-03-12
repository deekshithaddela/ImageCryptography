import javax.swing.*;
import java.util.*;
import java.io.*;
public class MatrixNew{
MatrixNew(String keyword){
String decryptkey=null;
char base64[][]=new char[64][64];
char ch1='A',ch3=ch1;
char ch2=ch1;
PrintWriter wri;


for (int i=0;i<=63;i++)
{
for(int j=0;j<=63;j++)
{
	
if(ch1=='[')ch1='a';
else if(ch1=='{')ch1='0';
else if(ch1==':')ch1='+';
else if(ch1==',')ch1='/';
else if(ch1=='0'&&ch3=='/')ch1='A';
	base64[i][j]=ch1;
	//System.out.println(ch1);
	ch3=ch1;
	ch1=(char)(ch1+1);
	
	
}	
if(ch2=='z')ch2='/';
else if(ch2=='Z')ch2='`';
else if(ch2=='9')ch2='*';
else if(ch2=='+')ch2='.';

ch1=(char)(ch2+1);	
	ch2=ch1;
}
/*
for (int i=0;i<=63;i++)
{
for(int j=0;j<=63;j++)
{


System.out.print(base64[i][j]+"   ");


}
System.out.println("");
}

*/


String fileinput="Base64.txt";
String fileoutput="out.txt";
String decrypt="decrypt.txt";

int i,j,cast;
char character;

//String keyword=new String("snvSNV113/+");
int lenofkey=keyword.length();

String rc="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
int keyindex=0;

	
            
//===============================================
//for writing data into output file


			
		try{
       BufferedReader br1 = new BufferedReader(new FileReader(fileinput));
	  // PrintWriter pr1 =new PrintWriter(new BufferedWriter(new FileWriter(fileoutput,true)));
			 BufferedWriter out = new BufferedWriter(new FileWriter("out.txt",true));
       while((cast=br1.read())!=-1) 
			{character=(char)cast;
              for(i=0;i<64;i++){if(character==rc.charAt(i))break;}
              for(j=0;(rc.charAt(j)!=keyword.charAt(keyindex))&&(j<64);j++);
			 if(i<64&&j<64) {//System.out.print(base64[i][j]);
			// pr1.write(base64[i][j]+"");
			 out.write(base64[i][j]+"");}  
	 
			  if(keyindex==lenofkey-1)keyindex=0;
				else  keyindex++;
		
		}}
  
 
             catch (IOException e) 
              {
			e.printStackTrace();
		}

			
  



//================================
//for reconverting into actual code

 decryptkey = JOptionPane.showInputDialog("Enter Your Private Key to decrypt");
 int lenofdecryptkey=decryptkey.length();			  
	keyindex=0;	
if(lenofdecryptkey>0){
	try{
       BufferedReader br2 = new BufferedReader(new FileReader(fileoutput));
	  // PrintWriter pr2=new PrintWriter(new BufferedWriter(new FileWriter(decrypt,true)));
			 BufferedWriter out = new BufferedWriter(new FileWriter("decrypt.txt",true));
       
	   while((cast=br2.read())!=-1) 
			{character=(char)cast;
              for(j=0;(rc.charAt(j)!=decryptkey.charAt(keyindex))&&(j<64);j++);
			  for(i=0;i<64;i++){if(character==base64[i][j])break;}
              
			//  System.out.println(rc.charAt(i));
			// pr2.write(+"");
			  if(i<64&&j<64) {//System.out.print(rc.charAt(i));
			// pr1.write(base64[i][j]+"");
			 out.write(rc.charAt(i)+"");}  
			 
			 if(keyindex==lenofdecryptkey-1)keyindex=0;
				else  keyindex++;
		}
		new Base64ToImage();
		}
  
 
             catch (IOException e) 
              {
			e.printStackTrace();
		}

}
		}
//}
}
