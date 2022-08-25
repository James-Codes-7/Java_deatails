package org.cons;

abstract class Jlp
{
	abstract void met();
	
	public void met1()
	{
		System.out.println("james");
	}
	abstract void met3();

	protected abstract void nmp();
}
public class AnounmousAbstract {

	public static void main(String[] args) {
		
		Jlp n=new Jlp()//MUST IMPLEMENT ALL THE ABSTRACT METHOD
				{

					@Override
					void met() {
						// TODO Auto-generated method stub
						
					}
					public void nmp()
					{
						System.out.println("jaio");
					}

					@Override
					void met3() {
						// TODO Auto-generated method stub
						
					}
			
				};

	}

}
