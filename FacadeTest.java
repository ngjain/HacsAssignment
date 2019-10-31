package hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacadeTest {
//getusername, getcourse name tested in attach course to user
	Facade facade = new Facade();

	ClassCourseList thecourselist;
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
	final void testFacade() {
		// constructor
		System.out.println("facade object created.");
	}

	@Test
	final void testLogin() {
		//Login is called that uses swing
	}

	@Test
	final void testAddAssignment() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testViewAssignment() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testGradeSolution() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testReportSolutions() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	final void testSubmitSolution() {
		
	}

	@Test
	final void testRemind() {
		//Tested in person.java
	}

	@Test
	final void testCreateUser() {
		UserInfoItem userinfoitem = new UserInfoItem();
		userinfoitem.UserType  = UserInfoItem.USER_TYPE.Student ;
		userinfoitem.strUserName = "FIndler";
		facade.createUser(userinfoitem);
		assertEquals(facade.theperson.UserName,"FIndler");
	}

	@Test
	final void testCreateCourseList() {
		thecourselist = new ClassCourseList();
		//cxreated in ClassCourseList just making object
	}

	@Test
	final void testAttachCourseToUser() {
		//we attach course to user. the output of below function tested above
		facade.attachCourseToUser();
	}

	@Test
	final void testSelectCourse() {
		//SWINGGGGGGGGGGGGG
	}

	@Test
	final void testCourseOperation() {
		//To be tested in person.java
	}

}
