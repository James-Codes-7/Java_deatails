package org.multi;


public class AnounmousMultiThread {

	public static void main(String[] args) {
		
		Runnable n=new Runnable()
				{

					@Override
					public void run() {
					
						int i;
						for(i=0;i<5;i++)
						{
							System.out.println("james");
						try {Thread.sleep(1000);} catch (InterruptedException e) {}
						}
						
					}
				};
				Thread mpo=new Thread(n);
				mpo.start();

	}

}
