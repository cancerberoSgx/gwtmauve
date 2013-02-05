package gnu.testlet.java;

import gnu.testlet.java.report.JavaLangTests;
import gnu.testlet.java.report.JavaUtilTest;
import gnu.testlet.java.report.Tester;
import gnu.testlet.java.report.ui.Main;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtMauveTest implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		RootPanel.get().add(new Main()); 
		
//		JavaLangTests javaLangTests = new JavaLangTests(); 		
//		Tester tester = new Tester(javaLangTests.getTests());
//		tester.testAll(); 
//		String result = tester.buildHTMLReport();
//		Document.get().getBody().setInnerHTML(result); 
		
//		JavaUtilTest javaUtilTests = new JavaUtilTest(); 		
//		Tester tester = new Tester(javaUtilTests.getTests());
//		tester.testAll(); 
//		String result = tester.buildHTMLReport();
//		Document.get().getBody().setInnerHTML(result); 
		
		
	}

//	private void test2() {
//		try {
//			char ch = "abcd".charAt(4);
//			Window.alert("ERROR");
//		} catch (IndexOutOfBoundsException e) {
//			Window.alert("OK");
//		}
//	}
//
//	private void test1() {
//		try {
//			StringBuffer sb = new StringBuffer("");
//			Window.alert("ERROR");
//		} catch (Exception e) {
//			Window.alert("OK");
//		}
//	}

}
