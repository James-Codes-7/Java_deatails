package org.sam;

class Ap
{
	private int data=78;
	private void met()
	{
		System.out.println("how it possible");
	}
	public void acc()
	{
		System.out.println("it is enable");
	}
}
public class PrivateModifier extends Ap {

	class Mop
	{
		public void metro()
		{
			System.out.println("metro is over fast");
		}
	}
	public void acc()
	{
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ap m=new Ap();
		m.acc();
		 James n=new James();
	       n.merge();
		//m.data=9; COMPILE TIME ERROR
		//m.met(); COMPILE TIME ERROR
		
	}

	/*
	 * PRIVATE MODIFIER
	 * 
	 *--> THE ACCESS LEVEL OF THE MODIFIER WITH IN THE CLASS IT 
	 *CANNOT ACCESS OUTSIDE OF THE CLASS
	 * 
	 * -->IF YOU EXTENDS THE CLASS THE METHOD IS CANNOT  SUPPORT
	 * 
	 * 
	 * 
	 * 
	 */
}
