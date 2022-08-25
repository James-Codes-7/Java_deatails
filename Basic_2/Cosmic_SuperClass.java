package org.cons1;

class Mab
{
	String Name;
	int p;
	Mab(String na,int a)
	{
		
	}
	public boolean equals(Object p)
	{
		if(this==p)
		{
			return true;
		}
		if(p==null)//SOME TIME ONLY HAVE REFERANCE
		return false;
		
		if(this.getClass()!=p.getClass())
			return false;
		
		Mab n=(Mab)p;
					
					return this.Name==n.Name&&this.p==n.p;
		
	}
	
}
public class Cosmic_SuperClass extends Object
{
	public static void main(String[] args) {
		final int t=9;
        System.out.println(t+1);
		String s1="java";//IT IS EXCEPTION IT STORE STRING CONSTANT MEMORY SPACE
		String s2="java";//IT POINT THE SAME POSITION S1 POINT
		String s3=new String("java");
		String s4=new String("java");
		System.out.println(s1==s2);
		System.out.println(s3==s4);//IT CHECK REFERANCE NOT CONTANT
		
		Mab m1=new Mab("james",1);
		Mab m2=new Mab("james",1);
		System.out.println(m1.equals(m2));
		
	}
	
/*OBJECT CLASS OR COSMIC-SUPERCLASS
 * 
 *
 *THE PARENT CLASS OF THE EVERY CLASS IS OBJECT CLASS
 * 
 * COMPILER AUTOMATICALLY TAKE IT
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

}
