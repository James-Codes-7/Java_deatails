
package org.cons;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[9];
		a[0]=5;
		a[1]=5;
		a[2]=6;
		a[3]=7;
		a[4]=8;
		System.out.println(a[0]);
		
		for(long k:a)//INTEGER ASSAIGN TO FLOAT BUT NOT FLOAT ASSAIN TO INTEGER
		{         //SHORT BYTE ASSAIN TO THE INTEGER BUT CANNOT ASSIGN INTEGER
			        //SHORT BYTE INTEGER ASSAIN TO LONG BUT NOT LONG ASSAIGN
			System.out.println(k);
		}
		
		if(a[0]>a[5])
		{
			System.out.println("james");
		}
		int ad[][]=new int[2][4];
		int[] arr= {3,4,5,3};
		int[][] arr2= {{9,8,7},
	                    {9,8,7}
		               };

		int[][] arr3= {{1,2,3,4},
				       {4,3,2},
				       {7,8,9,6,5}
		               };
		
		int i,j;
		for(i=0;i<arr3.length;i++)
		{
			for(j=0;j<arr3[i].length;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}

	}
/*
 * ARRAY
 * COLLECTION ELEMENTS STORE IN A CONSECTIVE ORDER WITH SAME DATA TYPE
 * JAGGERED ARRAY
 * ONE D ARRAY
 * 2 D ARRAY
 * 
 * 
 */
}
