package org.cons;

public class PolyMorphism {

	public void mes()
	{
		System.out.println("accepted");
	}
	public void mes(int a)
	{
		System.out.println("true");
	}
	public void mes(int a,char b,byte d)
	{
		System.out.println("enter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      PolyMorphism nul=new PolyMorphism();
    	nul.mes();
        nul.mes(5);
        nul.mes();
    		  
	}
	/*RUNTIME POLYMORPHISM
	 * 
	 * WHENEVER THE OBJECT BOUND WITH FUNCTIONALITY AT RUNTIME THIS IS KNOWN AS
	 * RUNTIME POLYMORPHISM
	 * 
	 * THE RUNTIME POLYMORPHISM ACHIEVED BY METHOD OVERRIDING
	 * 
	 * JAVA VIRTUAL MACHINE DETERMINES THE PROPER METHOD TO CALL AT THE RUNTIME
	 * NOT AT THE COMPILE TIME
	 * 
	 * COMPILETIME POLYMORPHISM
	 * 
	 * IT IS POLYMORPHISM THAT RESOLVED DURING THE COMPILATION PROCESS
	 * 
	 * IT IS ACHIEVED BY METHOD OVERLOADING
	 * 
	 * OVERLOADING OF METHODS IS CALLED THROUGH THE REFERENCE VARIABLE OF A CLASS
	 * 
	 */

}
