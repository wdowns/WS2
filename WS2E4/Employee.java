package WS2E4;
/**
 * @author William Downs
 * @version 10/10/2015 
 */
   
/**
 * Write a class Employee. Each employee is represented by their name, their hourlySalary,
 * and their numberOfHours of types String, double and int, respectively. Write a class with
 * constructors, getters, setters, and a toString method. Note that the naming of 
 * constructors, getters, setters must follow the strict naming convention. Furthermore,
 * write two methods: First the monthly salary, public double monthlySalary(), which computes
 * for an Employee object, their monthly salary (as the product of hourly salary and their
 * number of hours). Second, public void increaseSalary(double percentage), which increases
 * the hourly salary by the percentage in the argument. 
 */
 public class Employee { // Constructor
	
	private String name;
	private double hourlySalary;
	private int numberOfHours;
	
	
	public Employee(String name, double hourlySalary, 
			int numberOfHours) {
		this.name = name;
		this.hourlySalary = hourlySalary;
		this.numberOfHours = numberOfHours;
		
	}

	public String getName() { //Getters & Setters
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
 
	public double monthlySalary(){ //Calculate monthly salary
   return (hourlySalary * numberOfHours);
    
	}	
	
	public void increaseSalary(double percentage){ //Calculate salary after pay rise
    hourlySalary =  hourlySalary + (percentage / 100) * hourlySalary;
	
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", hourlySalary=" + hourlySalary
				+ ", numberOfHours=" + numberOfHours + "]";
	}
	
 }
