/** 
 * The class contains a constructor to make Fractions (rational
 * numbers) by taking two numbers of type int, the first being the
 * numerator, the second the denominator
 *
 * @version 2015-10-06
 * @author Manfred Kerber
 */
public class Fraction{

    private int numerator;
    private int denominator;

    /** 
     *  @param numerator The numerator of the fraction.
     *  @param denominator The denominator of the fraction.
     */
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     *  getter method to return the numerator of a fraction.
     *  @return The numerator of the fraction. 
     */
    public int getNumerator(){
        return numerator;
    }

    /**
     *  getter method to return the denominator of a fraction.
     *  @return The denominator of the fraction. 
     */
    public int getDenominator(){
        return denominator;
    }

    /**
     *  The method returns a String for displaying objects in a
     *  user-friendly way.
     *  @return A fraction represented as the numerator followed by
     *  / followed by the denominator.
     */
    public String toString(){
        return getNumerator() + "/" + getDenominator();
    }

    /**
     *  Method to return the sum of the object with a summand.
     *  @param summand A summand to be added to the object.
     *  @return The sum of the object and the summand.
     */
    public Fraction add(Fraction summand){
        return new Fraction(this.getNumerator() * summand.getDenominator() +
                            this.getDenominator() * summand.getNumerator(),
                            this.getDenominator() * summand.getDenominator());
    }

    /**
     *  Method to return the product of the object and a factor.
     *  @param factor A factor to be multiplied with the object.
     *  @return The product of the object and the factor.
     */
    public Fraction multiply(Fraction factor){
        return new Fraction(this.getNumerator() * factor.getNumerator(),
                            this.getDenominator() * factor.getDenominator());
    }

    /**
     *  Method to compare the object and another object comp.
     *  @param comp A second Fraction with which the object is compared.
     *  @return true if the object is greater than or equal to the
     *  comp object, false else.
     */
    public boolean greaterEqual(Fraction comp){
        return (this.getNumerator() * comp.getDenominator() >=
                this.getDenominator() * comp.getNumerator());
    }

    /*
     * main method
     */
    public static void main(String[] args){
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(3,7);
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f2.multiply(f1));
        System.out.println(f2.add(f1));
        System.out.println(f2.greaterEqual(f1));
    }
}
