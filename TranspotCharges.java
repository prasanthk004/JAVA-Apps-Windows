package Java.basics;

import java.util.Scanner;

public class TranspotCharges {
	
	
 public void BusCharges()
 {
	 int bprice,aprice , deduct,days,bamt,aamt;
	 float profit,ppercent;
	 char opt ; 
	 Scanner in = new Scanner(System.in);
	 System.out.print(" Are u Using City Bus (Y/N)");
	 opt=in.next().charAt(0);
	 
	
	 
	 if(opt=='y'||opt=='Y') // Allowing user if user traveling through city bus
	 {
		 System.out.print(" Enter the amount you will spend before govt Free bus Scheme :  ");
		 bprice=in.nextInt();
		 System.out.print(" Enter per day  deduted amount as per govt Free bus Scheme   :  ");
		 deduct=in.nextInt();
		 System.out.print(" Enter how many days you will travel per month    :  ");
		 days=in.nextInt();
		 
		 bamt=bprice*days ;
		 aprice=bprice-deduct ;		 
		 aamt=aprice*days ;		 
		 profit= bamt-aamt ;		 
		 ppercent=((float)profit/bamt)*100; 
		 System.out.println();
		 System.out.println();
		 System.out.println();
		 System.out.println(" Spent Amount before         : "+bamt+" RS");
		 System.out.println(" Amount after Deductiom      : "+aamt+" RS");
		 System.out.println(" Total Amount Saved permonth : "+profit+" RS");
		 System.out.printf(" Profit percentage per month : %.2f %%\n",ppercent);
		 System.out.println(" Total Profit Amount Per Year: "+profit+" RS");	 
	
		 
		 
	 }	
	 else
	 {
		 System.out.println(" Thanks For your information ! No amount has been deducted Since you have not used free bus scheme"
		 		);
	 }
	 
	
 }
 
 
 public void trainCharges()
 {
	 float  ticket,pass,tp,tm; 
	 int validity ;
	 char opt ; 
	 Scanner in= new Scanner(System.in); 
	 float profitAmt,profitPer ;
	 
	 System.out.println(" Enter perday Train ticket price  : ");
	 ticket=in.nextFloat();
	 System.out.println(" Have You Taken Train Pass Y/N: ");
	 opt=in.next().charAt(0);
	 
	 if(opt=='Y'||opt=='y')
	 {
		 System.out.print(" Train Pass price   : ");
		 pass=in.nextFloat();
		 System.out.print(" Enter the Validity : ");
		 validity=in.nextInt();
		 tp=ticket*30;
		 tm=tp*validity;
		 
		 profitAmt=tm-pass;
		 profitPer=(profitAmt/tm)*100 ;
		 
		 System.out.println(" Ticket Price Month               : "+tp);
		 System.out.printf("  Ticket0 price per %d Months      : %-5.2f \n",validity,tp*validity);
		 System.out.println(" Total Amount Saved by using Pass : "+profitAmt);		 
		 System.out.printf(" Total Amount Saved by using Pass : %-4.2f %% \n\n",profitPer);
	 }
	 
	 
	
	 
	 
 }
 
 public static void main(String [] args)
 {
	 char opt=0 ;
	 Scanner in = new Scanner(System.in);
	 TranspotCharges t= new TranspotCharges();
	
	 
	while(opt!='3')
		
	{	 
	System.out.println(" 1.    BUS");
	System.out.println(" 2.    TRAIN");
	System.out.println(" 3.    Exit");
	System.out.println(" Please Choose option : ");
	opt=in.next().charAt(0);
	

	
   if(opt=='1')
	  {
	   t.BusCharges();
	  }
   else if(opt=='2')	  
   { 
	   t.trainCharges();
   }
   
   else if(opt=='3')	  
   { 
	   System.out.println(" Terminated ");
   }
   
   else
   {
	   System.out.println(" OOPS Invalid Option ! ");
   }
		
	}

   
 }
 
}
	   
   
  
	
	 
 

 
