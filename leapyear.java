
	import java.io.IOException;

import java.util.*;
	public class Number {
		  public static void main(String[] args)throws IOException
		  {
			  Scanner in=new Scanner(System.in);
			  int a=in.nextInt(); 
			 if(!(a%400 ==0)&& a%4==0)
				 System.out.println("leap year");
			 else
				 System.out.println("NOT");
			
			  
		  }
}
