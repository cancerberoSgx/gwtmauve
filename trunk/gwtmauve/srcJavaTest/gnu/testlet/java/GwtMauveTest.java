package gnu.testlet.java;

import gnu.testlet.java.lang.Double.DoubleTest;

import com.google.gwt.core.client.EntryPoint;

public class GwtMauveTest implements EntryPoint {

	@Override
	public void onModuleLoad() {
		System.out.println("jaja");
		
		DoubleTest t1 = new DoubleTest();
		TestHarnessImpl h = new TestHarnessImpl(); 
		t1.test(h); 
		
	}

}
