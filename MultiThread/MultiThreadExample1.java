
package org.multi;

class Want extends Thread//NOTE THIS CLASS ARE THREAD CLASS
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
class Metro extends Thread
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
public class MultiThreadExample1 {

	public static void main(String[] args) {
		
		Want t1=new Want();//CREATE THE OBJECT FOR THREAD WHY WE SAY THIS THREAD
		//BECAUSE IT INHERITS THREAD CLASS
		Metro t2=new Metro();//THREAD 
		
				t1.start();//t1 IS THREAD NAME
				t2.start();
				//t2.start();

		

	}
	
	

}
