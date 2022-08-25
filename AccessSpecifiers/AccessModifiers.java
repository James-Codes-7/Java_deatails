package org.sam;

public class AccessModifiers {

	int a=9;//CANNOT ACCESS ANOTHER PACKAGE USING OBJECT CREATION po.a=9
	//PACKAGE PRIVATE
	
	private int n=7;//CANNOT CHANGE ANOTHER CLASS 
	protected int ty=5;//CANNOT ACCESS ANOTHER PACKAGE USING OBJECT CREATION po.a=9

	
	protected void men(int m)
	{
		a=m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		AccessModifiers po=new AccessModifiers();
		System.out.println(po.a);
	    po.men(8);
	    System.out.println(po.a);
	}
	//TWO TYPE OF ACCESS MODIFIERS
	/*
	 * ACCESS MODIFIERS
	 * NON-ACCESS MODIFIERS
	 * 
	 * MODIFIERS SPECIFIERS THE SCOPE OF THE METHOD,CONTRUCTOR OR CLASS,VARIABLES
	 * 
	 * 
	 * 
	 */

}
