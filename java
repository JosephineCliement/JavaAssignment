Q.1 Create a program to Assign username & password in a method and display the username, password in a different function.
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
