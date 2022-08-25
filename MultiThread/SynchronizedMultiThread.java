package org.multi;

class Mpoi
{
	public synchronized void met(int a)//ONLY ONE THREAD IS ACCESS AT THE TIME
	{
		int i;
		for(i=1;i<=5;i++)
		{
			System.out.println(a*i);
			try {Thread.sleep(1000);}catch(Exception p) {}
		}
	}
}
public class SynchronizedMultiThread {

	public static void main(String[] args) {
		
		Mpoi n=new Mpoi();
		//n.met(5);
		
		Thread mp=new Thread()
				{
			    public void run()
			   {
				n.met(5);
			   }
			
			};
			
		Thread p=new Thread() {
			
			public void run()
			{
				n.met(10);
			}
		};
		synchronized(p)
		{
			p.start();
				
		}
		
	mp.start();
	

	}
	/*SYNCHRONIZED 
	 * 
	 * IF WE USE LOT OF THREADS AND ACCESS ONLY ONE METHOD
	 * THAT TIME IT GIVE MIXED OUTPUT 
	 * 
	 * IF WE WANT ACCESS ONE THREAD ACCESS THE METHOD UNTIL ANATHER THREADS ARE
	 * WAIT USE SYNCHRONIZED
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
