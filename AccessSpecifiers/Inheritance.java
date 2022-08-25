package org.sam;

class Employee
{
	private String name;
	private long salary;
	Employee(String a,long b)
	{
		name=a;
		salary=b;
	}
	Employee()
	{

	}
	public void setSalary(long b)
	{
		salary =b;
	}
	public long getSalary()
	{
		return salary;
	}
	public String getName()
	{
		return name;
	}
}
class Manager extends Employee
{
	int bonus;
	/* Manager(String n,long b,int bon)
	 { 
	 BEFORE PRIVATE
		 this.name=n;
		 this.salary=b;
		 this.bonus=bon;
	 }*/
	Manager(String n,long b,int bon)
	{
		/* this.name=n; CANNOT DO IT AFTER PRIVATE
		 this.salary=b;*/
		super(n,b);
		this.bonus=bon;
	}
	public void setBonus(int b)
	{
		bonus=b;
	}
	public long getSalary()
	{
		// return salary+bonus; CANNOT DO IT
		return super.getSalary()+bonus;
	}

}
public class Inheritance {

	public static void main(String[] args) {


		Employee e1=new Employee("james",50000);
		Employee e2=new Employee("bond",50000);
		Manager m1=new Manager("manag",60000,45000);
		System.out.println(e1.getSalary());
		System.out.println(m1.getSalary());

		Employee e3=new Manager("maho",50000,2000);
		//IT REFER BASE CLASS DATA AND SUB CLASS DATA IT WORK LIKE POLYMORPHIC

		System.out.println(e3.getSalary());

		Manager m2=(Manager)e3;//IT ALLOW
		m2.setBonus(789);
		//m2.getSalary();
		//Maneger m3=(Manager)e2;//IT GIVE RUNTIME ERROR

		//e5.getSalary();
		if(e3 instanceof Manager)
		{
			Manager m3=(Manager)e3;
		}

		Employee e[]=new Employee[5];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		e[3]=m1;
		e[4]=e1;
		for(Employee po:e)
		{
			System.out.println(po.getName()+"     "+po.getSalary());
		}

	}

}
