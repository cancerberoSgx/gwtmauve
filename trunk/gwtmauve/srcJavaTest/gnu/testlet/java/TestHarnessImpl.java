package gnu.testlet.java;

import gnu.testlet.TestHarness;

public class TestHarnessImpl extends TestHarness {

	@Override
	public void check(boolean result) {
		System.out.println("check: "+result);
	}

//	@Override
//	public InputStream getResourceStream(String name) throws ResourceNotFoundException {
//		return null;
//	}
 
	@Override
	public void checkPoint(String name) {
		System.out.println("checkPoint: "+name);
	}

	@Override
	public void verbose(String message) {
		System.out.println("verbose: "+message);
	}

	@Override
	public void debug(String message) {
		System.out.println("debug: "+message);
	}

	@Override
	public void debug(String message, boolean newline) {
		System.out.println("debug: "+message+" - "+newline);
	}

	@Override
	public void debug(Throwable ex) {
		System.out.println("debug: "+ex);
	}

	@Override
	public void debug(Object[] o, String desc) {
		System.out.println("debug 3: "+o+" - desc: "+desc);
	}

}
