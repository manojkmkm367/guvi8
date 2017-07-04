
	import java.io.IOException;

import java.util.*;
	public class Number {
		  public static void main(String[] args)throws IOException
		  {
			  Scanner in=new Scanner(System.in);
			  int n=in.nextInt(); 
			  int x=0;
			for(int i=0;n!=0;i++)
			{
				n=n/10;
				x++;
			}
			
			
			  System.out.println(x);
		  }
}
