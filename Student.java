/**
 *   The class Student can be used by to adminstrate data of
 *   students. A student object consists of four components, a name, a
 *   gender, a student ID, and the degree programme. Correspondingly,
 *   we have four field variables.
 *   @version 2015-10-06
 *   @author  Manfred Kerber
 */
public class Student{
    private String name;
    private String gender; //either "male" or "female"
    private String studentID; //either "male" or "female"
    private String degreeProgramme;

    /**
     *  The constructor Student assigns the four field variables
     *  to the values of its four parameters.
     *  @param name The name of the student.
     *  @param gender The gender of the student.
     *  @param studentID The student ID of the student.
     *  @param degreeProgramme The degree programme of the student.
     */
    public Student(String name, String gender,
                   String studentID, String degreeProgramme) {
        this.name = name;
        this.gender = gender;
        this.studentID = studentID;
        this.degreeProgramme = degreeProgramme;
    }

    /**
     *  The getter getName returns the value of the name;
     *  @return The name of the object.
     */
    public String getName() {
        return name;
    }

    /**
     *  The getter getGender returns the value of the gender;
     *  @return The gender of the object.
     */
    public String getGender() {
        return gender;
    }

    /**
     *  The getter getStudentID returns the student ID of the object;
     *  @return The student ID of the object.
     */
    public String getStudentID() {
        return studentID;
    }
    
    /**
     *  The getter getDegreeProgramme returns the degree programme of
     *  the object;
     *  @return The degree programme of the object.
     */
    public String getDegreeProgramme() {
        return degreeProgramme;
    }
    
    /**
     *  The setter setName sets the name to a new value.
     *  @param name The new name of the object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *  The setter setGender sets the gender to a new value.
     *  @param gender The new gender of the object.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *  The setter setStudentID sets the student ID to a new value.
     *  @param studentID The new studentID of the object.
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     *  The setter setDegreeProgramme sets the degree programme to a new value.
     *  @param degreeProgramme The new degree programme of the object.
     */
    public void setDegreeProgramme(String degreeProgramme) {
        this.degreeProgramme = degreeProgramme;
    }

    /**
     *  The method returns a String for displaying objects in a
     *  user-friendly way.
     *  @return A String representation of the object.
     */
    public String toString() {
        return "[" + getName() + ", " + getGender() +
               ", ID: " + getStudentID() + ", " + getDegreeProgramme() + "]";
    }

    /**
     *  The method returns a boolean for checking the equality to a
     *  second object.
     *  @param student A second student with which the check of
     *  equality if done.
     *  @return true if the objects agree in all four components, false else.
     */
    public boolean equals(Student student) {
        return (this.getName().equals(student.getName()) &&
                this.getGender().equals(student.getGender()) &&
                this.getStudentID().equals(student.getStudentID()) &&
                this.getDegreeProgramme().equals(student.getDegreeProgramme()));
    }

    /*
     * Main method for some tests.
     */
    public static void main(String[] args) {
        Student john = new Student("John Smith", "male", "1111111", "ICY");
        Student mary = new Student("Mary Jones", "female", "1111112", "MSc CS");

        System.out.println(mary);
        System.out.println(john);
        System.out.println(john.equals(mary));
        john.setGender("female");
        System.out.println(john);
    }
}
