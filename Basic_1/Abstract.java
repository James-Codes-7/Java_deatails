package org.cons;

import java.util.*;

abstract class N
{
	int b=8;
	public abstract void mu();
	public void nu()
	{
		System.out.println("helpful");
	}
	static void menu()
	{
		System.out.println("it s static");
	}
	static //FIRST READ THE STATIC CLASS ONLY ONE TIME
	{
		int a,b=9,c;
		Scanner n=new Scanner(System.in);
		System.out.println("enter the a");
		a=n.nextInt();
		c=a+b;
		System.out.println(c);
		System.out.println("it is work");
	}
	//DEFAULT METHOD ONLY ALLOW FOR INTERFACE
}

class Def extends N
{

	@Override
	public void mu() {
		// TODO Auto-generated method stub
		System.out.println("ant");
	}
	public void he()
	{
		System.out.println("temporary");
	}
	
}
public  class Abstract {

	public static void go()
	{
		System.out.println("it is work");
	}

	public static void main(String[] args) {
		//N obj=new Def();
		//obj.mu();
	//	N.menu();
		Def obj1=new Def();
		Def obj2=new Def();
	 
		
		//obj.b=8;
	}
	
}

