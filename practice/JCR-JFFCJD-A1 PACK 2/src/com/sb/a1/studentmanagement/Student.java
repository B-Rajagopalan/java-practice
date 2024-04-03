package com.sb.a1.studentmanagement;

public class Student {
		private int studentId ;
		private String studentName ;
		private int studentAge ;
		private char studentGender ;
		private long studentPhone ;
		private String studentDept ;
		private String studentLocation ;
		
		
		public Student(int studentId, String studentName, int studentAge, char studentGender, long studentPhone,
				String studentDept, String studentLocation) {
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentAge = studentAge;
			this.studentGender = studentGender;
			this.studentPhone = studentPhone;
			this.studentDept = studentDept;
			this.studentLocation = studentLocation;
		}
		
		
		
		
		@Override
		public String toString() {
			System.out.println("____________________________________");
			System.out.println(" STUDENT ID :: " + studentId );
			System.out.println(" STUDENT NAME :: " + studentName );
			System.out.println(" STUDENT AGE :: " + studentAge);
			System.out.println(" STUDENT GENDER :: " + studentGender);
			System.out.println(" STUDENT PHONE :: " + studentPhone);
			System.out.println(" STUDENT DEPARTMENT :: " + studentDept);
			System.out.println(" STUDENT LOCATION :: " + studentLocation);
			System.out.println("____________________________________");
			return "" ;
		}




		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public int getStudentAge() {
			return studentAge;
		}
		public void setStudentAge(int studentAge) {
			this.studentAge = studentAge;
		}
		public char getStudentGender() {
			return studentGender;
		}
		public void setStudentGender(char studentGender) {
			this.studentGender = studentGender;
		}
		public long getStudentPhone() {
			return studentPhone;
		}
		public void setStudentPhone(long studentPhone) {
			this.studentPhone = studentPhone;
		}
		public String getStudentDept() {
			return studentDept;
		}
		public void setStudentDept(String studentDept) {
			this.studentDept = studentDept;
		}
		public String getStudentLocation() {
			return studentLocation;
		}
		public void setStudentLocation(String studentLocation) {
			this.studentLocation = studentLocation;
		}
		
		
		
		
		
}
