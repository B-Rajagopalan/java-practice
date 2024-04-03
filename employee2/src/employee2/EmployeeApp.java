package employee2;

import java.util.Scanner;

public class EmployeeApp {
	static EmployeeLogic emplog = new EmployeeLogic();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean loop = true;
		while (loop) {
			System.out.println(" PRESS [1] TO ADD EMPLOYEE ");
			System.out.println(" PRESS [2] TO DISPLAY EMPLOYEE DETAILS");
			System.out.println(" PRESS [3] TO SEARCH EMPLOYEE ");
			System.out.println(" PRESS [4] TO REMOVE EMPLOYEE ");
			System.out.println(" PRESS [5] TO EXIT APPLICATION ");

			int casValue = sc.nextInt();

			switch (casValue) {
			
			case 1: {  addEmployee(sc);
			        	break; }
			        	
			case 2: {
				if (emplog.getCount() != 0) {
					emplog.displayEmp();
				} else
					System.out.println("NO RECORDS TO DISPLAY\n");
				    break;
			}

			case 3: { 	System.out.println("ENTER EMPLOYEE ID TO SEARCH FOR LIST");
						int id = sc.nextInt();
						emplog.searchEmployee(id);
						break;
			}

			case 4: { 	System.out.println("ENTER EMPLOYEE ID TO BE REMOVED  ");
						int id = sc.nextInt();
						emplog.removeEmp(id);
						break;
			
			}
			case 5:	{ System.out.println("THANK YOU VISIT AGAIN...");
			    	loop = false;
			    	break; }
			default: {	System.out.println("ENTER A VALID INPUT...");
				break; }

			}
		}
	}

	public static void addEmployee(Scanner sc) {
		if ( emplog.getCount() < emplog.emp.length)
		{
			System.out.println(" ENTER EMPLOYEE ID...");
			int id = sc.nextInt();
			System.out.println(" ENTER EMPLOYEE NAME...");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.println(" ENTER EMPLOYEE AGE...");
			int age = sc.nextInt();
			System.out.println(" ENTER EMPLOYEE GENDER...");
			char gender = sc.next().charAt(0);
			System.out.println(" ENTER EMPLOYEE SALARY...");
			double salary = sc.nextDouble();
			System.out.println(" ENTER EMPLOYEE PHONE...");
			long phone = sc.nextLong();
			sc.nextLine();
			System.out.println(" ENTER EMPLOYEE LOCATION...");
			String location = sc.nextLine();
			Employee employee = new Employee(id, name, age, gender, salary, phone, location);

			emplog.addEmployee(employee);
			System.out.println("EMPLOYEE ADDED SUCCESSFULL....\n");
		}
		else
			System.out.println("NO SPACE LEFT TO STORE EMPLOYEE...");

	}

}
