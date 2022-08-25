package org.cons;

import java.lang.reflect.Method;

public class Refelection {

	public static void main(String[] args) {
		
		MethodOverloading oj=new MethodOverloading();
		System.out.println(oj.getClass());
		PolyMorphism pol=new PolyMorphism();
		Class clas=pol.getClass();
		System.out.println(clas.getName());
		
		Method[] met=clas.getDeclaredMethods();
		for(Method s:met)
		{
			System.out.println(s);
		}

	}
/*REFLECTION
 * ONE OBJECT COME TO YOUR MAIN METHOD
 * IF YOU DID NOT KNOW THAT CLASS OF OBJECT
 * DON'T KNOW METHODS OF THAT CLASS
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
