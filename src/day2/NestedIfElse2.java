/*
 * monthlySalary >= 75,000   Excellent
 * monthlySalary >= 60,000   V Good
 * monthlySalary >= 50,000   Good
 * monthlySalary >= 25000    OK
 * monthlySalary < 25000     Not OK
 */
package day2;

import java.util.Scanner;

public class  NestedIfElse2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter monthly salary: ");
		double monthlySalary = sc.nextDouble();

		if (monthlySalary >= 75000) {
			System.out.println("Excellent");
		} else {
			if (monthlySalary >= 60000) {
				System.out.println("V Good");
			} else {
				if (monthlySalary >= 50000) {
					System.out.println("Good");
				} else {
					if (monthlySalary >= 25000) {
						System.out.println("OK");
					} else {
						System.out.println("Not OK");
					}
				}
			}
		}

		sc.close();
	}
}