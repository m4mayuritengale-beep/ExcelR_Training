package day2;


import java.util.Scanner;

public class AdditionTwoHeights {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);   //ctrl + shitt + O (Orange)
		
		System.out.println("Please enter height of person 1");
		double height1=sc.nextDouble();
		System.out.println("Please enter height of person 2");
		double height2=sc.nextDouble();
		
		double sumHeight=height1+height2;
		System.out.println("The Sum of heights is  " +sumHeight);
		sc.close();

	}

}



