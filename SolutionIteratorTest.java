package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionIteratorTest {

	Solution solution = new Solution();
	SolutionList solutionList = new SolutionList();

	//constructor
	@Test
	void testSolutionIterator() {
		System.out.println("Initialized Solution Iterator");
	}

	//cehck for solution siterator existence aftrcreatin
	@Test
	void testSolutionIteratorSolutionList() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertTrue(solutionIterator.hasNext());
	}

	//checck if value is moved to 1st
	@Test
	void testMoveToHead() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		solutionIterator.MoveToHead();
		assertEquals(-1, solutionIterator.getCurrentSolutionNumber());
	}

	// check if nex value exists
	@Test
	void testHasNext() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertTrue(solutionIterator.hasNext());
	}

	//check if we move and return next value
	@Test
	void testNext() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertNotNull(solutionIterator.next());
	}

	//Similar to above
	@Test
	void testNextString() {
		solution.setTheAuthor("Test Author");
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		assertNotNull(solutionIterator.next("Test Author"));
	}

	//remove a  given value tested
	@Test
	void testRemove() {
		solutionList.add(solution);
		SolutionIterator solutionIterator = new SolutionIterator(solutionList);
		int size = solutionIterator.solutionlist.size();
		int expectedSize = size - 1;
		solutionIterator.next();
		solutionIterator.remove();
		assertEquals(expectedSize, solutionIterator.solutionlist.size());
	}

}
