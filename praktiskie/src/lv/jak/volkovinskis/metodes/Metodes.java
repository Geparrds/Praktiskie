package lv.jak.volkovinskis.metodes;						
import java.util.Scanner;
public class Metodes {

	
	
		
		            
			public static void main(String arg[])	
			{
		                  int n;
		                  int s=0,a[];                  
		                  Scanner sc=new Scanner(System.in);
			   System.out.println("Ievadiet numuru skaitu cik gribat izvadit sumu");	 
		                  n=sc.nextInt();
		                  a=new int[n]; 
			   System.out.println("Ievadeit "+n+" numurus ");
		                  for(int i=0;i<n;i++)
		                  {      
			             System.out.println("Ievadiet numuru   "+(i+1)+":");
		                            a[i]=sc.nextInt();
		                  }
			   s=Metodes.sumofnum(a,n);	    
		                  System.out.println("summa ir ="+s);                 
		              	}
		    static int sumofnum(int a[],int n)
		   {       int s1=0;
		             for(int i=0;i<n;i++)
		                     {        
		                            s1+=a[i];
		                           
		                      }
		              return s1;
		  }
		}