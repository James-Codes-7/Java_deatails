package org.cons;

class Emp
{
	int id;
	int salary;
	static String ceo;
	
	static//RUN WHEN YOU LOAD THE CLASS 
	{
	   ceo="makesh"	;
	   System.out.println("static");
	}
	static 
	{
		System.out.println("valtar");
	}
	public Emp(int n,int y)//RUN WHEN YOU CREATE THE OBJECT
	{
		id=n;
		salary=y;
		System.out.println("constructor");
	}
	public void mrt()
	{
		System.out.println(id+":"+salary+":"+ceo);
	}
}
public class StaticDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Emp eno=new Emp(1,2000);
		System.out.println("after starts");
		Emp eno1=new Emp(2,3000);
		eno.mrt();
		eno1.mrt();
		
/*STATIC 
 * 
 * STATIC BLOCK RUN JUST BEFORE FIRST OBJECT CREATING
 * 
 * DEFINE VARIABLE STATIC CHANGE ONE PLACE IT AUTOMATICALLY CHANGE ALL THE PLACE
 * 
 * 
 * 
 * 
 */
		
		

	}
/*
 * USE STATIC KEYWORD DON'T CREATE OBJECT
 * IF YOU WONT CHANGE ANYTHING IN ALL OBJECT USE STATIC VARIABLE BECAUSE YOU CHANGE THE VARIABLE
 * DATA IT CHANGE ALL THE PLACE
 * YOU CANNOT PRINT NON STATIC VARIABLE IN STATIC FUCTION 
 * STATIC LINE ONLY READ ONE TIME LIKE C PROGRAM
 * 
 * 
 */
}
