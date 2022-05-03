package Java.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FIleOperation {
	
	//String Path="D/IMP/JAVA\JavaConsoleApplication\Datafiles\Test\XB.txt";
	
	File fl=new File("D:\\IMP\\JAVA\\JavaConsoleApplication\\Datafiles\\Kp2.txt");
	
	
	public static void main(String[] args) {
		
		FIleOperation f = new FIleOperation();
		
	//	f.FileWrite();
		f.FileRead();
		
		
	}

	private void FileRead() {
		// TODO Auto-generated method stub
		try {
			int c = 0;
			FileReader  fr=new FileReader(fl);
			int ch=0,ab=0,cl=0,sl=0,num=0,sc=0,oc=0,wc=0;
			int wflag=0;
			c=fr.read();
			char x=0;
			 
			while(c!=-1)
			{
				x=(char) c;
				
				
				if((x>='A'&&x<='z')||(x>='a'&&x<='z'))
				{
					ab++;
					if(x>='A'&&x<='Z')
					{
					  cl++;
					}
					else if(x>='a'&&x<='z')
					{
						sl++;
					}
				}
				else if(x>='0'&&x<='9')
				{
					num++;
				}
				else 
				{
					if(x!=' ')
					     oc++ ;
				}
				
				
				if(x==' '||x=='\t'||x=='\n')
				{
					sc++;
					if(wflag==1)
					{
						wc++;
						wflag=0;
					}
				}
				else
				{
					  wflag = 1;
				}
				
				
				
				System.out.print(x);
				c=fr.read();
				
				ch++;
			}
			if(x!=' ') wc++;
			fr.close();
			System.out.println("\n\n");
			System.out.println("  File ANALYSIS ");
			System.out.println("  -------------- ");
			System.out.printf("\n\n");
			System.out.println(" Total Characters  : "+ch);
			System.out.println(" Alphabets         : "+ab);
			System.out.println(" Capitals Letters  : "+cl);
			System.out.println(" Small    Letters  : "+sl);
			System.out.println(" Numbers           : "+num);
			System.out.println(" Spaces            : "+sc);
		   	System.out.println(" Symbols           : "+oc);
		   	System.out.println(" Words             : "+wc);

			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void FileWrite()     {
		// TODO Auto-generated method stub
		
			
		FileWriter fr = null;
			 String s=new String();
			 Scanner in = new Scanner(System.in);
			 
			try {
				 boolean c=fl.createNewFile();
				 
				 if(c==true)
				 {
					 System.out.println(" New File Created");
				 }
				 
				 else
				 {
					 System.out.println(" Already  File is exist");
					 
				 }
				fr= new FileWriter(fl,true);
				
				System.out.printf("\n Enter the String to be Writen in file : ");
		 
				
				
					for(int i=0 ; i<5;i++)
					{
						s=in.nextLine();
						if(i==0) {
							fr.write(s);
							
						}
						else
						{
							fr.write("\n"+s);
						}
						
					 
						fr.flush();
				 
						System.out.println("Writted Successfully");
					 
					}
					
					  fr.close();

			
				
			 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			//fl.createNewFile();
	}
}
