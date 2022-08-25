package org.cons1;

class Employee2
{
	private String name;
	private int salary;
	Employee2(String na,int s)
	{
		name =na;
		salary=s;
	}
	Employee2()
	{
		
	}
	String getName()
	{
		return name;
	}
	int getSalary()
	{
		return salary;
	}
}
class Manager2 extends Employee2
{
	int bonus;
	Manager2(String nam,int salar)
	{
		super();
	 //  super(nam,salar);
		
		
	}
	void setBonus(int bonu)
	{
		bonus=bonu;
	}
	int getSalary()
	{
		return super.getSalary()+bonus;
	}
}
public class DynamicBinding {

	public static void main(String[] args) {
	
		Employee2 n=new Employee2("siva",50000);
		Employee2 n1=new Employee2("james",50000);
		Employee2 n2=new Manager2("manag",500000);
		Employee2 e[]=new Employee2[5];
		
		if(n2 instanceof Manager2)
		{
			Manager2 mn=(Manager2)n2;
			mn.setBonus(1999);
		}
		System.out.println(n1.getSalary());
		System.out.println(n2.getSalary());
		
		
		
		
		

	}

}
