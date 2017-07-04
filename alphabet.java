import java.io.IOException;

import java.util.*;
	public class Number {
		  public static void main(String[] args)throws IOException
		  {
			  Scanner in=new Scanner(System.in);
			  char a=in.next().charAt(0);
			  int x=0;
			 if(a>='a' && a<='z')
				 x=1;
			 else if(a>='A' && a<='Z')
			  x=1;
			 else
				 x=0;
		
			  if(x==1)
				  System.out.println("YES");
			  else
				  System.out.println("NO");
			  
		  }
}
