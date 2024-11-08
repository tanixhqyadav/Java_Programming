/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class flatland
{
    static void circle(){
            int n=read.nextInt();
		    int c=0;
		    while(n!=0)
		    {
		        double m=Math.floor(Math.sqrt(n));
		        n-=(m*m);
		        c++;
		    }
		    System.out.println(c);
    }
        
    	static	Scanner read=new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception
	{
	
		int t=read.nextInt();
		while(t-->0){
		    circle();
		}
	}
}