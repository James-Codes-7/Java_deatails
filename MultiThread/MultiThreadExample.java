package org.multi;

class inter
{
	public void st()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("hello");
			try {Thread.sleep(1350);} catch (InterruptedException e) {}
		}
	}
}
class intert
{
	public void str()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("james");
			try{Thread.sleep(1000);}catch(Exception m) {}
		}
	}
}
public class MultiThreadExample {

	public void specy()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("mop");
			try {Thread.sleep(1700);} catch (InterruptedException e) {}
		}
	}
	public static void main(String[] args) {
		
		inter n=new inter();
		MultiThreadExample pm=new MultiThreadExample();
		intert m=new intert();
		
		n.st();
		m.str();
		pm.specy();
		System.out.println();

	}
/*
IN THIS SCEANERIO ONLY ACCESS THE METHODS BY MAIN THREAD WHEN ONE METHOD IS COMPLETE
IT GO TO ANOTHER METHOD .WE USE Tread.sleep() WE GIVE ONE TIME TO COMLETE
* 
*  UNTILL THE TIME IS COMPLETE THE ANOTHER METHOD IS WEIGHT
*  
*  
*  
*  * 
	 */

}
