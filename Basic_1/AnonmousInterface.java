package org.cons;

interface Mpo
{
	public void show();
	public void met();
}

class Nop implements Mpo
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("accepted");
	}

	@Override
	public void met() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AnonmousInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Mpo nm=new Mpo()//MUST BE DECLARE ALL THE METHODS IN INTERFACE
    		  {
    	  
    	       public void show()
    	       {
    	    	   System.out.println("denied");
    	       }
    	   	@Override
			public void met() {
				// TODO Auto-generated method stub
				System.out.println("james");
			}	  
    		  };
    		  nm.show();
		
	}
	
	//ANONMOUS CLASS FOR INTERFACE 
	/*
	 * CREATE THE OBJECT FOR INTERFACE THROUGH THE ANONMOUS CLASS
	 *  IF YOU DIDN'T REUSE THE DEFINITION OF THE METHOD USE ANONMOUS CLASS
	 * 
	 * 
	 * 
	 * 
	 */

}
