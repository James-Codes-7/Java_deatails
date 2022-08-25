package org.same;

import java.io.InputStreamReader;
import java.io.BufferedReader;
public class TryWithResource {

	public static void main(String[] args) throws Exception {
		int f=0;
		try(BufferedReader m=new BufferedReader(new InputStreamReader(System.in)))
		{
			f=Integer.parseInt(m.readLine());
		}
		System.out.println(f);

	}

/*TRY WITH RESOURCE
 * 
 * YOU CANNOT USE TRY WITHOUT FINAL OR CATCH BUT JAVA 1.17 IT OVERCOME IT
 * 
 * WE ACHIVE THIS USE TRY WITH RESOURCE
 * 
 * WE DON'T CLOSE THE RESOURCE IT AUTOMATICALLY CLOSE
 * 
 * 
 * 
 * 
 * 
 */
}
