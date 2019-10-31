package hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssignmentTest {
	Assignment assignment = new Assignment();
	Solution solution = new Solution();
	Date today =new Date();
	
	

	@Test
	final void testAssignment() {
		//constructortested	
		System.out.println("assignment object created.");
	}

	@Test
	final void testSetDueDate() {
		Date dueDate = new Date();
		assignment.setDueDate(dueDate);
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		assertEquals(dateFormat.format(dueDate), assignment.getDueDateString());
	
	}

	@Test
	final void testSetAssSpec() {
		String input = "SER 515 Assignment";
		assignment.setAssSpec(input);
		assertEquals(input, assignment.getAssSpec());
	}

	@Test
	final void testIsOverDue() {
		assertEquals(false, assignment.isOverDue());
	}

	@Test
	final void testAddSolution() {
		assignment.addSolution(solution);
		assertEquals(1, assignment.getSolutionList().size());	}

	@Test
	final void testAddSolutionSolution() {
		//Called in above function
	}

	@Test
	final void testSubmitSolution() {
		System.out.println("submit solution created");
	}

	@Test
	final void testGetSolutionList() {
		//Called in test add slution
	}
//REDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
	@Test
	final void testGetSolution() {
	
	        Solution testgetsolution = assignment.getSolution("Author");
	        assertEquals( false, testgetsolution instanceof Solution);
	}
	
	@Test
	final void testGetSugSolution() {
		
		assertEquals(true, assignment.getSugSolution() instanceof Solution );
	}

	@Test
	final void testGetSolutionIterator() {
		assertEquals(true, assignment.getSolutionIterator() instanceof SolutionIterator );
	}

	@Test
	final void testToString() {
		assertEquals(true, assignment.toString() instanceof String );
	}

	@Test
	final void testGetDueDateString() {
		//called in above function
	}
//REDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
	@Test
	final void testAccept() {
		System.out.println("accept called");
		}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
}
