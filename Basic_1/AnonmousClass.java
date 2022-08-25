package org.cons;

class Name
{
	public void show()
	{
		System.out.println("james");//IF YOU CHANGE THE NAME USE METHOD OVERRIDE
	}
}
class Mane extends Name
{
	public void show1()
	{
		System.out.println("sudaa");
	}
}
public class AnonmousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Name  ben=new Mane()//IT ALSO TAKE SUPER CLASS METHODS
				{
		           public void show1()//YOU OVERRIDE BUT CANNOT CALL IT IN DYNAMIC
		           //BINDING
		           {
		        	   System.out.println("bond");
		           }
		           public void show()
		           {
		        	   System.out.println("james");
		           }
		           
				};
				ben.show();
			  //  ben.show1();//CANNOT DO IT
		Mane bev1= new Mane()
				{
			         public void defg()
			         {
			        	 System.out.println("koplnm");
			         }
				};
				//bev1.defg();//IF YOU DEFINE THE METHOD IN THE CLASS THAT ONLY CALL
				//IF YOU CREATE THE NEW METHOD IN ANOMOUS CLASS CANNOT CALL
	}
	/*
	 * ANONMOUS CLASS
	 * 
	 * IT IS THE CLASS DON'T HAVE NAME
	 * WHEN CREATE THE OBJECT BEFORE THE SEMICOLON YOU DECLARE THE IMPLEMENTATION
	 * DON'T NEED OVERRIDING
	 * 
	 * 
	 * 
	 * 
	 */

}
