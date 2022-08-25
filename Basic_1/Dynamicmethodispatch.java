package org.cons;

class Ab
{
	public void show()
	{
		System.out.println("in A");
	}
}
class B extends Ab
{
	public void show()
	{
		System.out.println("in B");
	}
	public void sun()
	{
		System.out.println("mark");
	}
	
}

class C extends Ab
{
	public void show()
	{
		System.out.println("in C");
	}
	public void met()
	{
		System.out.println("denied");
	}
}
public class Dynamicmethodispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Ab obj = new B();//RUNTIME POLYMORPHISM OR DYNAMIC BINDING
		obj.show();
		
		obj=new C();//DYNAMIC METHOD DISPATCH
		obj.show();
		
		
	}
	//COMPILE TIME POLYMORPHISM ACHIEVED BY NORMAL METHOD OVERLOADING OBJECT FOUND IN COMPILETIME
	//RUNTIME POLYMORPHISM ACHIEVED BY METHOD OVERRIDING OBJECT FOUND IN RUNTIME

}
