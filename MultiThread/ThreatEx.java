package org.multi;

public class ThreatEx {

	public static void main(String[] args) {
		
		for(int i=0;true;i++)
		{
			System.out.println("*    *   *    *   *  *  * *  *  *  *  * ");
			try{Thread.sleep(200);}catch(Exception e) {}
			System.out.println("* * * *  * * * * * * * * * * * *  *  * *");
			try{Thread.sleep(400);}catch(Exception e) {}
			
		}

	}

}
