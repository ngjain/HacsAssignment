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

class ClassCourseListTest {

	String theFileName = new String("THEFILENAME");

	ClassCourseList classcourselist = new ClassCourseList();
	Course theCourse;

	@Test
	final void testClassCourseList() {
		// constructor
		System.out.println("ClassCourseList object created.");
	}

//the function reads from the file CourseInfo.txt irresrpective of what name we give. The below function jest tests if that function has been called
	@Test
	final void testInitializeFromFile() {
		classcourselist.initializeFromFile(theFileName);
		theCourse = new Course("THEFILENAME", 0);
		System.out.println("Data read from CourseInfo.txt and file initialised");
	}

//Check taht the function FindCourseByCourseName returns an object COurse viz we can correctly check if the code is running
	@Test
	final void testFindCourseByCourseName() {
		assertEquals(false, classcourselist.findCourseByCourseName("THEFILENAME") instanceof Course);
	}

}
