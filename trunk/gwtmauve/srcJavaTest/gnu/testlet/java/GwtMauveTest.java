package gnu.testlet.java;

import gnu.testlet.java.lang.Double.DoubleTest;
import gnu.testlet.java.report.JavaLangTests;
import gnu.testlet.java.report.Tester;

import com.google.gwt.core.client.EntryPoint;

public class GwtMauveTest implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		DoubleTest t1 = new DoubleTest();
		TestHarnessImpl h = new TestHarnessImpl(); 
		t1.test(h); 
		
		JavaLangTests javaLangTests = new JavaLangTests(); 
		
		Tester tester = new Tester(javaLangTests.getTests(), "");
		String result = tester.buildHTMLReport();
		System.out.println(result);
		System.out.println("end");
		
	}

}
