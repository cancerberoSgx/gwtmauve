package gnu.testlet.java.report;

import java.io.Serializable;
import java.math.BigInteger;

import com.google.gwt.user.client.Window;

public class JavaOnlyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		test1();
//		test2();
//		test3();
		
		test4();
	}

	private static void test4() {
		long t0 = System.currentTimeMillis(); 
		String ps = "c6c93915786185fa7ee88f1983cc8d238cd6c5f7a36416c8be317c3df475277784ae1b87b263b88a84d5bacaf63798474ffe490fa412cb437abe5908efbe41b1"; 
		BigInteger p = new BigInteger(ps, 16);

		boolean prime = p.isProbablePrime(50);
		
		System.out.println(prime+" time: "+(System.currentTimeMillis()-t0));
	}

	private static void test2() {
		System.out.println((String.CASE_INSENSITIVE_ORDER instanceof Serializable)+"");
		
	}

	private static void test3() {
		char[] cstr = { 'a', 'b', 'c', '\t', 'A', 'B', 'C', ' ', '1', '2', '3' };
		 String a = new String();
	      String b = new String(" abc\tABC 123\t");
	      String d = new String(cstr);
	      String e = new String(cstr, 3, 3);

	      if(d.compareTo(b.trim())!=0)
	    	  System.out.println("error1");
	      if(d.compareTo(a)!=11)
	    	  System.out.println("err2");
	      
	      int result = "abc\tABC 123".compareTo("");
	      
	      System.out.println(result);
	}

	private static void test1() {
		boolean b = !( !Float.toString( 0.001f ).equals ("0.001" ));
		System.out.println(Float.toString( 0.001f ));
	}

}
