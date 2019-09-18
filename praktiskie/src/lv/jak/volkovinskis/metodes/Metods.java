package lv.jak.volkovinskis.metodes;						
import java.util.Scanner;
public class Metods {

	
	
		
		            
			public static void main(String arg[])	
			{
				@SuppressWarnings(" resource ")
		                int i ;
				 		int n ;
				 		int sum = 0;		
				 		
				 		{	
				 Scanner input = new Scanner(System.in);
		         System.out.println("Ievadi skaitli : ");
		                
		         n = input.nextInt() ;
				 		}
		         System.out.println("Ievadiji" +n+ " naturalos skaitljus");
		         for(i=1; i <= n ; i++ ) { 
		         
		        	 System.out.print(i + " ");
		        	 sum += i ;
		         }
		                System.out.print("\nNatralo skaitiju summu ir: " + sum);
		  }
		}