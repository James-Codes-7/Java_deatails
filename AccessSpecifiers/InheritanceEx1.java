package org.sam;

class Employee1
{
	private String name;
	
	Employee1(String n)
	{
		System.out.println("what happaned");
		name=n;
	}
	public String getName()
	{
		return name;
	}
	Employee1()
	{
		
	}
}
class Manager1 extends Employee1
{
	Manager1(String na)
	{
		super(na);
	}
}
public class InheritanceEx1 {

	
	public static void main(String[] args) {
		
		Employee1 e2=new Employee1("bond");
		System.out.println(e2.getName());
		
		Employee1 e1=new Manager1("james");
		System.out.println(e1.getName());

		
	}

}
