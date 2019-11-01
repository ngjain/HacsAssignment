package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

	Solution solution = new Solution();
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
	final void testSolution() {
		//constructor	
		System.out.println("Solution object created.");
	}

	@Test
	final void testToString() {
		assertEquals(solution.toString().contains("100"),true);
	}

	@Test
	final void testGetGradeString() {
		solution.setReported(false);
		assertEquals(solution.getGradeString(), "-1");
	}

	@Test
	final void testGetGradeInt() {
		assertEquals(solution.getGradeInt(), 100);
	}

	@Test
	final void testSetReported() {
		solution.setReported(true);
		assertEquals(solution.reported, true);
	}

	@Test
	final void testIsReported() {
		//ABOVE
	}

}
