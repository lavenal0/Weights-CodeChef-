/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		int W,X,Y,Z,T;
		Scanner obj=new Scanner(System.in);
		T=obj.nextInt();
		for(int i=1;i<=T;i++){
		    W=obj.nextInt(); 
		    X=obj.nextInt();
		    Y=obj.nextInt();
		    Z=obj.nextInt();
		    
		    if(W==Y+Z || W==X+Y ||W==X+Y+Z || W==Z+X || W==X || W==Y || W==Z ){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    }
		}
	}

