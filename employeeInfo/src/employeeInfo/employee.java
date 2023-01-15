package employeeInfo;

public class employee {

	public static void main(String[] args) {
		
		String firstName;
		firstName = "Abebe";
		String lastName = "Miki";
		int age = 29;
		double salary = 200.49;
		double bonus =100;
		
		double totSalary = (salary + bonus);
		
//		System.out.println(firstName);
//		System.out.println(lastName);
//		System.out.println(age);
//		System.out.println(salary);
//		System.out.println(bonus);
		
		System.out.println("First Name :" + firstName);
		System.out.println("Last Name :" + lastName);
		System.out.println("Age :" + age);
		System.out.println("Salary :" + salary);
		System.out.println("Bonus :" + bonus);
		System.out.println("Total Salary :" + totSalary);
		
	}
	
	
}
