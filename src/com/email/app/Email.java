package com.email.app;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int emailCapcity = 500;
	private String alternateEmail;
	private String changePassword;
	private String companyName = "uohyd";
	private int defaultPasswordLength = 8;
	
//	Constructor to receive First and last name.		
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		
//		calling department method.
		this.department = setDepartment();
//		System.out.println("Department : "+department);
		
//		calling password method.
		this.password = randomPaswword(defaultPasswordLength);
		
		
//		Combine elements to generate email 
		email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companyName+".com";
		System.out.println("Newly created email is : "+email);
		System.out.println("Password is : "+password);
	}
//	 Set the department
	private String setDepartment() {
		System.out.println("Departmnet codes :\n 1. Sales.\n 2. Developement.\n 3. Accountants.\n 0. none.\n Enter the Department Codes");
		Scanner sc = new Scanner(System.in);
		int departmentChoice = sc.nextInt();
		if(departmentChoice == 1) {
			return "sales";
		}
		else if(departmentChoice == 2) {
			return "dev";
		}
		else if(departmentChoice == 3) {
			return "accountants";
		}
		else {
			return "";
		}
	}
//	 Generate random password
	private String randomPaswword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$&.abcdefghijklmnopqrstuvwxyz";
		char password[] = new char[length];
		for(int i=0; i<length; i++) {
			int random = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
// Set mail box capacity
	public void setMailBoxCapcity(int capcity) {
		this.emailCapcity = capcity;
	}

//	set alternate Email
	public void setEmail(String email) {
		this.email = email;
	}

//	set password
	public void setPassword(String password) {
		this.password = password;
	}
	
//	Mail box capacity
	public int getMailCapacity() {
		return emailCapcity;
	}
	
//	Alternate email
	public String getAlternateEmail() {
		return alternateEmail;
	}
//	Change Password
	public String getPassword() {
		return password	;
	}

//	Show details
	public String showInfo() {
		System.out.println("\nEmployee information");
		return "Display Name :"+firstname+" "+lastname+"\nEmail :"+email+" "+"\nMailBox capcity : "+emailCapcity+"mb";	
	}
	
}