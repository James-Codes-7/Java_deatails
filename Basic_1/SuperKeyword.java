package org.cons;
class Ayy
{
	int o=8;
	public Ayy()
	{
		System.out.println("jemw");
	}
	public Ayy(int f)
	{
		System.out.println("andrew");
	}
	public void metro()
	{
		System.out.println("kpo");
	}
	
}
class Mi extends Ayy
{
	public Mi()
	{
		super();//COMPILER AUTOMATICALLY CALL SUPER CLASS IF YOU DON'T DECLARE IT IS OK
		//SUPER CLASS ALSO MUST BEING THE FIRST STATEMENT
		System.out.println(super.o);
		System.out.println("it s mi");
	}
	public Mi(int i)
	{
	//	super(5);//AUTOMATICALLY TAKE ONLY USE INTO THE ANOTHER CONSTRUCTOR
		System.out.println("it is mi 2");
	}
	public void me()
	{
		//super();CANNOT CALL THE CONSTRUCTER INTO THE METHOD SUPER() IS FIRST LINE OF ANY SUBCLASS CONSTRUCTOR
		 super.metro();
		System.out.println("janop");
	}
}
public class SuperKeyword extends Mi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Mi nr =new Mi(5);
       nr.me();
       // This ji=new This(4,7);
        
	}
	

}

