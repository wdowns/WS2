/**
 *   The class ClubMember can be used by a club to administrate data of
 *   club members. A club member consists of three components, a
 *   firstName, a surname, and the yearOfJoining. Correspondingly, we
 *   have three field variables.
 *   @version 2015-10-06
 *   @author  Manfred Kerber
 */
public class ClubMember{

    private String firstName;
    private String surname;
    private int yearOfJoining;

    /**
     *  The constructor ClubMember assigns the three field variables
     *  to the values of its three parameters.
     *  @param firstName The first name of the object.
     *  @param surname The surname of the object.
     *  @param yearOfJoining The year of joining of the object.
     */
    public ClubMember(String firstName, String surname, int yearOfJoining){
        this.firstName = firstName;
        this.surname   = surname;
        this.yearOfJoining = yearOfJoining;
    }

    /**
     *  The getter getFirstName returns the value of the firstName;
     *  @return The first name of the object.
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     *  The getter getSurname returns the value of the surname;
     *  @return The surname of the object.
     */
    public String getSurname(){
        return surname;
    }

    /**
     *  The getter getYearOfJoining returns the value of yearOfJoining;
     *  @return The year of joining for the object.
     */
    public int getYearOfJoining(){
        return yearOfJoining;
    }

    /**
     *  The setter setFirstName changes the value of the firstName;
     *  @param firstName The new first name of the object.
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /**
     *  The setter setSurname returns changes the value of the surname;
     *  @param surname The new surname of the object.
     */
    public void setSurname(String surname){
        this.surname = surname;
    }

    /**
     *  The setter setYearOfJoining changes the value of yearOfJoining;
     *  @param yearOfJoining The new year of joining for the object.
     */
    public void setYearOfJoining(int yearOfJoining){
        this.yearOfJoining = yearOfJoining;
    }


    /**
     *  The method returns a String for displaying objects in a
     *  user-friendly way.
     *  @return A String representation of the object.
     */
    public String toString(){
        return this.getFirstName() + " " + this.getSurname() + " joined in " +
            this.getYearOfJoining() + ".";
    }

    /**
     *  The method returns a boolean for checking the equality to a
     *  second object.
     *  @param member A second member with which the check of equality if done.
     *  @return true if the objects agree in all three components, false else.
     */
    public boolean equals(ClubMember member){
        return this.getFirstName().equals(member.getFirstName()) &&
            this.getSurname().equals(member.getSurname()) &&
            (this.getYearOfJoining() == member.getYearOfJoining());
    }

    /*
     * Main method for some tests.
     */
    public static void main(String[] args) {
        ClubMember john = new ClubMember("John", "Smith", 2004);
        ClubMember mary = new ClubMember("Mary", "Smith", 2003);

        System.out.println(john);
        System.out.println(mary);
        System.out.println(john.equals(mary));

        john.setSurname("Miller");
        System.out.println(john);

        mary.setYearOfJoining(2004);
        System.out.println(mary);
        
    }
}

