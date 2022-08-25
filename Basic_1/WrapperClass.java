
package org.cons;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		Integer ii=new Integer(a);//BOXING OR WRAPPING
		int b=ii.intValue();//UNBOXING OR UNWRAPING
		
		
		Integer bi=9;//AUTOBOXING OR AUTOWRAPPING COMPILER AUTOMATICALLY TAKE THIS PROCESS
		    //NEW INTEGER(I) SO IT CALL AUTO BOXING
		int c=bi;
		String nu= "896";
		
		int i=Integer.parseInt(nu);
		System.out.println(i);
	}
	
	//WRAPPING IS SO SLOW WHY USE WRAPPING CLASS IN COLLECTION FRAMEWORK WE DON'T 
	//USE PRIMITIVE DATATYPE

	
	//CONVERT THE STRING INTO THE INTEGER
	
		
	    
}
