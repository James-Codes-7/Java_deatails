package org.cons1;

class Box
{
	int lenth;
	int breath;
	int height;
	boolean check(Box m)
	{
		if(lenth==m.lenth&&breath==m.breath&&height==m.height)
			return true;
		return false;
		
	}
	Box(int a,int b,int c)
	{
		lenth =a;
		breath=b;
		height=c;
	}
	Box(Box m)
	{
		lenth=m.lenth;
		breath=m.breath;
		height=m.height;
	}
}
public class PassingObjectAsArgument {

	public static void main(String[] args) {
		
	
	Box b1=new Box(2,3,4);
	
	Box b2=new Box(3,4,5);
	
	Box b3=b1;
	System.out.println(b3.hashCode());
	System.out.println(b1.hashCode());
	System.out.println(b3.check(b1));
	Box b4=new Box(b1);
	System.out.println(b3.equals(b4));
	}
}
