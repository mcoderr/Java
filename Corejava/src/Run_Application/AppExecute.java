package Run_Application;

import Composition.*;
import Composition.TestString;
import inheritance.Chess;

public class AppExecute {
	int p=15;
	public static void main(String[] args) {
//		int s=3;
//		System.out.println(s&1);
//		TestString ws = new TestString();
//		System.out.println(ws);
		//Bath b = new Bath();
		//System.out.println(b);
		Chess s =new Chess(1);
		s.get();
	}
	
	void Hello()
	{
		world();
		p=3;
		System.out.println("P"+p);
	}
	
	void world()
	{
		p=3;
		System.out.println("P"+p);
	}
	

}
