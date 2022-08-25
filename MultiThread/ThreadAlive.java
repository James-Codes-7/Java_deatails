package org.multi;

class WantMp extends Thread//NOTE THIS CLASS ARE THREAD CLASS
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
class MetroPh extends Thread
{
	public void run()//THREAD IS ONLY RUN IF YOU CHANGE THE METHOD NAME RUN
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("miracle");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}
public class ThreadAlive {

	public static void main(String[] args) throws InterruptedException {
		
		WantMp m=new WantMp();
		MetroPh n=new MetroPh();
		
		m.start();
		if(m.isAlive())
		{
			System.out.println("alive");
		}
		n.start();
		
		int i=0;
		
		
		m.join();
		n.join();
		if(!m.isAlive())
		{
			System.out.println("death thread");
		}
		System.out.println("bye");
			}

	
	//THE THREAD ALIVE USE TO FIND THE THREAD IS RUN OR COMPLETE
	/*
	 * USE isAlive KEYWORD FOR FIND IT
	 * 
	 * IT RETURN BOOLEAN
	 * 
	 * 
	 * 
	 * 
	 */
}
