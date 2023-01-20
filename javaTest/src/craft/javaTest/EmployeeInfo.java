package craft.javaTest;

import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
System.out.println("Enter your Name");
String name = in.next();
System.out.println("Enter your Age");
int age = in.nextInt();
System.out.println("Enter your Salary");
double salary = in.nextDouble();
in.close();

	}

}
