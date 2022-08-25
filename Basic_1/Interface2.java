package org.cons;

interface Map
{
	int b=9;
	public  void show();
	public abstract void ne();
}
class Maped implements Map
{
	@Override
	public void show() {
		
	   System.out.println("cannot assaign value to global variable of interface");
	}

	@Override
	public void ne() {
		
		
	}
	
}
public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map t=new Maped();
		t.show();
	     

	}

}
