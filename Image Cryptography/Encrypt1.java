import java.util.*;

class Encrypt1{
public static void main(String args[])
		{
		char a[][]=new char[26][26];
		char p='A';
		char q=p+1;
		for(i=1;i<=26;i++)
		{
			for(j=1;j<=26;j++)
			{if(p>'Z') p= (char)65;
		     a[i][j]=p;
			 p=p+1;}
			 
			 p=q;
			 if(q<'Z')q =(char)p+1;
			 else {q='A';}
			
		}
		
		for(i=1;i<=26;i++)
		{
			for(j=1;j<=26;j++)
			{System.out.print(a[i][j]+"   ");
		
		}
		System.out.print('\n');
		
		}