package WS2E3;

/**
 * @author William Downs
 * @version 10/10/2015
 */

/**
 * In exercise 2 of Worksheet 1, you wrote a program that converts masses given
 * in the imperial system into the metric system. Write a java program that can
 * deal with weights given in pounds. Make use of the conversions : 1 pound =
 * 0.45359237 1 ounce = 1/16 pounds Define a weight class, and write a
 * constructor Weight(double p) to generate a weight in pounds. Furthermore,
 * implement methods public double getPounds(), public double getKilograms(),
 * public double getOunces(), which return the weight in pounds, kilograms, and
 * ounces, respectively. Each of these three methods does not take an argument,
 * and each returns a double. E.g., in order to get the weight of an object w in
 * kilograms, you make a call w.getKilograms.
 * 
 */
  public class Weight {
	private double pounds;
	private double kilograms;
	
	public Weight(double p) {// Constructor

		this.pounds = p;
        
	}
	public double getPounds() {
		return (kilograms / 0.45359237);
	}

	public double getKilograms() {
		return (pounds * 0.45359237);
	}

	public double getOunces() {
		return (pounds * 16);
	}
	public void setPounds(double pounds) {
		this.pounds = pounds;
	}

	public void setKilograms(double kilograms) {
		this.kilograms = kilograms;
	}

	public void setOunces(double ounces) {
	}
  
  }	
  
	