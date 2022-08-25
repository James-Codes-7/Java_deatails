package org.cons;

interface Write 
{
	public void write();
	
}
class Penc implements Write
{
	public void write()
	{
		System.out.println("i am a pen");
	}
}
class Pencill implements Write
{
	public void write()
	{
		System.out.println("i am a pencil");
	}
}
class Kit
{
	public void show(Write u)
	{
		u.write();
		
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Kit n=new Kit();
	Write m=new Penc();
	 m.write();
     Penc ban=new Penc();
     Write bn=new Penc();
     n.show(ban);
     Write ban2= new Pencill();
     n.show(ban2);
     
     
	}

	//CANNOT CREATE OBJECT TO INTERFACE
	/*
	 * OVERCOME THIS DRAWBACK USE ANOUNMOUS CLASS 
	 * 
	 * 
	 */
}
