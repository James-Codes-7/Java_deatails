package org.multi;

public class LamdaExpressFunctional {

	public static void main(String[] args) {
	
		Runnable m=() ->
		{
			int i;
			for(i=0;i<5;i++)
			{
				System.out.println("bond");
				try{Thread.sleep(1000);}catch(Exception u) {}
			}
		};
		
		Thread n=new Thread(m);
		n.start();
		

	}
	/*RUNNABLE IS FUNCTIONAL INTERFACE SO WE USE LAMDA EXPRESSION
	 * 
	 * NO NEED METHODS
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
