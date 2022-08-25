package org.same;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		try
		{
			System.out.println("james");
			int arr[]=new int[4];
			arr[5]=9;//IT TAKE WHICH TYPE OF EXCEPTION OCCUR FIRST IT GO THAT CATCH
			//IF THE CATCH NOT PLACE IN PROGRAM IT GIVES ERROR
			int a=9/0;
			String m=null;
			System.out.println(m);
			
		}
		/*catch(Exception p)
		{
			System.out.println("error");IT GIVE ERROR
		}*/
		catch(ArithmeticException i)
		{
			System.out.println("it is Arithmatic exception");
		}
		catch(ArrayIndexOutOfBoundsException o)
		{
			System.out.println("you crass the limit");
		}
		catch(NullPointerException o)
		{
			System.out.println("about null poiter");
		}
		catch(Exception e)
		{
			System.out.println("something");
		}
		finally
		{
			System.out.println("bye");
		}

	}
/*MULTIBLE CATCH BLOCKS
 * 
 * MULTIBLE CATCH BLOCKS HAVE MORE THAN ONE CATCH BLOCKS
 * 
 * THAT CATCHES HAVE DIFFEERENT EXCEPTION LIKE
 * ArithimeticException
 * NullPointerException
 * NumberFormatException
 * IndexOutOfBoundException
 * 
 * THIS KEYWORD "Exception" COMMONLY REFER THE ALL THE EXCEPTION
 *  -->WHEN WE USE LOT OF CATHES WE DECLARE THAT NORMAL EXCEPTION CATCH LAST POSITION
 * -->IF YOU DECLARE FIRST GIVE ERROR
 * 
 * 
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
