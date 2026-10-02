package day2;

import java.util.Scanner;

public class AddHeightOfTwoPeople {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter height of first person: ");
		double height1 = sc.nextDouble();
		
		System.out.print("Enter height of second person: ");
		double height2 = sc.nextDouble();
		
		double totalHeight = height1 + height2;
		
		System.out.println("Total height of two people: " + totalHeight);
		
		sc.close();
	}
}
