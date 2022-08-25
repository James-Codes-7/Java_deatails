package org.cons;
 class Outer
{
	int a;
	static int m=9;
	public void method()
	{
		System.out.println("whild");
	}
	public class Inner//MEMBER CLASS
	{
		public void mat()
		{
			System.out.println("hunt");
		}
	}
	static class Inner3//MEMBER CLASS
	{
		public void mat()
		{
			System.out.println("hunt");
		}
	}
	static class Inner2//STATIC CLASS
	{
		public void name() {
			System.out.println("goto");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer ne=new Outer();
		
		Outer.Inner2 num=new Outer.Inner2();
		
		Outer.Inner num2=ne.new Inner();
		num2.mat();
		
		

	}

}
/*INNER CLASS
 * MEMBER CLASS
 * STATIC CLASS
 * ANOMOUS CLASS
 * 
 * INNER CLASS USE TO ONLY ACHIVE THE NEED OF THE MAIN CLASS
 */





