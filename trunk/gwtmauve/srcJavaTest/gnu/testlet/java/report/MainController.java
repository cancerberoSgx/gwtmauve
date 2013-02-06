package gnu.testlet.java.report;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.SpanElement;

public class MainController {
	public void performJavaLangTests() {
		long t0 = System.currentTimeMillis();
		JavaLangTests javaLangTests = new JavaLangTests();
		Tester tester = new Tester(javaLangTests.getTests());
		tester.testAll();
		String result = tester.buildHTMLReport();
		Document.get().getBody().setInnerHTML(result);
		long time = System.currentTimeMillis() - t0;
		SpanElement timeSpan = Document.get().getElementById("time").cast();
		timeSpan.setInnerHTML(time + " ms");
	}

	public void performJavaUtilTests() {
		long t0 = System.currentTimeMillis();
		JavaUtilTest javaUtilTests = new JavaUtilTest();
		Tester tester = new Tester(javaUtilTests.getTests());
		tester.testAll();
		String result = tester.buildHTMLReport();
		Document.get().getBody().setInnerHTML(result);
		long time = System.currentTimeMillis() - t0;
		SpanElement timeSpan = Document.get().getElementById("time").cast();
		timeSpan.setInnerHTML(time + " ms");
	}
}
