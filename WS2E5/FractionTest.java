package WS2E5;
/**
 * @author William Downs
 * @version 21/10/2015 
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

	private Fraction f1, f2, f3;

	@Before
	public void setUp() {
		f1 = new Fraction(2, 3);
		f2 = new Fraction(3, 5);
	    f3 = new Fraction(1, 3);
	}

	@Test
	public void test1() {

		assertEquals(2, f1.getNumerator());
		assertEquals(3, f1.getDenominator());
		assertEquals("2/3", f1.toString());
	}

	@Test
	public void test2() {

		assertEquals(3, f2.getNumerator());
		assertEquals(5, f2.getDenominator());
		assertEquals("3/5", f2.toString());
	
	}
	
	@Test
	public void test3() {

		assertEquals(1, f3.getNumerator());
		assertEquals(3, f3.getDenominator());
		assertEquals("1/3", f3.toString());
	}
	
	@Test
	public void test4() {

		// expected fraction when f1 and f2 are summed
		Fraction expected = new Fraction(19, 15);

		Fraction actual = f1.add(f2);

		assertEquals(expected.getNumerator(), actual.getNumerator());
		assertEquals(expected.getDenominator(), actual.getDenominator());
		assertEquals(expected.toString(), actual.toString());
	}


	@Test
	public void test5() {

		assertFalse(f1.greaterEqual(f2));
		assertTrue(f2.greaterEqual(f1));

		assertFalse(f1.multiply(f2).greaterEqual(f1.add(f2)));
	}

}
