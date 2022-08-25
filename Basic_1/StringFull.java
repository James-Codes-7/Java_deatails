package org.cons;
import java.util.*;
public class StringFull {

	public void literalString()
	{
		String j="it is j";
		String m="it is j";
		System.out.println(j.hashCode());
		System.out.println(m.hashCode());
	}
	public void nonLiteral()
	{
		String no=new String("james");
		String mo=new String("james");
		System.out.println(no.hashCode());
		System.out.println(mo.hashCode());
	}
	public void imMutable()
	{
		String s1="james";
		String s2="bond";
		System.out.println(s1.hashCode());
		System.out.println(s1);
		s1=s1.concat(s2);
      	System.out.println(s1.hashCode());
		System.out.println(s1);
	}
	public void mutable()
	{
		StringBuffer io=new StringBuffer("james");
		System.out.println(io.hashCode());
		StringBuffer ij=new StringBuffer("bond");
		io=io.append(ij);
		System.out.println(io.hashCode());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StringFull mo=new StringFull();
         mo.literalString();
         mo.nonLiteral();
         mo.imMutable();
         mo.mutable();
	}

	/*STRING
	 * 
	 * STRING IS PREDEFINED CLASS PRESENT IN JAVA LANG PACKAGE
	 * FOUR TYPES
	 * 
	 * LITERAL STRING
	 * NON-LITERAL STRING
	 * IMMUTABLE STRING
	 * MUTABLE STRING
	 * 
	 * IDENTITYHASHCODE() ->GET MEMMORY ADDRESS OF THE OBJECT
	 * 
	 * LITERAL STRING
	 * 
	 * IN CASE OF DUPLICATE IT STORE THAT DUBLICATE IN THE SAME MEMORY ADDRESS
	 * IT IS MEMORY EFFICIENCY
	 * STORE IN THE HEAP MEMORY
	 * 
	 * STRING S="JAMES"
	 * 
	 * NON-LITERAL STRING
	 * 
	 * IN CASE OF DUBLICATES IT CREATES NEW MEMORY REFERRANCE FOR EACH DUBLICATES
	 * STORE IN HEAP MEMORY
	 * 
	 * STRING S1=NEW STRING("JAMES")
	 * STRING S2=NEW STRING("JAMES")
	 * 
	 * 
	 * IMMUTABLE STRING
	 * 
	 * ONCE STRING OBJECT CREATE IT CANNOT BE MODIFIED
	 * YOU WILL MODIFY THE DATA IT ALLOCATE NEW MEMORY ADDRESS
	 * 
	 * STRING S1="JAMES"
	 * STRING S2="BOND"
	 * S1.CONCAT(S2);
	 * 
	 * 
	 * MUTABLE STRING
	 * 
	 * STRING OBJECT VALUE CAN BE MODIFIED BUT IT STORE THE PRIVIOUS SAME ADDRESS
	 * MEMORY EFFICIENCY
	 * 
	 * STRINGBUFFER S1= NEW STRINGBUFFER("JAVA");
	 * STRINGBUFFER S2=NEW  STRINGBUFFER("PROGRAM");
	 * 
	 * STRING BUFFER, STRING BUILDER
	 * 
	 * STRING BUFFER
	 * --->SEQUENTIAL ACCESS --- SYSCHRONISED  ---- ONE BY ONE
	 * --->WHEN MORE THAN ONE THREAD CAN ACCESS STRING BUFFER CLASS IT WILL ALLOW
	 * ONE BY ONE
	 * --->TREAD SAFE
	 * 
	 * STRINGBUILDER
	 * --->PARALLEL ACCESS ---ASYNCHRONISED---FASTER
	 * --->MORETHAN ONE THREAD CAN ACCESS STRINGBUILDER CLASS AT A TIME
	 * --->NOT THREAD SAFE
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 *
	 * 
	 */
}
