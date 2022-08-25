package org.cons;

 class Re
{
	 int DAY=9;
	final int a=9;
	public final void make()
	{
		
		System.out.println("cons");
		DAY=8;
 	}
}

class Me extends Re
{
	public void make3()
	{
		DAY=8;
	}
}
public class FinalKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Me obj=new Me();
		obj.make();
	}
/*CONNOT EXTEND FINAL CLASS IN OTHER CLASS
 * CANNOT OVERRIDE FINAL METHOD
 * CANNOT ASSAIGN THE VALUE TO FINAL DATATYPES
 * 

 */
}
