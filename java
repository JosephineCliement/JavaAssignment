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
 Ans
  
   package pck1;

public class a4 {
	String city;
	
	public void show(String n)
	{
		int Ccode=1011;
		city=n;
		System.out.println("City : "+city+" City code : "+Ccode);
	}
	
	public static void main(String[] args) 
	{
		a4 c=new a4();
		c.show("Pune");
	}
}
==================================================================================================================================
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
     
       
ANS.    
     package javaPrograms;

class BMI {

	private float weigh;
	private float height;
	private float bmi;
	
	public void passvals(float w,float h)
	{
		if(w<600)
		{
			weigh = w;
		}
		else
		{
			System.out.println("BEYOND ANY PERSON THAT EVER EXISTED ");
		}
		
		if(h<350)
		{
			height = h;
		}
		else
		{
			System.out.println("ADD PERSONS HEIGHT, NOT GIRAFFES");
		}
	}
	
	public void findBMI()
	{
	    bmi = (weigh/(height/100*height/100));
		System.out.println("BMI : "+bmi);
		
		if(bmi<=18.5)
		{
			System.out.println("UNDERWEIGHT,GAIN SOME MASS");
		}
		else if((bmi>18.5)&&(bmi<=24.9))
		{
			System.out.println("NORMAL WEIGHT");
		}
		else if((bmi>25.0)&&(bmi<=29.9))
		{
			System.out.println("OVERWEIGHT");
		}
		else if(bmi>30.0)
		{
			System.out.println("OBESE, GO EXERCISE");
		}
	}
}
public class pro30 {
	
	public static void main(String[] args) {

		BMI tab = new BMI();
	    
		tab.passvals(78,170);
		tab.findBMI();
	}

}
=================================================================================================================================
     Q.8 Create a class Employee . Declare name, yearOfExperiance, Salary. Create a method which takes the details from user. Take records of 5 employees using Array of 
    objects. Create a method which checks the years of experiance of an employee. If Experiance is more than 3 years then Give 5000/- Rs Bonus to the employees .
    If Experiance is more than 1 year & less than 3 years then Give bonus of 1000/- Rs. If Experiance is less than 1 year , no bonus will be given. Display the 
    Updated details of every employee.
      
ANS. package javaPrograms;

import java.util.Scanner;

class emp1 {
	public String name;
	public int yr_of_exp,sal;
	
	public void setdetails(String name,int yr_of_exp,int sal)
	{
		this.name = name;
		this.yr_of_exp = yr_of_exp;
		
		if(yr_of_exp <= 50)
		{
		   checkyrs(yr_of_exp,sal);
		}
	}
		public void checkyrs(int yr,int sal)
		{
			if(yr > 3)
			{
				this.sal = (sal+6000);
			}
			else if((yr > 1)&&(yr < 3))
			{
				this.sal = (sal+2000);
			}
			else
			{
				this.sal = sal;
			}
		}
	
	public void showdet(int in)
	{
		System.out.println("NAME "+(in+1)+" : "+name);
		System.out.println("YR_OF_EXP"+(in+1)+" : "+yr_of_exp);
		System.out.println("SALARY"+(in+1)+" : "+sal);
	}
}
public class ASSIGN8 {
	public static void main(String[] args) {

       emp1 emp[] = new emp1[5];
       
       Scanner st = new Scanner(System.in);
      
       for(int i=0;i<emp.length;i++)
       {
    	   emp1[i] = new emp1();
    	   
    	   System.out.println("ENTER EMPLOYEE "+(i+1)+" NAME : ");
    	   String nm = st.nextLine();
    	   st.nextLine();
    	   
    	   System.out.println("ENTER EMPLOYEE "+(i+1)+" YEARS OF EXPERIENCE : ");
    	   int yr = st.nextInt();
    	   st.nextLine();
    	   
    	   System.out.println("ENTER EMPLOYEE "+(i+1)+" SALARY : ");
    	   int s = st.nextInt();
    	   st.nextLine();
    	   
    	   emp[i].setdetails(nm, yr, s);
       }
       for(int i=0;i<emp.length;i++)
       {
    	   emp[i].showdet(i);
       }
       
       st.close();       
	}
}
========================================================================================================================================

    
Q.9 Write a program to create a Menu based program where perform the following operations.
    Product (Class) : pid,pname,Description,cost
    1. Display List of 5 products.
    2. Display all products in Capital case
    3. Display the Total cost of All products.
    4. Dipslay average Cost of All products.
    5. Display only Product Name and cost.
    
        
ANS. package javaPrograms;

class class1 {
	public int pid,cost,result,avg;
	public String pname,Description;
	
	public void setdetails(int pid,int cost,String pname,String Description)
	{
		this.pid = pid;
		this.cost = cost;
		this.pname = pname;
		this.Description = Description;
	}

	public void getdetails()
	{
		System.out.println(" PRODUCT ID : "+pid+" PRODUCT NAME : "+pname+" PRODUCT COST : "+cost+" PRODUCT DSCP : "+Description);
	}
	
	public void getdetails2()
	{
		System.out.println(" PRODUCT ID : "+pid+", PRODUCT NAME : "+pname.toUpperCase()+", PRODUCT COST : "+cost+", PRODUCT DSCP : "+Description.toUpperCase());
	}
	
	
	public void totamount(Product10 pro1,Product10 pro2,Product10 pro3,Product10 pro4,Product10 pro5)
	{
		result = (pro1.cost)+(pro2.cost)+(pro3.cost)+(pro4.cost)+(pro5.cost);
		
		System.out.println("TOTAL AMOUNT OF COSTS OF "+result);
	}
	
	public void getavg()
	{
		avg = result/5;
		System.out.println("AVERAGE COSTS OF ALL PRODUCTS : "+avg);
	}
	
	public void getdetails3()
	{
		System.out.println(" PRODUCT NAME : "+pname.toUpperCase()+", PRODUCT COST : "+cost);
	}
}

public class pro34 {

	public static void main(String[] args) {

		Product10 pro1 = new Product10();
		Product10 pro2 = new Product10();
		Product10 pro3 = new Product10();
		Product10 pro4 = new Product10();
		Product10 pro5 = new Product10();
  
		pro1.setdetails(101,500,"mouse","sleek and lightier than pricey 2000 rs mouse");
		pro2.setdetails(102,2000,"ram","not the god");
		pro3.setdetails(103,5000,"keyboard","made from high quality, but dont try smashing ");
		pro4.setdetails(104,50000,"laptop","because who will buy desktop ");
		pro5.setdetails(105,500,"ps5","your dream partner");
		
	    pro1.getdetails();
	    System.out.println("===============================================================================================================================================================");
	
	    pro2.getdetails();
	    System.out.println("===============================================================================================================================================================");
	
	    pro3.getdetails();
	    System.out.println("===============================================================================================================================================================");
	
	    pro4.getdetails();
	    System.out.println("===============================================================================================================================================================");
	
	    pro5.getdetails();
	    System.out.println("===============================================================================================================================================================");
	
	    
	    System.out.println();
	    System.out.println(" UPPER CASE DATA :-");
	    System.out.println();
	    System.out.println();
	    
	    
	    pro1.getdetails2();
	    System.out.println();
	    pro2.getdetails2();
	    System.out.println();
	    pro3.getdetails2();
	    System.out.println();
	    pro4.getdetails2();
	    System.out.println();
	    pro5.getdetails2();
	    System.out.println();

	    System.out.println();
	    pro1.totamount(pro1,pro2,pro3,pro4,pro5);
	    System.out.println();

	    System.out.println();
	    pro1.getavg();
	    System.out.println();
            System.out.println();
	    
	    System.out.println();

	    pro1.getdetails3();
	    System.out.println();
	    System.out.println();
	    
	    pro2.getdetails3();
	    System.out.println();
	    System.out.println();
	    
	    pro3.getdetails3();
	    System.out.println();
	    System.out.println();
	    
	    pro4.getdetails3();
	    System.out.println();
	    System.out.println();
	    
	    pro5.getdetails3();
	    System.out.println();
	    System.out.println();

	}

}
===========================================================================================================================================
Q.10 Create an array of names of 3 students and display names with length.
Ans
   package pck1;

public class A10 {
	public void demoForEach()
	{
		System.out.println();
		String numbers[]=new String[3];
		numbers[0]="Neha";
		numbers[1]="Priya";
		numbers[2]="Jaya";
		int i=1;
		System.out.println("========Topper========");
		for(String x : numbers)    
		{
			System.out.println(i+") "+x+" Length of Name is : "+x.length());
			i++;
		}

	}

	public static void main(String[] args)
	{
		A10 obj=new A10();
		
		obj.demoForEach();
	}
}
===============================================================================================================================
Q.11 Make an array of 10 numbers and print the average of only even numbers.
ANS. package javaPrograms;

import java.util.Scanner;

class array1 {
	double avg;
	public void getavg(double nun)
	{
		avg = nun;
		System.out.println("AVERAGE OF 10 NUMBERS IS : "+avg);
	}	
}
public class ASSIGN11 {
	
	public static void main(String[] args) {
		double sum = 0.0;
		double avg;
		int con = 0;
		int arr[] = new int[10];
		
		array2 ag = new array2();
		Scanner sd = new Scanner(System.in);
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("ENTER THE NUMBER "+(i+1)+" : ");
		    arr[i] = sd.nextInt();
		    
		    if(arr[i]%2==0)
		    {
		    sum = sum + arr[i];
		    con++;
		    }
		}
		avg = sum / con;
		
		ag.getavg(avg);	
		
	}

}
===========================================================================================================================
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
          
ANS. package javaPrograms;

class FAC1 { 
    static int factorial(int n) 
    { 
        int res = 1, i; 
        for (i = 2; i <= n; i++) 
            res *= i;     //res = res*i
        return res; 
    } 
  
    public static void main(String[] args) 
    { 
        int num = 5; 
        System.out.println( 
            "Factorial of " + num 
            + " is " + factorial(5)); 
    } 
} 
=======================================================================================================================================================
Q.14 Create a Class Alphabets which is printing Capital case alphabets in its member method. Create another Class where a main function resides. In main method create 
    the object of Alphabets class and call the method which is printing alphabets.
 Ans)
 package practise;

class Alphabets
{
	public void fun1()
	{
		

		String s1="hello world";
		

		System.out.println(s1.toUpperCase());
	}  
	
}
public class A14 {

	public static void main(String[] args) {
	Alphabets ob=new Alphabets();
	
	ob.fun1();
    
	}

}

=============================================================================================================================================================
Q.15 Write a program to create a method in a class which takes the first name as first parameter and last name as second parameter. This method returns the full name. 
    Print full name.
    ANS. package javaPrograms;

import java.util.Scanner;

class method1 {
	String fname,lname;
      public void getmeth(String a,String b)
      {
    	  fname = a;
    	  lname = b;
      }
      
      public void showfullnm()
      {
    	  System.out.println("FULL NAME : "+fname+" "+lname);
      }
}
public class ASSIGN15 {

	public static void main(String[] args) {
    method y = new method();
    
    Scanner s = new Scanner(System.in);
    System.out.println("ENTER THE FIRST NAME : ");
    String ab = s.nextLine();
    
    System.out.println("ENTER THE LAST NAME : ");
    String bc = s.nextLine();
    
    y.getmeth(ab,bc);
    
    y.showfullnm();
	}

}

===========================================================================================================================================================
Q.16 Write a program to overload a method named as getResult() 3 times , first definition prints the cube of passed number. Second function prints square of passed 
     number. Third definition print that number.
     
ANS. public class ASSI6 {

	double getresult(double a)
	{
		double res;
		res = a*a*a;
		return res;
		
	}
	int getresult(int b)
	{
		int res;
		res = b*b;
		return res;
	}
	float getresult(float c)
	{
		return c;
	}
	public static void main(String[] args) {
		ASSI6 a = new ASSI16();
		
		System.out.println(a.getresult(10.3456));
		System.out.println(a.getresult(35));
		float h = (float)23.34398483;
		System.out.println(a.getresult(h));
	}

}
===================================================================================================================================
Q.17 Write a program to find the sum of digits of a number.
ANS. import java.util.Scanner;

public class ASSI7 {
	public long hub;
    public long digit(long ab)
    {
    	long rem;
    	long sum = 0;
    	
        while(ab!='\0')
        {
        	rem = ab%10;
        	sum = sum + rem;
        	ab = ab/10;
        }
        System.out.println("SUM OF DIGITS : "+sum);
        hub = sum;
        return hub;
    }
	public static void main(String[] args) {
		ASSI7 ass = new ASSI7();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER : ");
		int sub = sc.nextInt();
		
		ass.digit(sub);		
	}

}
===================================================================================================================================================
Q.18 Write a program to create two objects of a class named as Numbers. In which there is a function getMax(). Assign a value for a number to every object and 
     compare two objects together and print the maximum value
     ANS. class numbers {
	int number;
	public numbers(int v) 
	{
		number = v;
	}
	void getmax(numbers num1,numbers num2)
	{
		if(num1.number > num2.number)
		{
			System.out.println(num1.number+" is the maximum value");
		}
		else
		{
			System.out.println(num2.number+" is the maximum value");
		}
	}
}
public class ASSIGN18 {

	public static void main(String[] args) {
		numbers num1 = new numbers(100);
		numbers num2 = new numbers(200);
		
		num1.getmax(num1,num2);
	}
}
==============================================================================================================================


Q.19 Create an interface named as Calculator and create a method in it as getResult(). 
     7 class are to be defined which are implementing Calculator interface.
     Class A will return factorial of a number.    (Vishal)
     Class B will return square of a number.       (Saloni)
     Class C will return maximum of two numbers.   (Hemant)
     Class D will print numbers from 1 to 50.      (Josephine)
     Class E will return the sum of 5 digit number. (Nimesh)
     Class F will return the sum of 5 values in an array.  (Abhishek)
     Class G will return the temperature in celcius for the given ferhenite value. (Nilesh)
 ==================================================================================================================================================    
Q.20 Write a program to take first name and lastname as a command line arguments and print the full name in capital case along with the length of fullname.
ANS. package javaPrograms;

public class comline {

	public static void main(String[] args) {
		
		String st = (args[0])+" "+(args[1]);
		
		System.out.println(st.toUpperCase());
		System.out.println(st.length());
	}
}
============================================================================================================================================
Q.21 Create a class Person. Create name,mobile,age as instance variables . Make getters and setters and display the records of 3 cusomers using array of objects and 
     print records.
     ANS. 

package javaPrograms;
class Person1 {
	public String name;
	public long mobile;
	public int age;
	
	public Person1()
	{
		name = "Ginny";
		mobile = 9175647827L;
		age = 23;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
public class ASSIGN210 {

	public static void main(String[] args) {
		
		Person1 arr[] = new Person1[3];
		
		arr[0] = new Person1();
		arr[0].setName("RON WEASLEY");
		arr[0].setMobile(9208877665L);
		arr[0].setAge(25);
		
		arr[1] = new Person1();
		arr[1].setName("HARRY");
		
		arr[2] = new Person1();
		arr[2].setAge(27);
		
		System.out.println("DETAILS OF THE FIRST PERSON");
		System.out.println("NAME : "+arr[0].getName()+" || "+"MOBILE :"+arr[0].getMobile()+" || "+"AGE : "+arr[0].getAge());
        
		System.out.println("DETAILS OF THE SECOND PERSON");
		System.out.println("NAME : "+arr[1].getName()+" || "+"MOBILE :"+arr[1].getMobile()+" || "+" AGE : "+arr[1].getAge());
        
		System.out.println("DETAILS OF THE THIRD PERSON");
		System.out.println("NAME : "+arr[2].getName()+" || "+"MOBILE :"+arr[2].getMobile()+" || "+" AGE : "+arr[2].getAge());     	
	}

}
====================================================================================================================================
Q.22 Define name and salary of an employee both as a string variable. Define a method which updates the salary of an employee by 1000. Print updated salary with name.

ANS. package javaPrograms;
class employe {
	String name;
	String salary;
	
	public void getdetails()
	{
		name = "Fred";
		salary = "25000";
		
		System.out.println("NAME : "+name);
		int salin  = Integer.parseInt(salary);
		System.out.println("SALARY : "+salin);
		
	}
	public void updsal()
	{
		System.out.println("NAME : "+name);
		int sal = Integer.parseInt(salary)+1000;
		System.out.println("SALARY : "+sal);
	}
}
public class ASSIGN22 {

	public static void main(String[] args) {
		employe emp = new employe();
		
		emp.getdetails();
		
		System.out.println("SALARY AFTER BONUS==================================");
		emp.updsal();
	}

}
==========================================================================================================================

Q.23 Write a program to declare a sring object using literal and assign a string "Hello" in it. Print the Hello using charAt() method in Capital Case.

ANS. package javaPrograms;

class pub {
  
	public void func(char arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(Character.toUpperCase(arr[i]));
		}
    }
}
public class ASSIGN23 {
	
	public static void main(String[] args) {
	String st = new String();
	
	char arr[] = new char[5] ;
	st = "Hello";
	
	for(int i=0;i<st.length();i++)
	{
		arr[i] = st.charAt(i);
	}  
	pub p = new pub();
	p.func(arr);
   }
}
=========================================================================================================================
Q.24 Write a program to print the length of a string without using length attribute.

ANS. package javaPrograms;

import java.util.Scanner;

public class assi24 {
    public void show(String st)
    {
    	int i = 0;
    	for(char s : st.toCharArray())
    	{
    		i++;
    	}
    	System.out.println("LENGTH : "+i);

    }
	
    public static void main(String[] args) {
	assi24 a = new assi24();
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("ENTER THE STRING : ");
	
	String s = sc.nextLine();
	a.show(s);

	}

}
==================================================================================================================================
Q.25 Take user name and password from user.If user name is "admin" and password is "Abcd1234" then print Welcome UserName . Compare userName using equalIgnoreCase(). 
     Compare password without using equalIgnoreCase().
     ANS. package javaPrograms;

import java.util.Scanner;

public class ASSSIGN25 {

	String usernm;
	String passwd;
	Scanner st = new Scanner(System.in);
	
    public void takedetails(String user)
    {
    	try{
    		if(user.equalsIgnoreCase("admin"))
    		usernm = user;
    		
    	    else
    		throw new Exception();
            
    		try {
    			   System.out.println("ENTER THE PASSWORD : ");
    			   String pass = st.nextLine();
    			   
    	     	   if(pass.equalsIgnoreCase("Abcd1234"))
             	   {
    		       passwd = pass;
    		       System.out.println("WELCOME "+usernm);
    	           }
    		       else
    			   throw new Exception();
    		       }
    		catch(Exception ea)
    		{
    	        System.out.println("PASSWORD IS INVALID,PLEASE ENTER AGAIN");
    		}
    	}
    	catch(Exception ea)
    	{
    		System.out.println("USERNAME IS INVALID");
    	}
    }
	public static void main(String[] args) {	
	ASSSIGN25 as = new ASSSIGN25();
	
	Scanner sc = new Scanner(System.in);
	
    System.out.println("ENTER THE USERNAME : ");
    String nm = sc.nextLine();

    as.takedetails(nm);
	}

}
=================================================================================================================================
Q.26 create a class Result where marks of 5 subjects are taken from user in a method as InputMarks() and print the percentage and grade based on percentage in a 
     different method as ShowPercentage(). Print the Highest and Lowest Marks in a subject.
     ANS. package javaPrograms;

import java.util.Scanner;

class result {
	Scanner sc;
	public int sum = 0;
	result200()
	{
		sc = new Scanner(System.in);
	}
	public void InputMarks()
	{
		int arr[] = new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("ENTER THE MARK "+(i+1)+" : ");
			arr[i] = sc.nextInt();
			sum = sum +arr[i];	
		}
		Showpercentage();
		FINDHIGHEST(arr);
	}
	public void Showpercentage()
	{
		double per;
		per = sum * 100 / 500;
		System.out.println("PERCENTAGE IS : "+per);
		
		if(per>=80 && per<=100)
		{
			System.out.println("GRADE IS : A");
		}
		else if(per>=60 && per<80)
		{
			System.out.println("GRADE IS : B");
		}
		else if(per>=40 && per<60)
		{
			System.out.println("GRADE IS : C");
		}
		else if(per>=0 && per<=40)
		{
			System.out.println("GRADE IS : FAILED WITH D");
		}	
	}
	public void FINDHIGHEST(int arr[])
	{
		int biggest = arr[0];
		
		biggest = Math.max(arr[1],biggest);   
		biggest = Math.max(arr[2],biggest);
		biggest = Math.max(arr[3],biggest);
		biggest = Math.max(arr[4],biggest);
        
		System.out.println("HIGHEST MARK : "+biggest);
		
		int lowest = arr[0];
		
		lowest = Math.min(arr[1],lowest);   
		lowest = Math.min(arr[2],lowest);
		lowest = Math.min(arr[3],lowest);
		lowest = Math.min(arr[4],lowest);
        
		System.out.println("LOWEST MARK : "+lowest);
	}
}
public class ASSIGN26 {
	public static void main(String[] args) {
    result res = new result();
    
    res.InputMarks();
	}

}
========================================================================================================================================================
Q.27 Display the following Pattern :
       1
       1 2
       1 2 3
       1 2 3 4
       1 2 3 4 5
Ans)
package practise;



public class A27 {
	

	public static void main(String[] args) {
		
	
		for(int i=1;i<=5;i++)        
		{
			for(int j=1;j<=i;j++)    
			{
				     System.out.print(j);
		
	         }
			System.out.println();

         }
		
	}
	
}
====================================================================================================================================

Q.28 Declare a string as "Welcome to Java Programming" , Print "Java" from this String. 

Q.29 Write a program to reverse the entered string without using reverse method.

Q.30 Make an array of 5 integers and print elements in reverse order.

Q.31 Make an array of 10 numbers and print the sum of all even elements.

Q.32 Make an array of 3 integers and find the maximum of 3 nos and print it.

Q.33 Make an array of 5 integers and check any enetered no exists in the array or not.If Exists then print the array element with position of the element in the array.

Q.34 Create an interface Area which has a method getArea(). 
    Create 3 Classes circle, Triangle, Rectangle which are implementing the method. Calculate the area and show it.
Q.35 Create an Abstract Class student which has an abstract method showDetails().
    Create an interface Marks which has a variable TotalMarks=500 and a method getMarks().
    Create a Class Result which extends student class and implements Marks interface.
    In Result class calculate the Percentage of a student and Print Result.

Q.36 create a final class in which a method Factorial() returns the factorial of the passed number.Make another class where factorial is to be displayed in a method showFactorial()
Q.37 Write a program to Make a class Numbers which has a method getNumbers() which takes two numbers from user. Create another class Addition which inherits
     class Numbers and does Addition of two numbers in a method calculate() and print the addition.
Q.38 Create your Exception class named as PasswordLengthException and take username and password from the user . If the length of the password is less than 8 characters
     then throw the PasswordLengthException on giving a message as "Password is too short" otherwise Show the message as "Welcome UserName".
Q.39 create 2 thread objects of a class .create a thread class on implementing Runnable interface, set name of first thread as "even" and second thread as "odd". Even thread 
      Printing only even nos between 1 and 20 and odd thread printing only odd nos between 1 and 20.
Q.40 Create a class mobile and create a subclass product of it which is implementing Runnable interface. Create two thread objects . One thread is printing product id and second
     thread object is printing product name.
Q.41 Create a string str="10-20-30-40-50". Tokenize the string and display the average of all numbers.
Q.42 Display the current date and time and split the date and time and print it seperately.
Ans)
package practise;

public class A42 {

	public static void main(String[] args) {
   String message="29 13:00";
		
		String[]str =message.split(" ");
		
		
		for(String word:str)
		{
			System.out.println(word);
			
			}
		
		
		
	}

}
============================================================================================================================================================
Q.43 Create an ArrayList of names of 5 students and copy all names to another ArrayList.
Q.44 Create an ArrayList of 5 integers and display the average of all numbers.
Q.45 Read firstname and Lastname from the user and concatenate Firstname and lastname including space in between, Then Split the full name and display firstname and lastname
     seperately.
Q.46 Make an ArrayList of five city names and search a specific city and display city name with position in ArrayList.
Ans)
package practise;

import java.util.ArrayList;

public class A46 {

	public static void main(String[] args) {

		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("Delhi");
		list1.add("Bombay");
		list1.add("Pune");
		list1.add("Bangalore");
		list1.add("Bangel");
		System.out.println(list1.get(2));
		


	}

}
==========================================================================================================

Q.47 Make ArrayList of 5 strings and display every string along with the length.
Q.48 Create a List A which contains 5 strings .Create a List B where length of all strings from List A should be stored.

