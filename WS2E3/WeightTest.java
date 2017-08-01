package WS2E3;
/**
 * @author William Downs
 * @version 21/10/2015
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeightTest {

	private Weight w1, w2, w3;
    private double precision = 0.0000001;

@Before
public void setUp() {
	w1 = new Weight(4.9);
	w2 = new Weight(3.54);
	w3 = new Weight(1.5);
}

@Test
public void test1() {
	// expected weight in kilograms (for w1)
	double expected = 2.222602613;
	
	assertEquals(expected, w1.getKilograms(), precision);
}

@Test
public void test2() {
	// expected weight in kilograms (for w2)
	double expected = 1.6057169898;

	assertEquals(expected, w2.getKilograms(), precision);
}

	@Test
public void test3() {
	// expected weight in kilograms (for w3)
            double expected = 0.680388555;

	assertEquals(expected, w3.getKilograms(), precision);
}

@Test
public void test4() {

	// expected weight in ounces (for w1)
	double expected = 78.4;
	
	assertEquals(expected, w1.getOunces(), precision);
}

@Test
public void test5() {

	// expected weight in ounces (for w2)
	double expected = 56.64;
	assertEquals(expected, w2.getOunces(), precision);
}

}



