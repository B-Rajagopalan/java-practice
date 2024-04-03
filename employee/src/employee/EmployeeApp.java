package employee;

import java.util.Scanner;

public class EmployeeApp 
{
	public static void main(String[] args) 
	{
		EmployeeLogic employee = new EmployeeLogic();
		
		while(true)
		{
			System.out.print("1.Add Employee\n2.Display Employee\n3.Search Employee\n"
					+"4.Remove Employee\n5.Exit\n\tChoose : ");
			
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
			{
				System.out.println("Enter emp id : ");
				int empid = sc.nextInt();
				System.out.println("Enter emp name : ");
				String empname = sc.next();
				System.out.println("Enter emp sal : ");
				double empsal = sc.nextDouble();
				
				employee.addEmployee(empid,empname,empsal);
				break;
			}
			case 2:
			{
				employee.displayEmployees();
				break;
			}
			case 3:
			{
				System.out.println("Enter the Employee Id you need to search : ");
				int id=sc.nextInt();
				
				employee.searchById(id);
				break;
			}
			case 4:
			{
				System.out.println("Enter the Employee Id you need to remove : ");
				int id=sc.nextInt();
				
				employee.removeEmployee(id);
				break;
			}
			default:
			{
				System.out.println("\t\tThank you!");
				sc.close();
				System.exit(0);
			}
			}
		}
	}
}
