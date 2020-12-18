Q.1 Create a program to Assign username & password in a method and display the username, password in a different function.
Ans)
package practise;

public class A1 {

	private String username;
	private String password;
	
	public void getDetails(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	
	public void showDetails()
	{
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
	}
	
	public static void main(String[] args) {
		A1 p=new A1();
		
		p.getDetails("Amita@bc","amitjadhav");
		p.showDetails();
	}

}
=============================================================================================================================================================
Q.2 Write a program to Define employee Company as static and display the details of employee like eid,ename,salary with company name for 5 employees.
Ans) package pck1;

class class1
{
	private int eid;
	private String name;
	private double salary;
	private String company;
	
	void setdata(int eid,String name,double salary,String company)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.company=company;
	}
	
	
	void showdata()
	{

		System.out.println("eid : "+eid);
		System.out.println("name : "+name);
		System.out.println("salary : "+salary);
		System.out.println("company : "+company);
	}
}


public class a2 {

	public static void main(String[] args) {
		class1 e1=new class1();
		class1 e2=new class1();
		class1 e3=new class1();
		class1 e4=new class1();
		class1 e5=new class1();
		
		
		e1.setdata(101,"john",20000,"DIGIT");
		e2.setdata(102,"rohan",40000,"HV");
		e3.setdata(103,"neha",30000,"SONY");
		e4.setdata(104,"jiya",70000,"NOKIA");
		e5.setdata(105,"tina",90000,"AIRTEL");
		
		e1.showdata();
		e2.showdata();
		e3.showdata();
		e4.showdata();
		e5.showdata();


	}

}
===========================================================================================================================================
Q.3 Create a method in a class which accepts a double and integer parameters and display the multiplication of passed values.
Ans)
package pck1;

public class a3 {

	public static void main(String[] args) {
		
		double x=2.5;
		int y=20;
		
		System.out.println("Multilication : "+(x*y));
	}

}
==========================================================================================================
Q.4 Write a program where a class is having a function as display() which declares a city code as a local variable in it and give some default city code value in it. 
    Display () method display the city name which is passed to this method along with the city code.
Q.5 Write a program to enter a year and check if the year is a leap year or not.
Ans)
package practise;

import java.util.Scanner;

public class A5 {


	public void check(int x)
	{
		if(x%4==0)
			System.out.println("leap year ");

		else
			System.out.println(" not leap year ");
		
		
	}

	public static void main(String[] args) {
		
		A5 p=new A5();
		
		Scanner s=new Scanner(System.in);
		
		int x;
		
		System.out.println("Enter a year : ");
		x=s.nextInt();
		
		p.check(x);
		
		s.close();
		
	}

}
=======================================================================================================================

Q.6 Create a program to check for a number entered by user is Positive , negative or zero.
Ans) package pck1;

import java.util.Scanner;

public class a6 {


	public void check(int num)
	{
		if(num>0)
			System.out.println(" is positive ");
		else if(num<0)
			System.out.println(" is negative ");
		else
			System.out.println(" is zero ");
		
		
	}

	public static void main(String[] args) {
		
		a6 p=new a6();
		
		Scanner s=new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter a number : ");
		num=s.nextInt();
		
		p.check(num);
		
		s.close();
		
	}

}
==================================================================================================================================================================
Q.7 Write a program to enter the height of a person in cm and weight of a person in kg, Calculate the BMI. If BMI value is less tha 18.5 then show "Underweight",
     BMI is in range from 18.5 to 24.9 show "Normal Weight" , If range is 25 to 25.9 then show "Overweight" otherwise show "Obesity"
     
     
     Q.8 Create a class Employee . Declare name, yearOfExperiance, Salary. Create a method which takes the details from user. Take records of 5 employees using Array of 
    objects. Create a method which checks the years of experiance of an employee. If Experiance is more than 3 years then Give 5000/- Rs Bonus to the employees .
    If Experiance is more than 1 year & less than 3 years then Give bonus of 1000/- Rs. If Experiance is less than 1 year , no bonus will be given. Display the 
    Updated details of every employee.
Q.9 Write a program to create a Menu based program where perform the following operations.
    Product (Class) : pid,pname,Description,cost
    1. Display List of 5 products.
    2. Display all products in Capital case
    3. Display the Total cost of All products.
    4. Dipslay average Cost of All products.
    5. Display only Product Name and cost.
Q.10 Create an array of names of 3 students and display names with length.
Q.11 Make an array of 10 numbers and print the average of only even numbers.
Q.12 Create an array of 5 double values and use foreach loop to print every value.
Ans)
package pck1;

public class P14 {

	public static void main(String[] args) {
		
		double numbers[]= {2.4,1.3,3.2,2.6,2.2};
		
	
		
		for(double x : numbers)
		{
			System.out.print(x+" , ");
		}

}
}
===============================================================================================

Q.13 Write a program to make a class as Factorial where calculate the factorial in a function the function returns the factorial of the passed number to this function. 
     Print the factorial of the number.

Q.14 Create a Class Alphabets which is printing Capital case alphabets in its member method. Create another Class where a main function resides. In main method create 
    the object of Alphabets class and call the method which is printing alphabets.

Q.15 Write a program to create a method in a class which takes the first name as first parameter and last name as second parameter. This method returns the full name. 
    Print full name.

Q.16 Write a program to overload a method named as getResult() 3 times , first definition prints the cube of passed number. Second function prints square of passed 
     number. Third definition print that number.

Q.17 Write a program to find the sum of digits of a number.

Q.18 Write a program to create two objects of a class named as Numbers. In which there is a function getMax(). Assign a value for a number to every object and 
     compare two objects together and print the maximum value

===========================================================================================================================

