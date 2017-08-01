package WS2E4;
/**
 * @author William Downs
 * @version 21/10/2015 
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	private Employee emp1;
    private double precision =0.0000001;
	
	@Before
	public void setUp() {
		emp1 = new Employee("Johnny", 20.5, 26);
               
	}
	
	@Test
	public void test1() {
	
		emp1.setName("Simon");
		emp1.setHourlySalary(31.4);
		emp1.setNumberOfHours(27);
		
		assertEquals("Simon",emp1.getName());
		assertEquals(31.4,emp1.getHourlySalary(),precision);
		assertEquals(27,emp1.getNumberOfHours());
	}
	@Test
	public void test2() {
	
		emp1.setName("Glen");
		emp1.setHourlySalary(30.9);
		emp1.setNumberOfHours(33);
		
		assertEquals("Glen",emp1.getName());
		assertEquals(30.9,emp1.getHourlySalary(),precision);
		assertEquals(33,emp1.getNumberOfHours());
	}
	
	@Test
	public void test3() {
	
		emp1.setHourlySalary(44.1);
		emp1.setNumberOfHours(31);
		
		assertEquals(1367.1, emp1.monthlySalary(),precision);
	}

	@Test
	public void test4() {
	
		emp1.setHourlySalary(32.5);
		emp1.setNumberOfHours(50);
		
		assertEquals(1625, emp1.monthlySalary(),precision);
	
		emp1.increaseSalary(5.3);
	
		assertEquals(1711.125, emp1.monthlySalary(),precision);
	
	}
	@Test
	public void test5() {
	
		emp1.setHourlySalary(30.5);
		emp1.setNumberOfHours(52);
		
		emp1.increaseSalary(5.4);
		emp1.increaseSalary(10.7);
		assertEquals(1850.509908, emp1.monthlySalary(), 10*precision);
	}
}


