package WS2E1;
/**
 * @author William Downs
 * @version 21/10/2015
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClubMemberTest {

private ClubMember c1,c2,c3,c4,c5;
	
	@Before
	public void setUp() {
	 c1 = new ClubMember("Richey","Edwards",2005);	
	}
	
	@Test
	public void test1() {
	
		c1.setFirstName("Nicky");
	
		assertEquals("Nicky",c1.getFirstName());
		assertEquals("Edwards",c1.getSurname());
		assertEquals(2005,c1.getYearOfJoining());
	}

	@Test
	public void test2() {
		
		c1.setSurname("Wire");
		
		assertEquals("Richey",c1.getFirstName());
		assertEquals("Wire",c1.getSurname());
		assertEquals(2005,c1.getYearOfJoining());
	}

	@Test
	public void test3() {
		
		c1.setYearOfJoining(2010);
		
		assertEquals("Richey",c1.getFirstName());
		assertEquals("Edwards",c1.getSurname());
		assertEquals(2010,c1.getYearOfJoining());
	}
	
	@Test
	public void test4() {
		c1.setFirstName("Nicky");
		c1.setSurname("Wire");
		c1.setYearOfJoining(1999);
		
		assertEquals("Nicky",c1.getFirstName());
		assertEquals("Wire",c1.getSurname());
		assertEquals(1999,c1.getYearOfJoining());
	}

	@Test
	public void test5() {
		c2 = new ClubMember("James-Dean", "Bradfield", 2010);
		c3 = new ClubMember ("Richey","Edwards",2005);
		c4 = new ClubMember("Richey","Edwards",1996);
		c5 = new ClubMember("Richey","Edward",1995);
		
		assertFalse(c1.equals(c2));
		assertTrue(c1.equals(c3));
		assertFalse(c1.equals(c4));
		assertFalse(c1.equals(c5));
	}
	
}
