package org.same;

import org.multi.ServletJava;
import org.sam.*;
public class Workspace extends ProtectedModifiers  {

	/*protected void mopl()
	{
        b=9;
	}*/
	
	protected void men(int m)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ProtectedModifiers np=new ProtectedModifiers();
      // ProtectedModifiers mp=new Workspace();DYNAMIC BINDING IS NOT WORK
      Workspace mp=new Workspace();
       //np.b=9; CANNOT MODYFY PROTECTED VARIABLE USE THAT OBJECT IN OTHER PACKAGE
     // np.mopl();
       mp.mopl();
       mp.b=9;
       ServletJava m=new ServletJava();
      // np.a=9;
     //  np.ty=5; EXAMPLE OF PROTECTED GO TO ACCESSMODIFIERCLASS
	}

}
