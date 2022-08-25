package org.cons;

class Med
{
	int j=9;
	public void mov()
	{
		System.out.println("true");
	}
}
class Mon  extends Med
{
//	@Override
	public void mov1()
	{
		System.out.println(super.j);//CALL THE VARIABLE
		super.mov();//GOTO THE SUPER CLASS METHOD
		
		System.out.println("false");
	}
}

public class OverridePur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mon no=new Mon();
		no.mov1();
		
		

	}

}
