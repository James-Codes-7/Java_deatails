package org.cons;


interface Mope
{
	default void pro()
	{
		System.out.println("i am mop");
	}
}
interface  Vop
{
	default  void pro()//DEFAULT ONLY USE WITH INTERFACE
	{
		System.out.println("i am vop");
	}
}
class Pop implements Mope,Vop
{
	//TWO METHODS ARE SAME NAME

	@Override
	public void pro() {
		// TODO Auto-generated method stub
		Vop.super.pro();//WHICH CLASS YOU WANT TO OVERRIDE YOUR WISH
	}
	
}
public class DefaultInterfaceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pop n=new Pop();
        n.pro();
        System.out.println("james");
	}

}
