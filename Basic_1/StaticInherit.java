package org.cons;
class Mark
{
	int m=9;
	public static void bun()
	{
		System.out.println("rog");
	}
	Mark()
	{
		System.out.println("i am parent");
	}
	public static void met(int a)
	{
		System.out.println("Mark");
	}
	Mark(int b)
	{
		System.out.println("i am b");
	}
}
class Demo extends Mark
{
	int a=8;
	public static 
	void met(int b)
	{
	     
		System.out.println("james");
	}
	public void run()
	{
		super.bun();
		System.out.println("go speed");
	}
	Demo()
	{
		super();
		System.out.println("i am second parent");
	}
	Demo(int b)
	{
		super(3);
		System.out.println("i am demo");
	}
}
 class Vin extends Demo
{
	public static void met(int a)
	{
		
		System.out.println("first");
	}
	public void men()
	{
		super.a=8;
		super.m=9;
		super.bun();
		System.out.println("mens");
	}
	Vin(int a)
	{ 
		super(8);
		super.m=7;;
		
		super.bun();
		System.out.println("i am child");
	}
}
public class StaticInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo rt=new Vin(9);
      rt.met(6);
      
	}

}
