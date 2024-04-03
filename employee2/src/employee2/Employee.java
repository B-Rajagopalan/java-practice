package employee2;

public class Employee implements Comparable<Object>{
	private int empId ;
	private String empName  ;
	private int  empAge ;
	private char empGender ;
	private double empSal ;
	private long empPhone ;
	private String empLoc ;
	
	
	public Employee(int empId, String empName, int empAge, char empGender, double empSal, long empPhone,
			String empLoc) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empGender = empGender;
		this.empSal = empSal;
		this.empPhone = empPhone;
		this.empLoc = empLoc;
	}
	
	
	


@Override
	public String toString() {
	System.out.println("________________________________________");
	System.out.println(" EMPLOYEE Id   :: " + empId);
	System.out.println(" EMPLOYEE NAME :: " + empName);
	System.out.println(" EMPLOYEE AGE :: " + empAge);
	System.out.println(" EMPLOYEE GENDER :: " + empGender);
	System.out.println(" EMPLOYEE SALARY :: " + empSal);
	System.out.println(" EMPLOYEE PHONE :: " + empPhone);
	System.out.println(" EMPLOYEE LOCATION :: " + empLoc + "\n");
	System.out.println("________________________________________");
		return "" ;
	}

	//	Getter & Setter Methods
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public char getEmpGender() {
		return empGender;
	}
	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public long getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(long empPhone) {
		this.empPhone = empPhone;
	}
	public String getEmpLoc() {
		return empLoc;
	}
	public void setEmpLoc(String empLoc) {
		this.empLoc = empLoc;
	}
	@Override
	public int compareTo(Object obj) {
		Employee e = (Employee)obj;
		if (this.empSal > e.empSal) {
			return +1 ;
		}
		else if (this.empSal > e.empSal) {
			return -1 ;
		}
		else
		{
		return 0;
		}
	}
}
