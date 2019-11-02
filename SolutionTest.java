package hacs;

/**
 * Title:        HacsAssignmentTest
 * Description:  SER515:Testing and reuse
 * Company:      ASU
 * @author Jain Nayan
 * @version 1.0
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	Solution solution = new Solution();

	@Test
	final void testSolution() {
		// constructor
		System.out.println("Solution object created.");
	}

	// convet and return string
	@Test
	final void testToString() {
		assertEquals(solution.toString().contains("100"), true);
	}

	// check if correct grade is returned as string
	@Test
	final void testGetGradeString() {
		solution.setReported(false);
		assertEquals(solution.getGradeString(), "-1");
	}

	// check if correct grade is returned
	@Test
	final void testGetGradeInt() {
		assertEquals(solution.getGradeInt(), 100);
	}

	// Setter for reort
	@Test
	final void testSetReported() {
		solution.setReported(true);
		assertEquals(solution.reported, true);
	}

	// check if reported
	@Test
	final void testIsReported() {
		// ABOVE
	}

}
