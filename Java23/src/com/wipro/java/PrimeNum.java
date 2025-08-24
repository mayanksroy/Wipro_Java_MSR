package com.wipro.java;

public class PrimeNum {
	public static void main(String[] args) {
		int num = 45;
		int count=0;
		
		if(num>1)
		{
			for(int i = 1; i<num+1; i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if(count>2)
			{
				System.out.println("Not Prime " + count);
			}
			else
			{
				System.out.println("Prime " + count);
			}
		}
		else
		{
			System.out.println("Not Prime");
		}
		
	}
}
