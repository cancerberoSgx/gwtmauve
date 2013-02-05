package gnu.testlet.java.report;

import java.io.Serializable;

import com.google.gwt.user.client.Window;

public class JavaOnlyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		test1();
//		test2();
		test3();
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
