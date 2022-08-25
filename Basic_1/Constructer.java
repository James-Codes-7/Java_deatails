package org.cons;

public class Constructer {
	
	static int num;
	int num2;
	public Constructer()
	{
		num=2;
		num2=5;
	}
	public Constructer(int t)
	{
		num=t;
		num2=t;
	}
	
	public static void main(String[] args) {
		
		Constructer men=new Constructer(6);
		//ME
		System.out.println(num);
		System.out.println(men.num2);
		
	}  
	/*NO RETURN TYPE
	 * CLASS NAME CONSTRUCTOR NAME SAME
	 * USE TO MEMORY ALLOCATE
	 * COMPILER AUTOMATICALLY TAKE DEFAULT CONSTRUCTOR
	 * CONTRUCTOR OVERLOADING
	 * MEMBER METHOD WHICH HAS THE SAME NAME 
	 * 
	 * 
	 * 
	 * 
	 */

}
