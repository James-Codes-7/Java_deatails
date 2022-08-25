package org.same;

public class BankAccountException {

	int amount=1000;
	int withdraw;
	public  void met(int wit) throws Exception
	{
		withdraw=wit;
		try
		{
		if(amount<withdraw)
		{
			throw new JamesException("INUSFFICIENT AMOUNT");
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) throws Exception {
		BankAccountException m=new BankAccountException();
		
		m.met(1500);
         
	}

}
