package gnu.testlet.java;

import gnu.testlet.java.report.JavaLangTests;
import gnu.testlet.java.report.Tester;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.Window;

public class GwtMauveTest implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		JavaLangTests javaLangTests = new JavaLangTests(); 		
		Tester tester = new Tester(javaLangTests.getTests());
		tester.testAll(); 
		String result = tester.buildHTMLReport();
		Document.get().getBody().setInnerHTML(result); 
//		
//		test1();
		
//		test2();
	}

	private void test2() {
		try {
			char ch = "abcd".charAt(4);
			Window.alert("ERROR");
		} catch (IndexOutOfBoundsException e) {
			Window.alert("OK");
		}
	}

	private void test1() {
		try {
			StringBuffer sb = new StringBuffer("");
			Window.alert("ERROR");
		} catch (Exception e) {
			Window.alert("OK");
		}
	}

}
