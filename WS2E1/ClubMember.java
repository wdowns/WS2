package WS2E1;
/**
 * @author William Downs
 * @version 10/10/2015 
 */

    /**
	 * Define a class ClubMember and a constructor to create it. A club member
	 * should be constructed from the three field variables firstName, surname,
	 * and yearOfJoining of types String, String and String. Implement methods
	 * public String getFirstName(), public String getSurname(), public String
	 * getYearOfJoining(), and public void setSurname(String newSurname), sets
	 * the surname to the newSurname. Furthermore, write a public String
	 * toString() method that is used for printing objects of class ClubMember
	 * in a user friendly way.
	 */
    public class ClubMember { //Constructor
		private String firstName; //Field variables
		private String surname;
		private int yearOfJoining;
		
		public ClubMember (String firstName, String surname, int yearOfJoining){
		
		this.firstName = firstName;
		this.surname = surname;
		this.yearOfJoining = yearOfJoining;
			
		}
		/**
		 * Now we write methods for the club members details. These are called
		 * accessor methods.
		 */
		
		/**
		 * @return The first name of the club member.
		 */
		public String getFirstName() { //Getter method
			return firstName;
		}

		/**
		 * @return The surname of the club member.
		 */
		public String getSurname() { //Getter method
			return surname;
		}

		/**
		 * @return The club members year of joining.
		 */
		public int getYearOfJoining() { //Getter method
			return yearOfJoining;
		}

		public void setFirstName(String firstName) { //Setter method
			this.firstName = firstName;
		
		}

		public void setSurname(String surname) { //Setter method
			this.surname = surname;
		}

		public void setYearOfJoining(int yearOfJoining) { //Setter method
			this.yearOfJoining = yearOfJoining;
		}
		public boolean equals(ClubMember ClubMember) {
			return (this.getFirstName()==ClubMember.getFirstName()) &&
				   (this.getSurname()==ClubMember.getSurname()) &&
				   (this.getYearOfJoining()==ClubMember.getYearOfJoining());
		}
		@Override
		public String toString() {
			return "ClubMember [firstName=" + firstName + ", surname="
					+ surname + ", yearOfJoining=" + yearOfJoining + "]";
		}
		
		
 }		
