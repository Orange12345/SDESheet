package com.practice.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of Input : ");
		int n=Integer.parseInt(bufferedReader.readLine());
		System.out.println("......Calling first Pattern....... ");
		System.out.println();
		calledfirstpattern(n);
		System.out.println("......Calling Second Pattern....... ");
		System.out.println();
		calledsecondpattern(n);
		System.out.println("......Calling Third Pattern....... ");
		System.out.println();
		calledthirdpattern(n);
		System.out.println("......Calling Fourth Pattern....... ");
		System.out.println();
		calledfourthpattern(n);
		System.out.println("......Calling Fifth Pattern....... ");
		System.out.println();
		calledfifthpattern(n);
		System.out.println("......Calling Sixth Pattern....... ");
		System.out.println();
		calledsixthpattern(n);
		System.out.println("......Calling Seventh Pattern....... ");
		System.out.println();
		calledseventhpattern(n);
		System.out.println("......Calling Eight Pattern....... ");
		System.out.println();
		calledeighthpattern(n);
		System.out.println("......Calling Ninth Pattern....... ");
		System.out.println();
		calledninthpattern(n);
		System.out.println("......Calling Tenth Pattern....... ");
		System.out.println();
		calledtenthpattern(n);
		System.out.println("......Calling Eleventh Pattern....... ");
		System.out.println();
		calledeleventhpattern(n);
		System.out.println("......Calling Twelveth Pattern....... ");
		System.out.println();
		calledtwelvethpattern(n);
		System.out.println("......Calling Thirteenth Pattern....... ");
		System.out.println();
		calledthirteenthpattern(n);
		System.out.println("......Calling fourteenth Pattern....... ");
		System.out.println();
		calledfourteenthpattern(n);
		System.out.println("......Calling fiftinth Pattern....... ");
		System.out.println();
		calledfiftinthpattern(n);
		System.out.println("......Calling sixtinth Pattern....... ");
		System.out.println();
		calledsixtinthpattern(n);
		System.out.println("......Calling seventith Pattern....... ");
		System.out.println();
		calledseventithpattern(n);
		System.out.println("......Calling eighteen Pattern....... ");
		System.out.println();
		calledeighteenpattern(n);
		System.out.println("......Calling Ninteen Pattern....... ");
		System.out.println();
		callednineteenpattern(n);
		System.out.println("......Calling Twentyth Pattern....... ");
		System.out.println();
		calledtwentythpattern(n);
		System.out.println("......Calling TwentyOneth Pattern....... ");
		System.out.println();
		calledtwentyonethpattern(n);
		
		System.out.println("......Calling TwentyTwoeth Pattern....... ");
		System.out.println();
		calledtwentytwoethpattern(n);
	}
	private static void calledtwentytwoethpattern(int n) {
		for(int i=1;i<n*2;i++)
		{
			for(int j=1;j<n*2;j++)
			System.out.print(n);
		}
		
	}
	private static void calledtwentyonethpattern(int n) {
		for(int i=n;i>=1;i--)
		{
			if(i==1 || i==n)
			{
				for(int j=n;j>1;j--)
				{
					System.out.print("*");
				}
			}
			else
			{
				System.out.print("*");
				for(int k=n-3;k>=1;k--)
				{
					System.out.print(" ");
				} 
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	private static void calledtwentythpattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=2*n-2*i;k++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			for(int k=2*n-2*i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	private static void callednineteenpattern(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n ;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<2*i;k++)
			{
				System.out.print(" ");
			}
			for(int p=i;p<n;p++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int q=0;q<n;q++)
		{
			for(int j=0;j<=q;j++)
			{
				System.out.print("*");
			}
			for(int k=2*n-2-q;k>q;k--)
			{
				System.out.print(" ");
			}
			for(int p=0;p<=q;p++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	private static void calledeighteenpattern(int n) {
		for(int i=(65+n);i>=65;i--)
		{
			for(int j=i;j<=(65+n);j++)
			{
				System.out.printf("%c", j);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	private static void calledseventithpattern(int n) {
		for(int i=65;i<=(65+n);i++) {
			for(int j=(65+n)-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=65;k<=i;k++)
			{
				System.out.printf("%c", k);
			}
			for(int p=i-1;p>=65;p--)
			{
				System.out.printf("%c", p);
			}
			System.out.println();
		}
		
	}
	private static void calledsixtinthpattern(int n) {
		for(int i=65;i<=(65+n);i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.printf("%c",i);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	private static void calledfiftinthpattern(int n) {
		for(int i=65;i<=(n+65);i++)
		{
			for(int j=i;j<=(n+65);j++)
			{
				System.out.printf("%c",j);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	private static void calledfourteenthpattern(int n) {
		for(int i=65;i<=(n+65);i++)
		{
			for(int j=65;j<=i;j++)
			{
				System.out.printf("%c",j);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	private static void calledthirteenthpattern(int n) {
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+++" ");
			}
			System.out.println();
		}
		
	}
	
	private static void calledtwelvethpattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=2*n-2*i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int p=i;p>=1;p--)
			{
				System.out.print(p);
			}
			System.out.println();
		}		
	}
	private static void calledeleventhpattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(j%2!=0)
				{
					System.out.print(1+" ");
				}
				else 
					System.out.print(0+" ");
			}
			System.out.println();
		}
	}
	private static void calledtenthpattern(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int p=n-1;p>0;p--)
		{
			for(int q=0;q<p;q++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void calledninthpattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int p=n-1;p>=1;p--)
		{
			for(int q=0;q<n-p;q++) {
				System.out.print(" ");
			}
			for(int r=1;r<=2*p-1;r++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
	private static void calledeighthpattern(int n) {
		for(int i=n;i>=1;i--)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void calledseventhpattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void calledsixthpattern(int n) {
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
	private static void calledfifthpattern(int n) {
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	private static void calledfourthpattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}
	private static void calledthirdpattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	private static void calledsecondpattern(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	public static void calledfirstpattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
