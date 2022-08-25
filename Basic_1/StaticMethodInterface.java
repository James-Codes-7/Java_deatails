package org.cons;

interface Cop
{
	int a=9;//MUST BE ASSAIGN THE VALUE ITS TAKE FINAL
     public void np();
     static void mp()//ACHIEVED IN 1.8 JAVA
     {
    	 System.out.println("james");
     }
}
public class StaticMethodInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cop.mp();//YOU DIRECTLY CALLED THE STATIC METHOD IN INTERFACE 
	}
	//IT INDRODUCED IN JAVA 8
}
