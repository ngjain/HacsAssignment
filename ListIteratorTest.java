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

import org.junit.jupiter.api.Test;

class ListIteratorTest {
//Constructor
	@Test
	void testListIterator() {
		ArrayList<Object> testList = new ArrayList<>();
		testList.add(1);
		ListIterator listIterator = new ListIterator(testList);
		assertEquals(1, listIterator.thelist.size());
	}

//Check if list has next value
	@Test
	void testHasNext() {
		ArrayList<Object> testList = new ArrayList<>();
		testList.add(5);
		ListIterator listIterator = new ListIterator(testList);
		assertFalse(listIterator.hasNext());
	}

//return the next value in the list
	@Test
	void testNext() {
		ArrayList<Object> testList = new ArrayList<>();
		testList.add(10);
		ListIterator listIterator = new ListIterator(testList);
		assertNull(listIterator.next());
	}

//Remove the value at given location
	@Test
	void testRemove() {
		ArrayList<Object> testList = new ArrayList<>();
		testList.add(2);
		ListIterator listIterator = new ListIterator(testList);
		listIterator.next();
		listIterator.remove();
		assertEquals(0, listIterator.thelist.size());
	}

}