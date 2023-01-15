package employeeInfo;

import java.util.Scanner;

public class employee2 {
	
	public static void main(String[] args) {
		Scanner in  = new Scanner (System.in);
		
		System.out.println("Enter First Name");
		String firstName = in.next();
		System.out.println("Enter Last Name");
		String lasttName = in.next();
		System.out.println("Enter Age");
		int age = in.nextInt();
		System.out.println("Enter Salary");
		double salary = in.nextDouble();
		System.out.println("Enter Bonus");
		double bonus = in.nextDouble();
		System.out.println("Enter Total Salary");
		double totSalary = in.nextDouble();
		
		
		
	}

}
