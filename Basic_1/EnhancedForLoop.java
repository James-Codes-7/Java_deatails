package org.cons;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5};
		for(int k:a)
		{
			System.out.println(k);
		}
		
		int[][] arr= {{1,2,3},{4,5,6}};
		
		for(int k[]:arr)
		{
			for(int b:k)
			{
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		
		int[][] arr2= {{1,2,3},{4,5},{6,7,8,9}};
		
		for(int b[]:arr2)
		{
			for(int j:b)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
