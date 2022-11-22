package scanner;

import java.util.Scanner;

public class Prime_Number_Scanner 
{
	public static void findPrimeNumber(int num) 
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if (num%i==0) 
			{
				count++;
			}
		}
		if (count==2) 
		{
		 System.out.println(num+" is prime");	
		}
		else 
		{
		 System.out.println(num+" is not a prime");	
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the prime number : ");
		int ip = sc.nextInt();
		findPrimeNumber(ip);
		sc.close();
		

	}

}
