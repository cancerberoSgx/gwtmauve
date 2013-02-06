package gnu.testlet.java;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import gnu.testlet.Testlet;
import gnu.testlet.java.report.GwtTestHarness;
import gnu.testlet.java.report.JavaLangTests;
import gnu.testlet.java.report.Tester;
import gnu.testlet.java.report.ui.Main;
import gnu.testlet.java.util.AbstractCollection.AcuniaAbstractCollectionTest;
import gnu.testlet.java.util.AbstractCollection.AcuniaAddCollectionTest;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtMauveTest implements EntryPoint {

	@Override
	public void onModuleLoad() {

		 RootPanel.get().add(new Main());

//		 testIt1();
//		 testAlone();

//		testGwtLog();

//		testCollectionAddAll();

	}

//	private void testIt1() {
//		Collection<String> c = new LinkedList<String>();
//		c.add("one"); c.add("two"); c.add("three"); 
//		Iterator<String> it = c.iterator(); 
//		it.next(); it.hasNext(); it.remove(); 
//		Window.alert(c.size()+" - "+it.next());
//		
//	}

//	private void testCollectionAddAll() {
//try {
//	Vector<String> v = new Vector<String>();
//	v.addAll(null);
//} catch (NullPointerException e) {
//	Window.alert("OK");
//} catch (Throwable e) {
//	Window.alert("ERROR");
//}
//	}

//	private void testGwtLog() {
//		/*
//		 * Install an UncaughtExceptionHandler which will produce <code>FATAL</code> log messages
//		 */
//		Log.setUncaughtExceptionHandler();
//
//		// use deferred command to catch initialization exceptions in onModuleLoad2
//		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
//			@Override
//			public void execute() {
//				testGwtLog2();
//			}
//		});
//
//	}
//
//	protected void testGwtLog2() {
//		Log.debug("This is a 'DEBUG' test message");
//		Log.info("This is a 'INFO' test message");
//		Log.warn("This is a 'WARN' test message");
//		Log.error("This is a 'ERROR' test message");
//		Log.fatal("This is a 'FATAL' test message");
//		testAlone();
//	}

//	private void testAlone() {
//		Testlet test = new AcuniaAbstractCollectionTest();
////		GwtTestHarness h = new GwtTestHarness("test1", test);
////		test.test(h);
//		 long t0 = System.currentTimeMillis();
//		 List<Testlet> list = new LinkedList<Testlet>();
//		 list.add(test);
////		 JavaLangTests javaLangTests = new JavaLangTests();
//		 Tester tester = new Tester(list);
//		 tester.testAll();
//		 String result = tester.buildHTMLReport();
//		 Document.get().getBody().setInnerHTML(result);
//		 long time = System.currentTimeMillis() - t0;
//		 SpanElement timeSpan = Document.get().getElementById("time").cast();
//		 timeSpan.setInnerHTML(time + " ms");
//	}

}
