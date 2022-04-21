package Java.basics;

public class StringOperations {
	
	  String x;

	
	
 	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public static void main(String[] args) {
		StringOperations s = new StringOperations();
		s.setX("My N KP8 @@ ");
	//	s.StringAnalysis();
	  
		s.subString(0,4);

	}

	private void subString(int a, int b) {
		// TODO Auto-generated method stub
		
		int i ;
        try {
        	
        	if(a>x.length())
        	{
        		
        	}
        		
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		
		
		for(i=a;i<b;i++)
		{
			System.out.printf(" %c",x.charAt(i));
		}
	}

	public  void StringAnalysis() {
		// TODO Auto-generated method stub
	
		int i ;
		int ac=0,sc=0,nc=0,Cc=0,Smc=0,oc=0,wc=0;
		char c ;
		int chrc=0;
		int wflag=0;
		
		for(i=0;i<x.length();i++)
		{
			c=x.charAt(i);
			
			//Finding No.Of Characters & No of Digits 
			if((c>='A'&& c<='Z')||(c>='a' && c<='z'))
			{
				ac++;
			 
				
				if(c>='A' && c<='Z')
				{
					Cc++;
				}
				else if(c>='a'&&c<='z')
				{
					Smc++;
				}
				
			}
			else if(c>='0'&&c<='9')
			{
				nc++;
			 
			}			
			else
			{
				if(c!=' ')
				oc++;
			}
			
			
			// Finding No of Words
			
			if(c==' '||c=='\t'||c=='\n')
			{
				sc++;
				if(wflag==1)
				{
					wc++;
					wflag=0;
					
				}
			}
			else {
				wflag=1 ;
			}
			
			chrc++;
		}
		if(x.charAt(x.length()-1)!=' ') wc++; // IF last character is not space  adding word count mannually "
	    System.out.println("  STRING ANALYSIS ");
		System.out.println("  -------------- ");
		System.out.printf("\n\n");
		System.out.println(" Total Characters  : "+chrc);
		System.out.println(" Alphabets         : "+ac);
		System.out.println(" Capitals Letters  : "+Cc);
		System.out.println(" Small    Letters  : "+Smc);
		System.out.println(" Numbers           : "+nc);
		System.out.println(" Spaces            : "+sc);
	   	System.out.println(" Symbols           : "+oc);
	   	System.out.println(" Words             : "+wc);

		
	}

	 
	 
	}
	
	
	
	
	

 
