package org.cons;

import java.util.ArrayList;

public class Varargs {

	public void varag(float ... i)
	{
		int sum=0;
		for(double j:i)
		{
			sum+=j;
		}
		System.out.println(sum);
	}
	public void varag(String...i)
	{
		for(String a:i)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> m=new ArrayList<Integer>();
		m.add(9);
		m.add(3);
		m.add(5);
		for(int r:m)//ASSAIN INTEGER TO INT TYPE
		{
			System.out.println(r);
		}
		float i=9.9f;
		long j=98987644466l;
		
		Varargs mr=new Varargs();
		mr.varag(1,2,3,4,5,5);
 
		mr.varag("james","bond","what");
	}
/*
 * PASS LOT OF ELEMENTS TO ANOTHER METHOD
 * 
 * 
 * 
 * 
 */
}
