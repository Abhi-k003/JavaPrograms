package scanner;

import java.util.Scanner;

public class StdDetails 
{
	
	public static void main(String[] args) 
	{
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the name : ");
	 String name = s.nextLine();
	 
     System.out.println("Enter the age : ");
     int age = s.nextInt();
     
     System.out.println("Enter percentage : ");
     float percentage = s.nextFloat();
    
     System.out.println("Enter result status : ");
     boolean result = s.nextBoolean();
     
     System.out.println("Enter contact number : ");
     long contact = s.nextLong();
     
     char gender;
     System.out.println("enter the gender : ");
     gender = s.next().charAt(0);
     
     System.out.println("THE STUDENT DATAILS ENTER BY USERS ARE");
     System.out.println("name : "+name);
     System.out.println("age : "+age);
     System.out.println("contact : "+contact);
     System.out.println("percentage : "+percentage);
     System.out.println("status : "+result);
     System.out.println("gender : "+gender);
	}

}
