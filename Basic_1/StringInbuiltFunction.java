package org.cons;

public class StringInbuiltFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String p ="  james bonD";
       String p1="  james bond";
       int i=p.indexOf("b");
       System.out.println(i);
       
       char a=p.charAt(4);
       System.out.println(a);
       
       int n=p.lastIndexOf(a);
       System.out.println(n);
       
       boolean m=p.startsWith("j");
       System.out.println(m);
       
       boolean m1=p.endsWith("d");
       System.out.println(m1);
       
       String j=p.toUpperCase();
       System.out.println(j);
       
       String m2=p.replace("m","p");//REPALCE THE ANOTHER DATA
       System.out.println(m2);
       
       boolean in=p.isEmpty();//CHECK THE STRING IS EMPTY
       System.out.println(in);
       
       boolean im=p.contains("nd");//IT CONTAINS THAT VALUE
       System.out.println(im);
       
       boolean ip=p.equals(p1);//COMPARE WITH ASCII VALUE
       System.out.println(ip);
       
       
       boolean op=p.equalsIgnoreCase(p);//CHANGE LOWER CASE AND COMPARE
       System.out.println(op);
       
       
       int jk=p.compareTo(p1);
       System.out.println(jk);//ANY ELEMENT NOT MATCH RETURN THE ASCII MINUS VALUE
       
       String ni=p.replaceAll(p1, p);//REPLACE THE STRING BY ANOTHER STRING
       System.out.println(ni);
       
       String miu=p.trim();//THE PLACE BEFORE THE STRING IS REMOVED
       System.out.println(miu);
       
       String nio=p.substring(5);//PRINT THE STRING FROM THAT POSITION
       System.out.println(nio);
       
       String mio=p.substring(2, 7);//PRINT THE STRING UPTO THAT POSITION
       System.out.println(mio);
       
       String[] pom=p.split("b");//SPLIT THE STRING FROM THE POSITION
       int k;
       for(k=0;k<pom.length;k++)
       {
    	   System.out.println(pom[k]);
       }
       
       
	}

}
