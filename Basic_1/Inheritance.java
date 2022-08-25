package org.cons;

class Obj//Is A  SUPER CLASS
{
	public void num()
	{
		System.out.println("riyo");
	}
}
class Obj1 extends Obj//SUB CLASS
{
	public void dem()
	{
		System.out.println("trend");
	}
}

public class Inheritance {//Has A 

	public static void main(String[] args) {
	Obj1 ne=new Obj1();
	ne.num();

	}
	/*INHERITANCE
	 * 
	 * SINGLE INHERITANCE(SINGLE PARENT SINGLE CHILD)
	 * MULTIPLE INHERITANCE(CAN'T DIRECTLY USE ONLY USE THROUGH JAVA)
	 * MULTILEVAL INHERITANCE(MULTIPLE PARANT SINGLE CHILD)
	 * HIERCHICAL INHERITANCE(ONE PARENT MULTIPLE CHILD)
	 * HYBRID INHERITANCE(MORE INHERITANCE PLACED)
	 * 
	 */

}
