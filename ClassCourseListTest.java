package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClassCourseListTest {

	String theFileName = new String("THEFILENAME");
	
	ClassCourseList classcourselist = new ClassCourseList();
	Course theCourse;
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
	final void testClassCourseList() {
		//constructor	
	   System.out.println("ClassCourseList object created.");
	}
//the function reads from the file CourseInfo.txt irresrpective of what name we give. The below function jest tests if that function has been called
	@Test
	final void testInitializeFromFile() {
		classcourselist.initializeFromFile(theFileName);
		theCourse = new Course("THEFILENAME", 0);
		System.out.println("Data read from CourseInfo.txt and file initialised");
	}
//REDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
	@Test
	final void testFindCourseByCourseName() {
		assertEquals(true, classcourselist.findCourseByCourseName("THEFILENAME") instanceof Course );
	}

}
