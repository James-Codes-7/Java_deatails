package org.same;

import java.util.*;
public class UserDefined {

	public static void main(String[] args) {
		
		int a=9;
		int b=10,i=0;
		Scanner n=new Scanner(System.in);
		int b1=Integer.parseInt(n.nextLine());
		try 
		{
			i=a/b;
				throw new JamesException("james here");
			
		}
		catch(Exception e)
		{
			System.out.println("Error "+e.getMessage());//YOU MUST DECLARE GET MESSAGE
		}
	}
	/*IF YOU CREATE OWN CLASS THROW YOUR OWN EXCEPTION
	 * 
	 * THAT CLASS YOU CREATE CONSTRUCTOR AND PUT IT IN THE SUPER 
	 * 
	 * CHECK JamesException
	 * 
	 * 
	 * 
	 * 
	 * 
	 *  
	 */

}
