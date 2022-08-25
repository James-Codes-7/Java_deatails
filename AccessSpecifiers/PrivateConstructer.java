package org.sam;

class Nbp
{
	private int n=8;
	public void met()
	{
		System.out.println("koplop");
	}
	/*private Nbp()
	{
		
	}*/
	
}
public class PrivateConstructer extends Nbp {

	public void met()
	{
		System.out.println("james");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // PrivateConstructer jp=new  PrivateConstructer();       
      Nbp p=new Nbp();
     p.met();
	}
	//IF YOU CHANGE THE CONSTRUCTOR PRIVATE YOU CANNOT CREATE THE  
	/*OBJECT OF THE CLASS IN OTHER CLASS
	 * 
	 * 
	 * 
	 */

}
