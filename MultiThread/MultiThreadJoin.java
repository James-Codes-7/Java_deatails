package org.multi;

class WantM extends Thread//NOTE THIS CLASS ARE THREAD CLASS
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
class MetroP extends Thread
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
public class MultiThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		
		WantM n=new WantM();
		MetroP p=new MetroP();
		n.start();
		p.start();
		
      	n.join();
      	 p.join();
      	System.out.println("bye");
		
		
		
		/*WHY IT PRINF bye FIRST BECAUSE MAIN THREAD IS TRAVERSE UP TO DOWN THAT 
		 * SEE THE n.start() and p.start() THE MAIN THREAD THING IT IS WORK OF 
		 * ANOTHER THREAD
		 * 
		 * SO DIRECTLY GO NEXT LINE
		 * 
		 * OVERCOME THIS PROCESS USE THREAD JOIN
		 * 
		 * IF WE USE THREAD JOIN THE MAIN WAIT UNTILL THE ANOTHER THREAD PROCESS
		 * IS END
		 * 
		 * WE THROWS THE EXCEPTION TO USE JOIN METHOD
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
