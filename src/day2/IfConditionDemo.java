package day2;

import java.util.Scanner;

public class IfConditionDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your percentage");       
		
		double percentage=sc.nextDouble();  
		
		
		if(percentage>=40.0)  //  is 38.5>=40.0  
		{					  
			System.out.println("Pass");   
		}
		else			
		{
			System.out.println("Not Pass");   
		}

		
		System.out.println("Thank You!!!"); 
		sc.close();
	}

}
