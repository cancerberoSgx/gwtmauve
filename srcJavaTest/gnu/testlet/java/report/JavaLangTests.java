package gnu.testlet.java.report;

import gnu.testlet.Testlet;
import gnu.testlet.java.lang.Boolean.BooleanTest;
import gnu.testlet.java.lang.Boolean.equals_Boolean;
import gnu.testlet.java.lang.Boolean.hashcode_Boolean;
import gnu.testlet.java.lang.Boolean.new_Boolean;
import gnu.testlet.java.lang.Boolean.value;
import gnu.testlet.java.lang.Byte.ByteTest;
import gnu.testlet.java.lang.Byte.new_Byte;
import gnu.testlet.java.lang.Character.classify;
import gnu.testlet.java.lang.Character.classify12;
import gnu.testlet.java.lang.Character.digit;
import gnu.testlet.java.lang.Character.equals_Character;
import gnu.testlet.java.lang.Character.forDigit;
import gnu.testlet.java.lang.Character.hash;
import gnu.testlet.java.lang.Character.to;
import gnu.testlet.java.lang.Class.ClassTest;
import gnu.testlet.java.lang.Class.init;
import gnu.testlet.java.lang.Class.newInstance;
import gnu.testlet.java.lang.Cloneable.CloneableTest;
import gnu.testlet.java.lang.Double.DoubleSetterTest;
import gnu.testlet.java.lang.Double.DoubleTest;
import gnu.testlet.java.lang.Double.compare;
import gnu.testlet.java.lang.Double.new_Double;
import gnu.testlet.java.lang.Double.parseDouble;
import gnu.testlet.java.lang.Enum.PR33183;
import gnu.testlet.java.lang.Float.FloatTest;
import gnu.testlet.java.lang.Float.new_Float;
import gnu.testlet.java.lang.Float.parseFloat;
import gnu.testlet.java.lang.Integer.IntegerTest;
import gnu.testlet.java.lang.Integer.Tests15;
import gnu.testlet.java.lang.Integer.compareTo;
import gnu.testlet.java.lang.Integer.decode;
import gnu.testlet.java.lang.Integer.new_Integer;
import gnu.testlet.java.lang.Integer.parseInt;
import gnu.testlet.java.lang.Integer.parseIntRadix;
import gnu.testlet.java.lang.Long.LongTest;
import gnu.testlet.java.lang.Long.new_Long;
import gnu.testlet.java.lang.Math.MathTest;
import gnu.testlet.java.lang.Math.cos;
import gnu.testlet.java.lang.Math.max;
import gnu.testlet.java.lang.Math.min;
import gnu.testlet.java.lang.Math.rint;
import gnu.testlet.java.lang.Math.sin;
import gnu.testlet.java.lang.Math.tan;
import gnu.testlet.java.lang.String.CASE_INSENSITIVE_ORDER;
import gnu.testlet.java.lang.String.StringTest;
import gnu.testlet.java.lang.String.charAt;
import gnu.testlet.java.lang.String.getBytes;
import gnu.testlet.java.lang.String.getBytes13;
import gnu.testlet.java.lang.String.getBytes14;
import gnu.testlet.java.lang.String.indexOf;
import gnu.testlet.java.lang.String.new_String;
import gnu.testlet.java.lang.String.replaceAll;
import gnu.testlet.java.lang.String.startsWith;
import gnu.testlet.java.lang.String.substring;
import gnu.testlet.java.lang.String.surrogate;
import gnu.testlet.java.lang.StringBuffer.PR34840;
import gnu.testlet.java.lang.StringBuffer.StringBufferTest;
import gnu.testlet.java.lang.StringBuffer.plus;

import java.util.LinkedList;

/**
 * For GWT this is the whitelist : 
 * 
 * https://developers.google.com/web-toolkit/doc/latest/RefJreEmulation#Package_java_lang
 * 
 * @author sgurin
 * 
 */
public class JavaLangTests {

	private LinkedList<Testlet> tests;

	public JavaLangTests() {
		tests = new LinkedList<Testlet>();

		doBoolean();
		doByte();
		doCharacter();
		// doClass();
		// doCloneable(); //fails compile ... gwt bug ? No source code is available for type java.lang.CloneNotSupportedException; did you forget to inherit a required module?
		doDouble();
		doEnum();
		doFloat();
		doInteger();
		doLong();
		doMath();
		doNumber();
		doObject();
		doShort();
		doString();
		doStringBuffer();
		// doSystem();
		doBigDecimal();
		doBigInteger();
		doNullPointerException();
		doUnsupportedOperationException();
		doNumberFormatException();
		doArrayIndexOutOfBoundsException() ; 
		doArithmeticException();
	}

	private void doArithmeticException() {
		tests.add(new gnu.testlet.java.lang.ArithmeticException.constructor());
		tests.add(new gnu.testlet.java.lang.ArithmeticException.TryCatch());
	}

	private void doArrayIndexOutOfBoundsException() {
		tests.add(new gnu.testlet.java.lang.IndexOutOfBoundsException.constructor());
		tests.add(new gnu.testlet.java.lang.IndexOutOfBoundsException.TryCatch());
	}

	private void doNumberFormatException() {
		tests.add(new gnu.testlet.java.lang.NumberFormatException.constructor());
		tests.add(new gnu.testlet.java.lang.NumberFormatException.TryCatch());
	}

	private void doUnsupportedOperationException() {
		tests.add(new gnu.testlet.java.lang.UnsupportedOperationException.constructor());
		tests.add(new gnu.testlet.java.lang.UnsupportedOperationException.TryCatch());
	}

	private void doNullPointerException() {
		tests.add(new gnu.testlet.java.lang.NullPointerException.constructor());
		tests.add(new gnu.testlet.java.lang.NullPointerException.TryCatch());
	}

	private void doBigInteger() {

		tests.add(new gnu.testlet.java.math.BigInteger.abs());
		tests.add(new gnu.testlet.java.math.BigInteger.compareTo());
		tests.add(new gnu.testlet.java.math.BigInteger.ctor());

		tests.add(new gnu.testlet.java.math.BigInteger.divide());
		tests.add(new gnu.testlet.java.math.BigInteger.equals());

		// tests.add(new gnu.testlet.java.math.BigInteger.modInverse());
		/*
		 * BigInteger.isProbablePrime is very inneficient.nevertheless in java desktop is not that innefficient. it will take 268 ms wile in gwt javascript prod mode will take 5
		 * secs ! The test ends without errors but i commented it for the sake of the full report.
		 */

		tests.add(new gnu.testlet.java.math.BigInteger.modPow());
		tests.add(new gnu.testlet.java.math.BigInteger.multiply());
		tests.add(new gnu.testlet.java.math.BigInteger.setBit());
		tests.add(new gnu.testlet.java.math.BigInteger.shift());
		tests.add(new gnu.testlet.java.math.BigInteger.signum());
		// tests.add(new gnu.testlet.java.math.BigInteger.TestOfPR27372());
		tests.add(new gnu.testlet.java.math.BigInteger.TestOfToByteArray());

	}

	private void doBigDecimal() {
		tests.add(new gnu.testlet.java.math.BigDecimal.abs());
		tests.add(new gnu.testlet.java.math.BigDecimal.add());
		tests.add(new gnu.testlet.java.math.BigDecimal.byteValue());
		tests.add(new gnu.testlet.java.math.BigDecimal.byteValueExact());
		tests.add(new gnu.testlet.java.math.BigDecimal.byteValue());
		
		tests.add(new gnu.testlet.java.math.BigDecimal.compareTo());	

		tests.add(new gnu.testlet.java.math.BigDecimal.compareToObject());
		tests.add(new gnu.testlet.java.math.BigDecimal.constructorBigInteger());
		tests.add(new gnu.testlet.java.math.BigDecimal.constructorCharacterSequence());
		tests.add(new gnu.testlet.java.math.BigDecimal.constructorDouble());
		
		tests.add(new gnu.testlet.java.math.BigDecimal.constructorInt());
		tests.add(new gnu.testlet.java.math.BigDecimal.constructorLong());
		tests.add(new gnu.testlet.java.math.BigDecimal.constructorString());
		tests.add(new gnu.testlet.java.math.BigDecimal.construct());	

		
		tests.add(new gnu.testlet.java.math.BigDecimal.divideMathContext());
		
		tests.add(new gnu.testlet.java.math.BigDecimal.divideRoundingMode());
		tests.add(new gnu.testlet.java.math.BigDecimal.divideRoundingModeScale());
		tests.add(new gnu.testlet.java.math.BigDecimal.divideToIntegralValue());
		tests.add(new gnu.testlet.java.math.BigDecimal.divide());		
		tests.add(new gnu.testlet.java.math.BigDecimal.DiagBigDecimal());
		

		tests.add(new gnu.testlet.java.math.BigDecimal.hashCode());
		tests.add(new gnu.testlet.java.math.BigDecimal.intValue());
		tests.add(new gnu.testlet.java.math.BigDecimal.intValueExact());
		tests.add(new gnu.testlet.java.math.BigDecimal.longValue());
		tests.add(new gnu.testlet.java.math.BigDecimal.longValueExact());
		
		tests.add(new gnu.testlet.java.math.BigDecimal.multiply());
		tests.add(new gnu.testlet.java.math.BigDecimal.negate());
		tests.add(new gnu.testlet.java.math.BigDecimal.plus());
		tests.add(new gnu.testlet.java.math.BigDecimal.pow());
		tests.add(new gnu.testlet.java.math.BigDecimal.precision());
		
		tests.add(new gnu.testlet.java.math.BigDecimal.shortValue());
		tests.add(new gnu.testlet.java.math.BigDecimal.shortValueExact());
		tests.add(new gnu.testlet.java.math.BigDecimal.subtract());
		tests.add(new gnu.testlet.java.math.BigDecimal.toEngineeringString());
		tests.add(new gnu.testlet.java.math.BigDecimal.toPlainString());
		tests.add(new gnu.testlet.java.math.BigDecimal.valueOfDouble());
		tests.add(new gnu.testlet.java.math.BigDecimal.valueOfLong());
		tests.add(new gnu.testlet.java.math.BigDecimal.valueOfLongInt());
		tests.add(new gnu.testlet.java.math.BigDecimal.setScale());
		
	}

	private void doSystem() {
		// tests.add(new arraycopy()); //inf recursion
		// tests.add(new getProperty());
		// tests.add(new identityHashCode());
		// tests.add(new security()); //unsupported by j2s
	}

	private void doStringBuffer() {
		tests.add(new plus());
		tests.add(new PR34840());
		tests.add(new StringBufferTest());
	}

	private void doString() {
		tests.add(new CASE_INSENSITIVE_ORDER());
		tests.add(new charAt());
		tests.add(new gnu.testlet.java.lang.String.compareTo());
		// tests.add(new ConsCharset());
		tests.add(new gnu.testlet.java.lang.String.decode());
		// tests.addFirst(new gnu.testlet.java.lang.String.equals()); //not working. gives a strange error...TODO: run this alone
		tests.add(new getBytes());
		tests.add(new getBytes13());
		tests.add(new getBytes14());
		tests.add(new gnu.testlet.java.lang.String.hash());
		tests.add(new indexOf());
		tests.add(new new_String());
		tests.add(new replaceAll());
		// tests.add(new split());
		tests.add(new startsWith());
		tests.add(new StringTest());
		tests.add(new substring());
		tests.add(new surrogate());
		tests.add(new gnu.testlet.java.lang.String.to());
	}

	private void doShort() {
		tests.add(new gnu.testlet.java.lang.Short.hash());
		tests.add(new gnu.testlet.java.lang.Short.ShortTest());
		tests.add(new gnu.testlet.java.lang.Short.toString());
	}

	private void doObject() {
		/* gives gwt compile error CloneNotSupportedException not supported and Cannot invoke clone() on the array type int[] and on  type Object[] */
		//tests.add(new gnu.testlet.java.lang.Object.clone());
		
		tests.add(new gnu.testlet.java.lang.Object.ObjectTest());
		tests.add(new gnu.testlet.java.lang.Object.constructor());
		
		// tests.add(new oom()); //out of memory error
		// tests.add(new wait());//wait

	}

	private void doNumber() {
		tests.add(new gnu.testlet.java.lang.Number.NumberTest());
	}

	private void doMath() {
		tests.add(new cos());
		tests.add(new MathTest());
		tests.add(new max());
		tests.add(new min());
		tests.add(new rint());
		tests.add(new sin());
		tests.add(new tan());
		// tests.add(new tanh()); //empty
		// tests.add(new acos()); //empty
		// tests.add(new asin()); //empty
		// tests.add(new atan()); //empty
		// tests.add(new ulp());
	}

	public void doLong() {
		// tests.add(new getLong());
		tests.add(new LongTest());
		tests.add(new new_Long());
		// tests.add(new LongBitStuff());
		tests.add(new gnu.testlet.java.lang.Long.Tests15());
	}

	private void doInteger() {
		tests.add(new compareTo());
		tests.add(new decode());
		// tests.add(new getInteger());
		tests.add(new IntegerTest());
		tests.add(new new_Integer());
		tests.add(new parseInt());
		tests.add(new Tests15());
		tests.add(new parseIntRadix());
		// tests.add(new IntegerBitStuff());
		// tests.add(new toStringIntegerTests());
	}

	private void doFloat() {
		tests.add(new gnu.testlet.java.lang.Float.compare());
		tests.add(new gnu.testlet.java.lang.Float.compareTo());
		tests.add(new FloatTest());
		tests.add(new new_Float());
		tests.add(new parseFloat());
		// tests.add(new gnu.testlet.java.lang.Float.toHexString());
		tests.add(new gnu.testlet.java.lang.Float.valueOf());
	}

	private void doEnum() {
		tests.add(new PR33183());
	}

	private void doDouble() {
		tests.add(new compare());
		tests.add(new gnu.testlet.java.lang.Double.compareTo());
		tests.add(new DoubleSetterTest());
		tests.add(new DoubleTest());
		tests.add(new new_Double());
		tests.add(new parseDouble());
		// tests.add(new toHexString());
		tests.add(new gnu.testlet.java.lang.Double.valueOf());
	}

	private void doCloneable() {
		tests.add(new CloneableTest());
	}

	private void doClass() {
		tests.add(new ClassTest());
		tests.add(new init());
		tests.add(new newInstance());
		// tests.add(new reflect());
		// tests.add(new reflect2());
		// tests.add(new security());
		// tests.add(new serialization()); //no, it uses swing

	}

	private void doCharacter() {
		// tests.add(new Blocks());
		// tests.add(new Blocks15());
		tests.add(new classify());
		tests.add(new classify12());
		// tests.add(new consts());
		tests.add(new digit());
		tests.add(new equals_Character());
		tests.add(new forDigit());
		// tests.add(new getNumericValue());
		// tests.add(new getType());
		// tests.add(new getType12());
		tests.add(new hash());
		tests.add(new to());
	}

	private void doByte() {
		tests.add(new gnu.testlet.java.lang.Byte.ByteTest());
		tests.add(new gnu.testlet.java.lang.Byte.new_Byte());
		tests.add(new gnu.testlet.java.lang.Byte.byteDivide());
		tests.add(new gnu.testlet.java.lang.Byte.parseByte());
		tests.add(new gnu.testlet.java.lang.Byte.parseByteRadix());
		tests.add(new gnu.testlet.java.lang.Byte.toString());
		tests.add(new gnu.testlet.java.lang.Byte.valueOfByte());
		tests.add(new gnu.testlet.java.lang.Byte.valueOfString());
		tests.add(new gnu.testlet.java.lang.Byte.valueOfStringRadix());		
	}

	private void doBoolean() {
		tests.add(new BooleanTest());
		tests.add(new equals_Boolean());
		// tests.add(new get());
		tests.add(new hashcode_Boolean());
		tests.add(new new_Boolean());
		tests.add(new value());
	}

	public LinkedList<Testlet> getTests() {
		return tests;
	}
}
