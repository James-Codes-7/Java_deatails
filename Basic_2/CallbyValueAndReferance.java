package org.cons1;

public class CallbyValueAndReferance {

	int m=9;
	public static void met(int a)
	{
		a++;
		
	}
	public static void met(CallbyValueAndReferance a)
	{
		a.m++;
	}
	public static void main(String[] args) {
		
		int a=9;//LOCAL VARIABLE
		met(a);//PASSING VALUE CALL BY VALUE
		met(a);
		System.out.println(a);//NO CHANGE WE PASSING THE VALUE TO THE ARGUMENTS
		
		CallbyValueAndReferance n=new CallbyValueAndReferance();
		met(n);//CALL BY REFERANCE
		System.out.println(n.m);//VALUE CHANGE
		
		

	}

/*CALL BY VALUE 
 * 
 * METHODS KU MEMORY STACK MEMORY LA ALLOCATE AHUM
 * 
 * 
 * PREMITIVE DATATYPE ARE STACK MEMORY
 * LOT OF SPACE IN MEMORY
 * 
 * MEMORY ALLOCATE THE MAIN MATHOD
 * 
 * AND ALLOCATE TO THE MET METHOD
 * 
 * BUT NAME OF THE VARIABLE IS SAME BUT MEMORY ALLOCTION IS SEPARATE
 * SO THE VALUE DON'T CHANGE
 * 
 * -->EVERY TIME WE CALL MET METHOD SO EVERY TIME ALLOCATE NEW MEMORY WHEN RETURN 
 * THE MEMORY DEALLOCATE
 * 
 * 
 * CALL BY REFERANCE
 * 
 * new USE PANNI ALLOCATE PANTRATHU HEAP MEMORY LA
 * ALLOCATE MEMORY IN HEAP MEMORY
 * RETURN THE REFERANCE WE STORE THE REFERANCE
 * 
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
