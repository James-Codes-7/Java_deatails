package org.same;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReader   {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int m=0;
		
		boolean c;
		BufferedReader n=null;
		try
		{
		 System.out.println("enter the number");
	     n=new BufferedReader(new InputStreamReader(System.in));//WHY WE USE SYSTEM.IN WHERE WE TAKE INPUT NET,KEYBORD,WEB
		 m=Integer.parseInt(n.readLine());//IT GIVE THE ERROR BECAUSE USER GIVES THE CORRECT INPUT ELSE WRONG INPUT
		 c=n.ready();
		}
		catch(Exception e)//HANDLE THE EXCEPTION
		{
			System.out.println(e);		
			}
		
		finally//MOST IMPORTANT USE TO CLOSE THE RESOURCE
		{
		 System.out.println(m);
		 n.close();
		}

	}
/*IOEXCEPTION
 * 
 * IO IS SOURCE PACKAGE AFTER THE USE CLOSE THE SOURCE
 * 
 * 
 * -->THROWS USE TO DECLARE THE EXCEPTION
 * 
 * -->io PACKAGE IS THE RESOURCE ONCE USE THE RESOURCE AND CLOSE THE RESOURCE
 * 
 * -->WHEN WE USE THE RESOURCE WE DECLARE THE EXCEPTION
 * 
 * -->IF YOU DID NOT CLOSE THAT MEMORY IS OCCUPY
 * 
 * 
 * 
 * 
 * 
 */

}
