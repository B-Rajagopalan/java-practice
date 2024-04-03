package employee2;

public class EmployeeLogic {

	Employee[] emp = new Employee[2];
	private static int count = 0 ;

	public int getCount() {
		return count;
	}

	public void addEmployee(Employee employee) {	
		emp[count++] = employee;
	}

//	Method To Display Employee

	public void displayEmp() {

		if (count == 0) {
			System.out.println("NO RECORDS TO DISPLAY\n"); return ;
		}
		
		for (int i = 0; i < emp.length; i++) {
			if (emp[i] != null) 
				emp[i].toString();
		}
	}

	

//	Method To Search Employee By id 

	public void searchEmployee(int id) {
	
		if (count == 0) {
			System.out.println("NO RECORDS TO SEARCH\n"); return ;
		}
		
		for (int i = 0; i < emp.length; i++) {
			if (emp[i] != null && emp[i].getEmpId() == id) {
				System.out.println("\n EMPOYEE PRESENT IN THE LIST IN INDEX " + i);
				emp[i].toString();
				return;
			}
		}
			 System.out.println("NO RECORDS FOUND IN PARTICULAR ID...\n");
	}

//	Method To Remove Employee   

	public void removeEmp(int id) {
		
		if (count == 0) {
			System.out.println("NO RECORDS TO REMOVE\n"); return ;
		}
		
		for (int i = 0; i < emp.length; i++) {
			if (emp[i] != null) {
				if (emp[i].getEmpId() == id) {
					for (int j = i; j < emp.length - 1; j++) {
						emp[j] = emp[j + 1];
					}
					emp[emp.length - 1] = null;
					count--;
					System.out.println(" EMPLOYEE REMOVED SUCCESSFULLY...\n");
					return;
				}
			}
		}
		System.out.println("NO RECORDS FOUND IN PARTICULAR ID...\n");
	}
}
