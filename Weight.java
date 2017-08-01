/** 
 *  The Weight class converts weights given in pounds into ounces and kilograms.
 *  @version 2015-10-06
 *  @author Manfred Kerber
 */

public class Weight {
    private double pounds;

    public static final double kilogramsPerPound = 0.45359237;
    public static final double ouncesPerPound = 16.0;

    /**
     *  @param pounds The total weight given in pounds.
     */
    public Weight(double pounds) {
        this.pounds = pounds;
    }

    /**
     *  @return The weight in pounds.
     */
    public double getPounds() {
        return pounds;
    }

    /**
     *  @return The weight in kilograms.
     */
    public double getKilograms() {
        return this.getPounds() * kilogramsPerPound;
    }

    /**
     *  @return The weight in ounces.
     */
    public double getOunces() {
        return this.getPounds() * ouncesPerPound ;
    }

    /**
     *  @return A String displaying the weight in pounds, ounces, and kilograms.
     */
    public String printWeight() {
        return "A weight of " + getPounds() + " pounds corresponds to "
            + getOunces() + " ounces and " + getKilograms() + " kilograms.";
    } 


    /*
     * Main method for some initial tests.
     */
    public static void main(String[] args) {
        Weight w1 = new Weight(3.4);
        Weight w2 = new Weight(6.0);
        Weight w3 = new Weight(0.0);

        System.out.println(w1.printWeight());
        System.out.println(w2.printWeight());
        System.out.println(w3.printWeight());
    }
}

