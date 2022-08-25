package org.same;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a=9,b;
		try
		{
		b=a/0;
		System.out.println(b);
		}
		catch(
				Exception h)
		{
			System.err.println(a);
		}

	}
	
	
	/*EXCEPTION HANDLING
	 * 
	 * 
	 *--> THE EXCEPTION HANDLING IN JAVA IS ONE OF THE POWERFUL MECHANISM
	 *TO HANDLE THE RUNTIME ERRORS 
	 *-->SO THAT THE NORMAL FLOW OF THE APPLICATION CAN BE MAINTAINED
	 *
	 *DICTIONARY MEANING :EXCEPTION IS AN UPNORMAL CONDITON
	 * 
	 *--> IN JAVA, AN EXCEPTION IS AN EVENT THAT DISTRUPTS THE NORMAL FLOW OF THE
	 * PROGRAM
	 * -->IT IS AN OBJECT THROWN AT RUNTIME
	 * 
	 * -->THE ERRORS SUCH US
	 * 
	 * ClassNotFoundException
	 * IOException
	 * SQLException
	 * RemoteException etc
	 * 
	 *-->THE ADVANTAGE OF EXCEPTION HANDLING IS TO MAINTAIN THE NORMAL FLOW OF
	 *THE APPLICATION
	 *
	 *-->SUPPOSE THERE ARE 10 STATEMENTS IN JAVA PROGRAM AND EXCEPTION OCCURES IN 5
	 *STATEMENT; THE REST OF THE CODE NOT EXECUTED
	 *WHEN WE PERFORM EXCEPTION HANDLING,THE REST OF THE STATEMENTS WILL BE
	 *EXECUTED.THAT IS WHY WE USE EXCEPTION HANDLING IN JAVA
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
