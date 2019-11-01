package hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListIteratorTest {

	List<String> thelist = Arrays.asList("foo", "bar", "baz");
	
	ListIterator listiterator = new ListIterator(thelist);

	
	
	
	
	
	
	int currentnumber = -1;

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
	final void testListIterator() {
		// constructor
		System.out.println("listiterator object created.");
	}


	@Test
	final void testHasNext() {
		//tested below with next()
	}

	@Test
	final void testNext() {
		assertEquals(listiterator.next(), "bar");
	}
	@Test
	final void testRemove() {

		listiterator.remove();
		assertEquals(listiterator.next(), "bar");
	}

}
