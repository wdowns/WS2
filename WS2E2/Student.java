package WS2E2;

/**
 * @author William Downs
 * @version 10/10/2015
 */

/**
 * Define a class Student. A student should be should be represented by the
 * field variable name, gender, studentID, degreeProgramme, each of type String.
 * Write a constructor Student and getters public String getName(), public
 * String getGender, public String getStudentID, and public String
 * degreeProgramme. Also write a method public String toString that produces the
 * following format: "[Jimmy Johnstone, male, ID: 1967, ICY]".
 * 
 */

public class Student { // Constructor
	private String name;
	private String gender;
	private String studentID;
	private String degreeProgramme;

	public Student(String name, String gender, String studentID,
			String degreeProgramme) {
		this.name = name;
		this.gender = gender;
		this.studentID = studentID;
		this.degreeProgramme = degreeProgramme;

	}

	public String getName() { // Getters & setters
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getDegreeProgramme() {
		return degreeProgramme;
	}

	public void setDegreeProgramme(String degreeProgramme) {
		this.degreeProgramme = degreeProgramme;
	}

	public boolean equals(Student Student) {
		return (this.getName() == Student.getName())
				&& (this.getGender() == Student.getGender())
				&& (this.getStudentID() == Student.getStudentID())
				&& (this.getDegreeProgramme() == Student.getDegreeProgramme());
	}

	@Override
	public String toString() {
		return "[" + name + ", " + gender + "," + " ID:" + " " + studentID
				+ ", " + degreeProgramme + "]";
	}

}
