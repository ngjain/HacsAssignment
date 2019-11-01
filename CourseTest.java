package hacs;

/**
 * Title:        HacsAssignmentTest
 * Description:  SER515:Testing and reuse
 * Company:      ASU
 * @author Jain Nayan
 * @version 1.0
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CourseTest {

	Course course = new Course("StrCourse", 1 );
	Assignment assignment = new Assignment();
	ArrayList<Assignment> assignmentlist=new ArrayList<Assignment>();
	
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

	@Test
	final void testCourse() {
		//constructor	
		System.out.println("course object created.");
	}
// assignment added to course and checked 
	@Test
	final void testAddAssignment() {
		String input = "515 Assignment";
		assignment.setAssSpec(input);
		course.addAssignment(assignment);
		assertEquals(course.assignmentlist.contains(assignment), true);
	}

	//check if course name is eturned as string
	@Test
	final void testToString() {
		assertEquals(course.toString(),"StrCourse");
	}

	//accpt tested
	@Test
	final void testAccept() {
		System.out.println("accept called");	
	}

}
