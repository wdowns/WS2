/** 
 *  We represent in the Employee class an employee by name, hourly
 *  salary and number of hours (worked in the previous month). In
 *  addition to constructor, getters and setters, and the toString
 *  method, we implement methods that compute the monthly salary and
 *  give a pay raise.
 *
 *  @version 2015-10-06
 *  @author Manfred Kerber
 */

public class Employee{

    private String name;
    private double hourlySalary;
    private int numberOfHours;

    /** 
     *  Constructor to set values to the field variables
     *  @param name The employee's name.
     *  @param hourlySalary The employee's hourly salary rate.
     *  @param numberOfHours The number of hours the employee worked the previous month.
     */
    public Employee(String name, double hourlySalary, int numberOfHours){
        this.name = name;
        this.hourlySalary = hourlySalary;
        this.numberOfHours = numberOfHours;
    }

    /**
     *  getter method to return the name.
     *  @return The name of the employee. 
     */
    public String getName(){
        return name;
    }

    /**
     *  getter method to return the hourly salary.
     *  @return The hourly salary of the employee. 
     */
    public double getHourlySalary(){
        return hourlySalary;
    }

    /**
     *  getter method to return the number of hours.
     *  @return The number of hours the employee worked the previous month.
      */
    public int getNumberOfHours(){
        return numberOfHours;
    }
    
    /**
     *  setter method to change the name of an employee.
     *  @param name The new name of the employee. 
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     *  setter method to change the hourly salary of an employee.
     *  @param hourlySalary The new hourly salary of the employee. 
     */
    public void setHourlySalary(double hourlySalary){
        this.hourlySalary = hourlySalary;
    }

    /**
     *  setter method to change the number of hours an employee worked.
     *  @param numberOfHours The new number of hours of the employee. 
     */
    public void setNumberOfHours(int numberOfHours){
        this.numberOfHours = numberOfHours;
    }

    /**
     *  The method returns a String for displaying objects in a
     *  user-friendly way.
     *  @return A String representation of the object.
     */
    public String toString(){
        return getName() + " has an hourly salary of " + "\u00A3"+ getHourlySalary() +
            " and has worked last month for " + getNumberOfHours() + " hours.";
    }

    /**
     *  Method to return the monthly salary.
     *  @return The monthly salary of the employee. 
     */
    public double monthlySalary(){
        return getNumberOfHours() * getHourlySalary();
    }

    /**
     *  Method to increase the hourly salary.
     *  @param percentage The increase of the hourly salary in percent.
     */
    public void increaseSalary(double percentage){
        setHourlySalary(getHourlySalary() * (1 + percentage/100));
    }

    /*
     * Main method for some tests.
     */
    public static void main(String[] args) {

        Employee john = new Employee("John", 9.50, 40);       
        Employee mary = new Employee("Mary", 9.80, 38);

        System.out.println(john);
        System.out.println(mary);

        john.increaseSalary(2.0);
        System.out.println(john);
        System.out.println(mary);
            
    }
}
