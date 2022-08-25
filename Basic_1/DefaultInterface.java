package org.cons;

abstract class Met
{
	public abstract void mok();
	
}
@FunctionalInterface
interface Mop 
{
	public void show();
	
	default void fun()//HOW MANY DEFAULT METHOD PLACE IN INTERFACE
	//THAT IS NO PROBLEM BUT ONLY ONE ABSTRACT METHOD PLACE IN INTERFACE
	{
		System.out.println("james");
	}
}
class Ach implements Mop
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("no problem");
	}
	public void fun()
	{
		System.out.println("ok");
	}
	
}
public class DefaultInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Ach nu=new Ach();
         nu.show();
         nu.fun();
         Met nm=new Met()
        		 {
        	        public void mok()
        	        {
        	        	System.out.println("find it");
        	        }
        		 };
        		 nm.mok();
	}
	
	/*DEFAULT METHOD 
	 * 
	 * IN JAVA 1.7 WE CANNOT DEFINE THE METHODS IN THE ITERFACE
	 * IN JAVA 1.8 IT CAN DEFINED THE METHOD IN INTERFACE THROUGH DEFAULT METHOD
	 * 
	 * 
	 * 
	 */

}
