package org.cons1;

public class InvokingMethod {

	int lenth;
	int breath;
	int height;
	int volume()
	{
		return lenth*breath*height;
	}
	public static void main(String[] args) {
		
		InvokingMethod m=new InvokingMethod();
		m.lenth=3;
		m.breath=8;
		m.height=6;
		System.out.println("THE VALUE OF M :"+m.volume());
	}
/*INVOKING
 * 
 * WHEN WE CALL METHOD USING OBJECT THAT IS CALLED INVOKING
 * 
 * WE CREATE LOT OF OBJECT
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
