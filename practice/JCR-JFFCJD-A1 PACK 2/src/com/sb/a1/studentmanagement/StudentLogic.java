package com.sb.a1.studentmanagement;

import java.util.Scanner;

public class StudentLogic {
	Scanner scanner = new Scanner(System.in);

	Student[] student = new Student[2];

	private static int count = 0;

	public int getCount() {
		return count;
	}

	public void addStudent(Student stud) {
		student[count++] = stud;
	}

	public void displayStudent() {
	
			if (count != 0) {
				for (int i = 0; i < student.length; i++) {
					if (student[i] != null)
						student[i].toString();
				}
			} else {
				System.out.println("NO RECORDS TO DISPLAY");
				System.out.println("-----------------------------------------");
			}
		
	}
	

	public void searchStudent(int id) {

		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && student[i].getStudentId() == id) {
				System.out.println("\n STUDENT PRESENT IN THE LIST IN INDEX " + i);
				student[i].toString();
				return;
			}
		}
		System.out.println("\nNO RECORDS FOUND IN PARTICULAR ID...\n");
	}
	
	public void removeStudent(int id) {

		if (count == 0) {
			System.out.println("\nNO RECORDS TO SEARCH\n");
			return;
		}

		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				if (student[i].getStudentId() == id) {
					for (int j = i; j < student.length - 1; j++) {
						student[j] = student[j + 1];
					}
					student[student.length - 1] = null;
					count--;
					System.out.println("\n STUDENT REMOVED FROM DATABASE SUCCESSFULLY...\n");
					return;
				}
			}
		}
		System.out.println("\nNO RECORDS FOUND IN PARTICULAR ID...\n");
	}

}
