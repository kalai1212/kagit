package org.emp;

import java.util.Scanner;

public class Employee {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
System.out.println("Enter empid");
int empid = s.nextInt();
System.out.println("Employee id is:"+empid);

System.out.println("Enter empName");
s.nextLine();
String name = s.nextLine();
System.out.println("Employee name is:"+name);

System.out.println("Enter empEmail");
String email = s.nextLine();
System.out.println("Email id is:"+email);
System.out.println("Enter empCity");
String city = s.next();
System.out.println("Employee city is:"+city);
System.out.println("Enter empSalary");
float salary  = s.nextFloat();
System.out.println("Employee salary is:"+salary);
System.out.println("Enter empPhoneno");
long phoneno = s.nextLong();
System.out.println("Employee phoneno is:"+phoneno);
System.out.println("Enter empGender");
String gender = s.next();
System.out.println("Employee gender is:"+gender);
}
}