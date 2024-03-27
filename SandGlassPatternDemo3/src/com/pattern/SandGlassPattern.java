
//Java pattern program to print SandGlass
package com.pattern;

public class SandGlassPattern {

	public static void main(String[] args) 
	{
		
		int l,m,n=23;         //variables declaration
		
		//loop through the each row
		for(l=0;l<n;l++)
		{
			
			//loop through to print stars on each row
			for(m=0;m<n;m++)
			{
				if(l<=m&&l+m<=n-1 || l==m&&l>(n-1)/2 || l==0|| m==(n-1)/2 || l==n-1 || l+m==n-1)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			
			System.out.println();        //Escape to the new line (or) after printing star in each row move to the next line
			
		}
		

	}

}
