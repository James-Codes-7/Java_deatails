package org.same;

public class TryCatch {

	public static void main(String[] args) {
		
		int a,b,c;
		int arr[]=null;
		int arr1[]=new int[5];
		try
		{
			a=5;b=0;
		//	c=a/b;
			//System.out.println(arr[1]);
			arr1[7]=9;
			c=Integer.parseInt(null);
			
		}
		catch(ArithmeticException | NullPointerException |NumberFormatException t )
		{
			System.out.println("error occured");
		}
		finally//IF ERROR IS NOT HANDLED IT RUN
		{
			System.out.println("bye");
		}

	}

}
