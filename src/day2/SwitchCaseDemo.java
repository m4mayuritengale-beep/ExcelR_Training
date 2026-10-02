package day2;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) 
	{
		Scanner    sc          = new Scanner(System.in);   
	
		System.out.println("1. English");       
		System.out.println("2. Hindi");
		System.out.println("3. Marathi");
		
		System.out.println("Enter Choice");  
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("Call routed to London"); break; 
		
		case 2: System.out.println("Call routed to Delhi");  break; 
		
		case 3: System.out.println("Call routed to Mumbai"); break;   

		default : System.out.println("Invalid Input");
		}
		

		
		System.out.println("Have a nice day ahead!!!");  
		sc.close();
	}

}
