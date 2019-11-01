package hacs;

/**
 * Title:        HacsAssignmentTest
 * Description:  SER515:Testing and reuse
 * Company:      ASU
 * @author Jain Nayan
 * @version 1.0
 */


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
		//constructor tested	
		System.out.println("assignment object created.");
	}

	//setiing due date
	@Test
	final void testSetDueDate() {
		Date dueDate = new Date();
		assignment.setDueDate(dueDate);
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		assertEquals(dateFormat.format(dueDate), assignment.getDueDateString());
	
	}

	//checking assign specification
	@Test
	final void testSetAssSpec() {
		String input = "515 Assignment";
		assignment.setAssSpec(input);
		assertEquals(input, assignment.getAssSpec());
	}

	//check if assign is overdue
	@Test
	final void testIsOverDue() {
		assertEquals(true, assignment.isOverDue());
	}

	//add solution to list
	@Test
	final void testAddSolution() {
		assignment.addSolution(solution);
		assertEquals(1, assignment.getSolutionList().size());	}

	//add solution to a existing list
	@Test
	final void testAddSolutionSolution() {
		//Called in above function
	}

	//submit solution
	@Test
	final void testSubmitSolution() {
		System.out.println("submit solution created");
	}

	
	@Test
	final void testGetSolutionList() {
		//Called in test add slution
	}
//REDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
	@Test
	final void testGetSolution() {
	
	        Solution testgetsolution = new Solution();
	        assertEquals( testgetsolution, assignment.getSolution("") );
	}
	
	//check if we get a suggestion for a solution. main function is nt implemented so we check if the returned object is 
	//asolution
	@Test
	final void testGetSugSolution() {
		assertEquals(true, assignment.getSugSolution() instanceof Solution );
	}

	//terator should return a list of solutions
	@Test
	final void testGetSolutionIterator() {
		assertEquals(true, assignment.getSolutionIterator() instanceof SolutionIterator );
	}
        //Test toString and set Assginment Name
	@Test
	final void testToString() {
		assignment.setAssignmentName("assignmenttest");
		assertEquals("assignmenttest", assignment.toString());
	}

	//Find out the due date
	@Test
	final void testGetDueDateString() {
		//called in above function
	}
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
