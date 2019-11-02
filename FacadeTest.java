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

class FacadeTest {
//getusername, getcourse name tested in attach course to user
	Facade facade = new Facade();

	Assignment newass = new Assignment();
	ClassCourseList thecourselist;
	Course theCourse = new Course("FINDLER", 1);

	@Test
	final void testFacade() {
		// constructor
		System.out.println("facade object created.");
	}

	@Test
	final void testLogin() {
		// Login is called that uses swing
	}

	// test if assugnment can be added
	@Test
	final void testAddAssignment() {
		theCourse.addAssignment(newass);
		assertEquals(theCourse.assignmentlist.size(), 1);
	}

	@Test
	final void testViewAssignment() {
		// SWINGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG
	}

	@Test
	final void testGradeSolution() {
		// SWINGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG
	}

	// check if fncion can be reportd
	@Test
	final void testReportSolutions() {
		facade.reportSolutions(newass);
		theCourse.addAssignment(newass);
		assertEquals(theCourse.assignmentlist.size(), 1);
	}

	// check if solution can be submitted
	@Test
	final void testSubmitSolution() {

	}

	@Test
	final void testRemind() {
		// Tested in person.java
	}

//Creation of user is tested by comparing name for facade strUserName and the value of strUserName
	@Test
	final void testCreateUser() {
		UserInfoItem userinfoitem = new UserInfoItem();
		userinfoitem.UserType = UserInfoItem.USER_TYPE.Student;
		userinfoitem.strUserName = "FIndler";
		facade.createUser(userinfoitem);
		assertEquals(facade.theperson.UserName, "FIndler");
	}

//CourseList  creation is tested previously
	@Test
	final void testCreateCourseList() {
		thecourselist = new ClassCourseList();
		// cxreated in ClassCourseList just making object
	}

//Done above
	@Test
	final void testAttachCourseToUser() {
		// we attach course to user. the output of below function tested above
		facade.attachCourseToUser();
	}

	@Test
	final void testSelectCourse() {
		// SWINGGGGGGGGGGGGG
	}

	@Test
	final void testCourseOperation() {
		// To be tested in person.java
	}

}
