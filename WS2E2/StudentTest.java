package WS2E2;
/**
 * @author William Downs
 * @version 21/10/2015
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

private Student s1,s2,s3;
	
	@Before
	public void setUp() {
		
	s1 = new Student("Henrik", "male", "1888", "MSc Computer Science");
	}
	
	
	@Test
	public void test1() {
		
		s1.setName("Chris Sutton");
		s1.setStudentID("2003");
		
		assertEquals("Chris Sutton",s1.getName());
		assertEquals("2003",s1.getStudentID());
		assertEquals("MSc Computer Science",s1.getDegreeProgramme());
	}


	@Test
	public void test2() {
		
		s1.setName("Chris Sutton");
		s1.setStudentID("2001");
		
		assertEquals("Chris Sutton",s1.getName());
		assertEquals("2001",s1.getStudentID());
		assertEquals("MSc Computer Science",s1.getDegreeProgramme());
	}


	@Test
	public void test3() {
		
		s1.setName("John Hartson");
		s1.setGender("male");
		s1.setStudentID("2004");;
		s1.setDegreeProgramme("Sports Science");
		
		String expected = "[John Hartson, male, ID: 2004, Sports Science]";
		
		assertEquals(expected,s1.toString());	
	}
	
	
	@Test
	public void test4() {
		
		s1.setName("John Hartson");
		s1.setGender("male");
		s1.setStudentID("2004");;
		s1.setDegreeProgramme("Sports Science");
		
		s2 = new Student("John hartson", "male", "2004", "Sports Science");
		s3 = new Student("John Hartson", "male", "2004", "Sports Science");
		
		assertFalse(s1.equals(s2));
		assertTrue(s1.equals(s3));
	}
	@Test
	public void test5() {
		
		s1.setName("John Hartson");
		s1.setGender("male");
		s1.setStudentID("2004");;
		s1.setDegreeProgramme("Sports Science");
		
		s2 = new Student("John Hartson", "male", "2000", "Sports Science");
		s3 = new Student("John Hartson", "male", "2004", "Sports Science");
		
		assertFalse(s1.equals(s2));
		assertTrue(s1.equals(s3));
	}
}



