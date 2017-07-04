
	import java.io.IOException;

import java.util.*;
	public class Number {
		  public static void main(String[] args)throws IOException
		  {
			  Scanner in=new Scanner(System.in);
			  int a=in.nextInt();
			  int x=0;
			  if(a%2==0)
				  x=1;
			  else
				  x=0;
			  
			  if(x==1)
				  System.out.println("EVEN");
			  else
				  System.out.println("ODD");
			  
		  }
}
