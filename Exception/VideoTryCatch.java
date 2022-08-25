package org.same;
import java.util.*;
public class VideoTryCatch {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		int b;
		try//EXCEPTION CODE
		{
		 b=9/0;
		System.out.println(b);
		}
		catch(ArithmeticException p)//EXCEPTION CATCHING
		{
			System.out.println("error");
		}
		finally//IF EXCEPTION ARE HANDLED OR NOT IT RUN
		{
			System.out.println("enter the b");
			b=m.nextInt();
			System.out.println(b);
		System.out.println("Error");
		}

	}
	/*IF YOU DECLARE FINALLY AFTER TRY KEYWORD IT GIVE ERROR AND ALSO RUN FINALLY
	 * 
	 * 
	 * 
	 * 
	 */

}
