package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

	Student student  = new Student();
	Course theCourse = new Course("strCourse",1);
	int theLevel = 1;
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
	// Checking that for a given course we get a coursemenu
	@Test
	final void testCreateCourseMenu() {
		CourseMenu testcreatecouremenu = student.createCourseMenu( theCourse,  theLevel);
		assertEquals(testcreatecouremenu instanceof CourseMenu, true);
	}

	@Test
	final void testShowMenu() {
		//inturn calls a swing class
	}

	@Test
	final void testStudent() {
		//constructor	
		System.out.println("Student object created.");

	}

}
