package org.cons;

import static java.lang.Math.sqrt;  //SE 5.0
import static java.lang.Math.abs;
import java.util.*;//IT IS OK;
public class Package {

	public static void main(String[] args) {
	java.util.Scanner ny=new java.util.Scanner(System.in);//THIS IS ALSO FINE

	System.out.println(Math.sqrt(4));//THE SQRT IS STATIC METHOD SO DON'T WANT
	//OBJECT CALL WITH CLASS NAME
	System.out.println(sqrt(8));//import static 
	System.out.println(abs(8-7));
	
	}
	//Math.sqrt IS STATIC MRTHOD SO WE DON'T WANT CREATE OBJECT
	/*
	 * WE USE IN STATIC IMPORT ONLY STATIC METHODS 
	 * 
	 * WE USE THE NAME OF THE METHOD
	 * 
	 * 
	 * 
	
	 * 
	 * 
	 */

}
