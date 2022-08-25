package org.cons;

class Abj
{
	int a;
	String name;//ANYONE CAN ACCESS THE DATA
}
class Bbj
{
	private int a;//ONLY ACCESS  WITH METHODS
	private String name;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abj obj =new Abj();
		obj.a=8;
		obj.name="nave";
		System.out.println(obj.a);
		System.out.println(obj.name);
		
      Bbj no =new Bbj();
      no.setA(2);
      no.setName("james");
      System.out.println(no.getA());
      System.out.println(no.getName());
      //BINDING THE DATA AND METHOD PROTECT THE DATA ONLY ACCESS WITH METHODS
      
      
	}

}
