package com.sb.a1.studentmanagement;

import java.util.Scanner;

public class StudentApp {
	
	static StudentLogic studentLogic = new StudentLogic();
	

		public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			option(scanner);
		}
		
		
		public static void option(Scanner scanner)
		{
			boolean loop = true ;
			while(loop)
			{
					try {
						System.out.println(" \n PRESS [1] TO ADD STUDENT \n PRESS [2] TO DISPLAY ALL STUDENT DETAILS \n"
								+ " PRESS [3] TO SEARCH STUDENT \n PRESS [4] TO REMOVE STUDENT \n PRESS [5] TO EXIT APPLICATION \n");
						int caseValue = scanner.nextInt();
						
						switch(caseValue) {
						case 1 : addStudent(scanner); break ;
						case 2 : studentLogic.displayStudent(); break ;
						case 3 : searchStudent(scanner); break ;
						case 4 : removeStudent(scanner); break ;
						case 5 : loop = false; System.out.println("THANK YOU....");scanner.close(); break ;
						default : System.err.println("ENTER A VALID INPUT...");
						}
					}
					catch(Exception e)
					{
						System.err.println(e);
					}
			}
			
		}
		
		public static void addStudent(Scanner scanner)
		{
			if (studentLogic.getCount() < studentLogic.student.length) {
				System.out.println("ENTER STUDENT ID...");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("ENTER STUDENT NAME...");
				String name = scanner.nextLine();
				System.out.println("ENTER STUDENT AGE...");
				int age = scanner.nextInt();
				System.out.println("ENTER STUDENT GENDER...");
				char gender = scanner.next().charAt(0);
				System.out.println("ENTER STUDENT PHONE...");
				long phone = scanner.nextLong();
				scanner.nextLine();
				System.out.println("ENTER STUDENT DEPARTMENT");
				String dept = scanner.nextLine();
				System.out.println("ENTER STUDENT LOCATION...");
				String location = scanner.nextLine();
				Student student = new Student(id, name, age, gender, phone, dept , location);
				
				studentLogic.addStudent(student);
				System.out.println("STUDENT ADDED SUCCESSFULL....\n");
				System.out.println("--------------------------------------------------------");
			} else
				System.out.println("NO MEMORY LEFT TO ADD STUDENT...\n");
		}
		
		public static void searchStudent(Scanner scanner)
		{
			if (studentLogic.getCount() != 0) {
				System.out.println("ENTER STUDENT ID TO SEARCH");
				int id = scanner.nextInt();
				studentLogic.searchStudent(id);
				
			}
			else
			{
				System.out.println("NO STUDENTS ADDED IN DATABASE");
			}
			
		}
		
		public static void removeStudent(Scanner scanner)
		{
			if(studentLogic.getCount() == 0)
			{
				System.out.println("NO RECORDS TO REMOVE ");
			}
			else
			{
				System.out.println("ENTER STUDENT ID TO REMOVE");
				int id = scanner.nextInt();
				studentLogic.removeStudent(id);
			}
		}
	
}
