package org.cons1;

import java.util.*;
public class GarbageCol {

	int mat;
	int ball;
	GarbageCol(int a,int b)
	{
		mat=a;
		ball=b;
	}
	protected void finalize()
	{
		//ANY FILES WANT CLOSE PUT IT
	}
	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		GarbageCol b1=new GarbageCol(8,9);
		
		//b1=null;1.DEREFERANCE
	GarbageCol b2=new GarbageCol(4,6);//2.DEREFERANCE
	
	b2=b1;//THIS TIME b2 MEMORY IS DON'T USE SO COLLECTER DEALLOCATE IT

	new GarbageCol(1,2);//3.DERERANCE
	//ANOUNMOUS OBJECT DON'T HAVE REFERANCE SO COLLECTER DEALLOCATE IT
	}
/*GARBAGE COLLECTOR
 * 
 * WHEN GARBAGE COLLECTER START RUN IT IS DEALLOCATE THE UNWANTED MEMORY SPACE
 * 
 * WHEN WE DEREFERANCE THE MEMORY GARBAGE COLLECTER DEALLOCATE IT
 * 
 * THE TYPES OF DEREFERENCE MENTION THE TOP
 * 
 * FINALIZE
 * 
 * -->protected MODIFIER
 * 
 * -->IT CALLED BY GARBAGE COLLECTER FROM IN THE JVM SO IT protected
 * 
 * -->IT USE TO CLOSE THE RESOURCE
 * 
 * -->BUT CANNOT SAY IT DEFENATELY CLOSE BECAUSE GARBAGE COLLECTER RUN ONLY 
 * IT WORK 
 * -->BEFORE RUN GARBAGE COLLECTOR GO TO FINALIZE TO CHECK ANY RESOURCE WANT TO
 * CLOSE
 * 
 * 
 * 
 * 
 */
}
