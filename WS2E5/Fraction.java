package WS2E5;


/**
 * @author William Downs
 * @version 10/10/2015 
 */

/**
 * In Exercise 4 of Worksheet 1 we looked at addition and multiplication of two
 * fractions. In the current exercise fractions should be represented by a java
 * class Fraction. You have to define the class, which in addition to the
 * constructor and the getters getNumerator and getDenominator has methods
 * toString (used to print a rational number) as well as public Fraction
 * add(Fraction summand), public Fraction multiply(Fraction factor), and public
 * boolean greaterEqual(Fraction comp) which add to a fration another fraction,
 * multiplies a fraction with another fraction, and checks whether the fraction
 * is greater than or equal to a second fraction, respectively. The first two
 * return corresponding objects of Class Fraction, the latter a boolean. For
 * instance, if we generate Fractions f1 = new Fraction(1,2); and Fraction f2 =
 * new Fraction(3,7); then f1.toString() should return the string "1/2;
 * f2.multiply(f1).toString() should return the String "3/14"(which corresponds
 * to the product of f2 and f1); and f2.add(f1).toString(); should return the
 * String "13/14" (which corresponds to the sum of f2 and f1).
 * f2.greaterEqual(f1); should return the boolean false (since f2 is not greater
 * than or equal to f1).
 * 
 * 
 */
public class Fraction { // Constructor
	private int numerator; // Field variables
	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;

	}

	public int getNumerator() {// Getter
		return numerator;
	}

	public void setNumerator(int numerator) {// Setter
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	@Override
	public String toString() {
		return "" + numerator + "/" + denominator;
	}

	public Fraction add(Fraction summand) { // Add sum of two fractions together

		int d = denominator * summand.denominator;
		int n1 = numerator * summand.denominator;
		int n2 = summand.numerator * denominator;

		return new Fraction(n1 + n2, d);

	}

	public Fraction multiply(Fraction factor) { // Multiply two fractions
		return factor = new Fraction(numerator * factor.numerator, denominator
				* factor.denominator);

	}

	public boolean greaterEqual(Fraction comp) {
		if (comp.numerator + comp.denominator >= numerator + denominator) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 7);

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f2.multiply(f1));
		System.out.println(f2.add(f1));
		System.out.println(f2.greaterEqual(f1));
	}
}
