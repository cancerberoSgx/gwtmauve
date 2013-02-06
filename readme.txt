mauve project java tests and test framework for gwt. 
@author: sgurin - Sebastián Gurin
Notes: 

0) the testing framework is in a separate module / jar so it can be reused by other java projects. 
All the Java compatibility tests are in a second gwt module with an entry point.  

1) the same original java package names are used. Not so "gwt", but nice because it allow us to easily integrate new versions of mauveproject sources

2) some few tests in lang and util were commented because of Java compile errors.
you can know who they are in eclipse Problems view (unsexpected error while validating xxx.java)
others tests/packages has be erased because they are tests over java apis not supported by gwt 

3) some parts of the testing framework has been commented because are not compatible with Java GWT.





GWT whitelist  comments: 

things that could be added to the GWT whitelist 

* Character.toUpperCase and Character.toLowerCase are in GWT whitelist but not Character.toTitleCase.... the implementation in sun's jdk are very similar...

* Cloneable appears in the whitelist but not CloneNotSupportedException. Also Object.clone() method is not found (compilation error)

* new StringBuffer(null)  should throw a NPE

* "abcd".charAt(-1) and "abcd".charAt(4); should throw a indexoutofboundsexception

* "hello".substring(-1);  and "hello".substring(22);  b.substring(4, b.length() + 1); and  b.substring(4, -1); all should throw a indexoutofboundsexception

* String.CASE_INSENSITIVE_ORDER instanceof Serializable) should be true

* String.compareTo and new String()  bug: 
int result = "abc\tABC 123".compareTo(new String());
/* notice: "abc\tABC 123".compareTo("") will work ! */
if (result != 11)
	Window.alert("error, result : " + result);
else
	Window.alert("OK, result: " + result);
	
	
* BigInteger.isProbablePrime is very very inneficient.nevertheless in java desktop is not that innefficient. it will take 268 ms wile in gwt javascript prod mode will take 5 secs !

* java.util.Collections.rotate(List, int) is missing 

* TreeSet.clone is missing. 

* clone() is missing in some collectiosn like LinkedList and MapSet. in other collections exists like in vector, arraylist. 

* All collections impls addAll() method should throw a NPE if arg is null:
try {
	Vector<String> v = new Vector<String>();
	v.addAll(null);
} catch (NullPointerException e) {
	Window.alert("OK");
} catch (Throwable e) {
	Window.alert("ERROR");
}

* Vector.addAll(null), Vector.containsAll(null) , Vector.copyInto(null),  Vector.removeAll(null), Vector.retainAll(null), should throw a NPE

* LinkedList.addAll(null), LinkedList.containsAll(null), etc should throw a NPE

* Arrays.fill is not throwing expected index exceptions IllegalArgumentException and ArrayIndexOutOfBoundsException - in this example with boolean, but fails with all.: 
boolean[] b3 = new boolean[2];
try {
	Arrays.fill(b3, 2, 1, false);
	Window.alert("error 1 - IllegalArgumentException expected");
} catch (IllegalArgumentException e) {
}
try {
	Arrays.fill(b3, -1, 1, false);
	Window.alert("error 1 - ArrayIndexOutOfBoundsException expected");
} catch (ArrayIndexOutOfBoundsException e) {
}


* Collections.copy() do not seem to work. The following fails at least with two implementations: LinkedList and ArrayList: 
List<String> l1 = new LinkedList<String>();
List<String> l2 = new LinkedList<String>();
//	    List<String> l1 = new ArrayList<String>();
//	    List<String> l2 = new ArrayList<String>();
// copy empty list
Collections.copy(l2, l1);
l1.add("A");
l2.add("B");
Collections.copy(l2, l1);
if(!l2.get(0).equals("A")) {
	Window.alert("error"); 
}