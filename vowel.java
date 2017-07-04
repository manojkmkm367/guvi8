
	import java.io.IOException;

import java.util.*;
	public class Number {
		  public static void main(String[] args)throws IOException
		  {
			  Scanner in=new Scanner(System.in);
			  char a=in.next().charAt(0);
			  int x=0;
			 if(a=='a' || a=='e' || a=='i'|| a=='o' || a=='u')
				 x=1;
			 else  if(a=='A' || a=='E' || a=='I'|| a=='O' || a=='U')
			  x=1;
		
			  if(x==1)
				  System.out.println("VOWEL");
			  else
				  System.out.println("CONSONANT");
			  
		  }
}
