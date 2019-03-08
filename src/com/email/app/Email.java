package com.email.app;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;

	private int defaultPasswordLength = 10;
	public Email(String firstname, String lastname) {
		System.out.println("Welcome to email mangement System ");
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email created : "+this.firstname+" "+this.lastname);
		this.department = setDepartment();
		System.out.println("Department : "+department);
		this.password = randomPaswword(defaultPasswordLength);
		System.out.println("Password is : "+password);
		
	}
	// Set the department
	private String setDepartment() {
		System.out.println("Departmnet Codes :\n 1. Sales.\n 2. Developement.\n 3. Accountants.\n 0. none.\n Enter the Departmnet Codes");
		Scanner sc = new Scanner(System.in);
		int departmentChoice = sc.nextInt();
		if(departmentChoice == 1) {
			return "sales";
		}
		else if(departmentChoice == 1) {
			return "dev";
		}
		else if(departmentChoice == 3) {
			return "accountants";
		}
		else {
			return "";
		}
	}
	// Generate random password
	private String randomPaswword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$&.abcdefghijklmnopqrstuvwxyz";
		char password[] = new char[length];
		for(int i=0; i<length; i++) {
			int random = (int)(Math.random()*passwordSet.length());
//			System.out.println(random);
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
}