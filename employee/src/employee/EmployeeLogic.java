package employee;

public class EmployeeLogic 
{
	EmployeeBluePrint[] employeeArr = new EmployeeBluePrint[4];
	int index=0;
	
	public void addEmployee(int empId, String empName, double empSal)
	{
		EmployeeBluePrint employee = new EmployeeBluePrint();
		employee.setEmployeeId(empId);
		employee.setEmployeeName(empName);
		employee.setEmployeeSal(empSal);
		
		if(index<employeeArr.length) {
			employeeArr[index]=employee;
			index++;
			System.out.println("\nAdded Successfully\n");
		}
		else
			System.out.println("\nEmployee Array is full\n");
		
	}
	
	public void displayEmployees()
	{
		if(employeeArr[0]==null)
			System.out.println("\nNo Employees Found");
		
		for(EmployeeBluePrint employee : employeeArr)
		{
			if(employee!=null)
			{
				System.out.println(employee.getEmployeeId()+"\t"
						+employee.getEmployeeName()+"\t"+employee.getEmployeeSal());
			}
		}
		
		System.out.println();
	}
	
	public void searchById(int id) 
	{
		boolean flag=false;
		
		for(EmployeeBluePrint employee : employeeArr)
		{
			if(employee!=null && employee.getEmployeeId()==id)
			{
				System.out.println(employee.getEmployeeId()+"\t"
						+employee.getEmployeeName()+"\t"+employee.getEmployeeSal());
				flag=true;
			}
		}
		
		if(!flag)
			System.out.println("\nId not found");
		
		System.out.println();
	}
	
	public void removeEmployee(int id)
	{
		boolean flag=false;
		
		for(int i=0;i<employeeArr.length;i++)
		{
			if(employeeArr[i]!=null)
			{
				if(employeeArr[i].getEmployeeId()==id)
				{
					for(int j=i;j<employeeArr.length-1;j++)
					{
						employeeArr[j]=employeeArr[j+1];
					}
					employeeArr[employeeArr.length-1]=null;
					flag=true;
					index--;
					System.out.println("\nRemoved Successfully\n");
				}
			}
		}
		
		if(!flag)
			System.out.println("\nId not found\n");
	}
}
