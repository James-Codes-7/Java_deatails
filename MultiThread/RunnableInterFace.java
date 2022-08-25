package org.multi;

class WantMpm implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("update database");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}
class MetroPho implements Runnable
{
   
	public void run()//THREAD IS ONLY RUN IF YOU CHANGE THE METHOD NAME RUN
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("miracle");
			try {Thread.sleep(1500);} catch (InterruptedException e) {}
		}
	}
	
}
public class RunnableInterFace {

	public static void main(String[] args) throws InterruptedException {
		
		WantMpm m=new WantMpm();
		//WHY WE USE REFERANCE RUNNABLE BECAUSE ONLY USE RUNNABLE CLASS METHODS
		Runnable no=new MetroPho();
		
		Thread n=new Thread(m);//ACCESS THE THREAD CLASS CREATE THE OBJECT
		//SEND THE OBJECT M TO THE THREAD CONSTRUCTOR
		n.setName("james");
		n.setPriority(1);//COMPILER AUTOMATICALLY TAKE PRIORITY 5 IF WE DON'T SET
		Thread b=new Thread(no);
		b.setName("bond");
		b.setPriority(10);
		n.start();
		b.start();
		n.join();
		b.join();
		System.out.println("bye");
		System.out.println(n.getName());
		System.out.println(n.getPriority());
		System.out.println(b.getName());
		System.out.println(b.getPriority());
		
		
		

	}
	/*RUNNABLE
	 * 
	 * IF WE EXTENDS THE THREAD CLASS  IN ANOTHER CLASS WE CANNOT EXTENDS OTHER CLASS 
	 * IN THAT CLASS 
	 * 
	 * OVERCOME THAT DRAWBACK USE RUNNABLE INTERFACE IN JAVA
	 * 
	 * RUNNABLE INTERFACE IS FUNCTIONAL INTERFACE
	 * 
	 * ONLY ONE METHOD IS DECLARE IN INTERFACE
	 * 
	 * WE SET NEME,PRORITY TO THREAD OBJECT
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
