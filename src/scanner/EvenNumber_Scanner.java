package scanner;

import java.util.Scanner;

public class EvenNumber_Scanner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from number and to number : ");
		
		//int from,to;
		
		int from = sc.nextInt();
		int to = sc.nextInt();
		
		for(int i=from; i<=to;i++)
		{
			if (i%2==0) 
			{
			 System.out.println(i+" is even number");	
			}
			else 
			{
				System.out.println(i+"is not a even number");
			}
			}
		}
		

	}


