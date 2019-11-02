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

class StudentTest {

	Student student = new Student();
	Course theCourse = new Course("strCourse", 1);
	int theLevel = 1;

	// Checking that for a given course we get a coursemenu
	@Test
	final void testCreateCourseMenu() {
		CourseMenu testcreatecouremenu = student.createCourseMenu(theCourse, theLevel);
		assertEquals(testcreatecouremenu instanceof CourseMenu, true);
	}

	@Test
	final void testShowMenu() {
		// inturn calls a swing class
	}

	@Test
	final void testStudent() {
		// constructor
		System.out.println("Student object created.");

	}

}
