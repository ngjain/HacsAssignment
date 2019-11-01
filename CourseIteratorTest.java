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

class CourseIteratorTest {

	ClassCourseList classCourseList = new ClassCourseList();

	//Constructor
	@Test
	void testCourseIterator() {
		System.out.println("Initialized CourseIterator");
	}

	//Check reation of list
	@Test
	void testCourseIteratorList() {
		Course course = new Course("Test Course", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertEquals(1, courseIterator.getTheCourseList().size());
	}

	//Check if course has next valu
	@Test
	void testHasNext() {
		Course course = new Course("Test Course", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertTrue(courseIterator.hasNext());
	}

	// get the next value
	@Test
	void testNext() {
		Course course = new Course("Test Course", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertNotNull(courseIterator.next());
	}

	// remove a value
	@Test
	void testRemove() {
		Course course = new Course("Test Course", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		courseIterator.next();
		courseIterator.remove();
		assertEquals(0, courseIterator.getTheCourseList().size());
	}

	//test the next string is returned
	@Test
	void testNextString() {
		Course course = new Course("Test Course", 1);
		classCourseList.add(course);
		CourseIterator courseIterator = new CourseIterator(classCourseList);
		assertNotNull(courseIterator.next("Test Course"));
	}

}
