package gnu.testlet.java.report;

import gnu.testlet.Testlet;
import gnu.testlet.java.util.AbstractCollection.AcuniaAbstractCollectionTest;
import gnu.testlet.java.util.AbstractCollection.AcuniaAddCollectionTest;
//import gnu.testlet.java.util.AbstractCollection.ACtoString;
import gnu.testlet.java.util.AbstractList.AcuniaAbstractListTest;
import gnu.testlet.java.util.AbstractMap.AcuniaAbstractMapTest;
import gnu.testlet.java.util.AbstractSet.AcuniaAbstractSetTest;
import gnu.testlet.java.util.ArrayList.AcuniaArrayListTest;
//import gnu.testlet.java.util.ArrayList.serial;
import gnu.testlet.java.util.ArrayList.subList;
//import gnu.testlet.java.util.Arrays.Equals;
import gnu.testlet.java.util.Arrays.asList;
import gnu.testlet.java.util.Arrays.binarySearch;
import gnu.testlet.java.util.Arrays.fill;
import gnu.testlet.java.util.Arrays.sort;
import gnu.testlet.java.util.Collections.copy;
import gnu.testlet.java.util.Collections.max;
import gnu.testlet.java.util.Collections.min;
import gnu.testlet.java.util.Collections.nCopies;
import gnu.testlet.java.util.Collections.reverse;
import gnu.testlet.java.util.Collections.reverseOrder;
import gnu.testlet.java.util.Collections.rotate;
import gnu.testlet.java.util.Collections.unmodifiableList;
import gnu.testlet.java.util.Collections.unmodifiableMap;
import gnu.testlet.java.util.HashMap.AcuniaHashMapTest;
import gnu.testlet.java.util.Hashtable.AcuniaHashtableTest;
import gnu.testlet.java.util.Hashtable.ContainsHash;
import gnu.testlet.java.util.Hashtable.EnumerateAndModify;
import gnu.testlet.java.util.Hashtable.HashContains;
import gnu.testlet.java.util.Hashtable.NullValue;
import gnu.testlet.java.util.Hashtable.basic;
import gnu.testlet.java.util.Iterator.ConcurrentModification;
import gnu.testlet.java.util.LinkedHashMap.LinkedHashMapTest;
import gnu.testlet.java.util.LinkedHashMap.Regress;
import gnu.testlet.java.util.LinkedList.AcuniaLinkedListTest;
import gnu.testlet.java.util.LinkedList.SubListTest;
import gnu.testlet.java.util.Properties.AcuniaPropertiesTest;
import gnu.testlet.java.util.Properties.getProperty;
import gnu.testlet.java.util.Properties.load;
//import gnu.testlet.java.util.ResourceBundle.getBundle;
import gnu.testlet.java.util.TreeMap.serialization;
import gnu.testlet.java.util.Vector.AcuniaVectorTest;
//import gnu.testlet.java.util.Vector.VectorSerialization;
import gnu.testlet.java.util.Vector.copyInto;
import gnu.testlet.java.util.Vector.removeAll;
import gnu.testlet.java.util.Vector.retainAll;
import gnu.testlet.java.util.prefs.PreferenceTest;
import gnu.testlet.java.util.regex.CharacterClasses;
import gnu.testlet.java.util.regex.PatternSplit;
import gnu.testlet.java.util.regex.Matcher.Regions;
import gnu.testlet.java.util.regex.Matcher.hitEnd;
import gnu.testlet.java.util.regex.Pattern.UnicodeSimpleCategory;
import gnu.testlet.java.util.regex.Pattern.matches;

import java.util.LinkedList;

public class JavaUtilTest {

	private LinkedList<Testlet> tests;

	public JavaUtilTest(LinkedList<Testlet> tests) {
		this.tests=tests;
		doAbstractCollectionAll();	
		doArrayList();
		doArrays();
////		doBitSet();//TODO
////		doCalendar();//TODO
		doCollections();
////		doCurrency();//TODO
////		doDate();//TODO
////		doEnumSet();//TODO
////		doGregorianCalendar();//TODO
		doHashTableAndMap();
		doIterator();
		doLinkedHashMap();
		doLinkedList();
		doPreferenceTest();
		doProperties();
		doRandom();
		doRegex();
//		doResourceBundle();
////		doSimpleTimeZone();//TODO;
		doTreeSet();
		doVector();
	}


	private void doVector() {
		tests.add(new AcuniaVectorTest());
		tests.add(new copyInto());
		tests.add(new removeAll());
		tests.add(new retainAll());
		tests.add(new gnu.testlet.java.util.Vector.subList());
//		tests.add(new VectorSerialization());//features not supported by j2s
	}


	private void doTreeSet() {
//		tests.add(new serialization());
		tests.add(new gnu.testlet.java.util.TreeSet.basic());
	}


//	private void doResourceBundle() {
//		tests.add(new getBundle());
//	}


	private void doRegex() {
		tests.add(new CharacterClasses());
//		tests.add(new PatternSplit());
		
		//pattern
		tests.add(new matches());
		tests.add(new UnicodeSimpleCategory());
		
		//matcher
//		tests.add(new hitEnd());
//		tests.add(new Regions());
		
	}


	private void doRandom() {
		tests.add(new gnu.testlet.java.util.Random.basic());
	}


	private void doProperties() {
		tests.add(new AcuniaPropertiesTest());
		tests.add(new getProperty());
		tests.add(new load());
	}


	private void doPreferenceTest() {
		tests.add(new PreferenceTest());
	}


	private void doLinkedList() {
		tests.add(new AcuniaLinkedListTest());
		tests.add(new gnu.testlet.java.util.LinkedList.subList());
		tests.add(new SubListTest());
	}


	private void doLinkedHashMap() {
		tests.add(new LinkedHashMapTest());
		tests.add(new Regress());
	}


	private void doIterator() {
		tests.add(new ConcurrentModification());
	}


	private void doHashTableAndMap() {
		tests.add(new AcuniaHashMapTest());
		tests.add(new AcuniaHashtableTest());
		tests.add(new basic());
		tests.add(new ContainsHash());
		tests.add(new EnumerateAndModify());
		tests.add(new HashContains());
		tests.add(new NullValue());
	}


	private void doCollections() {
		tests.add(new gnu.testlet.java.util.Collections.binarySearch());
		tests.add(new copy());
		tests.add(new gnu.testlet.java.util.Collections.fill());
		tests.add(new max());
		tests.add(new min());
		tests.add(new nCopies());
		tests.add(new reverse());
		tests.add(new reverseOrder());
		tests.add(new rotate());
		tests.add(new sort());
		tests.add(new unmodifiableList());
		tests.add(new unmodifiableMap());		
	}


	private void doArrays() {
		tests.add(new asList());
		tests.add(new binarySearch());
//		tests.add(new Equals());
		tests.add(new fill());
		tests.add(new sort());
		
	}


	private void doArrayList() {
		tests.add(new AcuniaArrayListTest());
//		tests.add(new serial());
		tests.add(new subList());
	}


	private void doAbstractCollectionAll() {
		tests.add(new AcuniaAddCollectionTest());
		tests.add(new AcuniaAbstractCollectionTest());
//		tests.add(new gnu.testlet.java.util.AbstractCollection.ACtoString());		
		tests.add(new AcuniaAbstractListTest());
		tests.add(new AcuniaAbstractMapTest());
		tests.add(new AcuniaAbstractSetTest());
	}

}
