package hacs;

import java.io.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * 
 *          Update to Jave 8
 */

public class Facade {
	public int usertype;
	private Course theselectedcourse = null;
	private int ncourselevel = 0;
	ClassCourseList thecourselist;
	Person theperson;

	public Facade() {
	}

	static public boolean login(UserInfoItem userinfoItem) {
		Login login = new Login();
		login.setModal(true);
		login.show();
		userinfoItem.strUserName = login.GetUserName();
		userinfoItem.UserType = login.GetUserType();
		return login.isExit();
	}

/////////////////////////
//functions for CourseMenu
	/*
	 * When click the add button of the CourseMenu , call this function this
	 * function will new an assignment fill the required infomation this function
	 * will call InstructorAssignmentMenu or StudentAssignmentMenu according to the
	 * type of the user it will not update the course menu. the coursemenu need to
	 * refreshed outside the function
	 */

	void addAssignment(Course theCourse) {
		AssignmentMenu theAssignmentMenu;
		if (theperson.type == 0)/// student
		{
			theAssignmentMenu = new StudentAssignmentMenu();
		} else {
			theAssignmentMenu = new InstructorAssignmentMenu();
		}
		Assignment theAssignment = new Assignment();
		theAssignmentMenu.ShowMenu(theAssignment, theperson);
		theCourse.addAssignment(theAssignment);
	}

	/*
	 * When click the view button of the CourseMenu , call this function and pass
	 * the pointer of the Assignment and the person pointer to this function this
	 * function will new an assignment fill the required infomation this function
	 * will call InstructorAssignmentMenu or StudentAssignmentMenu according to the
	 * type of the user
	 */
	void viewAssignment(Assignment theAssignment) {
		AssignmentMenu theAssignmentMenu;
		if (theperson.type == 0)/// student
		{
			theAssignmentMenu = new StudentAssignmentMenu();
		} else {
			theAssignmentMenu = new InstructorAssignmentMenu();
		}

		theAssignmentMenu.ShowMenu(theAssignment, theperson);
	}

//functions for InstructorAssignmentMenu
	/*
	 * this function will grade the give Solution: theSolution this function calls
	 */

	void gradeSolution(Solution theSolution) {
		SolutionMenu solutionMenu = new SolutionMenu();
		solutionMenu.ShowMenu(theSolution);
	}

	void reportSolutions(Assignment theAssignment) {
		Solution theSolution;
		SolutionIterator theSolutionIterator;
		theSolutionIterator = theAssignment.getSolutionIterator();
		theSolution = (Solution) theSolutionIterator.next();
		while (theSolution != null) {
			theSolution.setReported(true);
			theSolution = (Solution) theSolutionIterator.next();
		}
	}
////////////////////

//functions for StudentAssignmentMenu
	void submitSolution(Assignment theAssignment, Solution theSolution) {
		theAssignment.addSolution(theSolution);
	}

//////////
	void remind() {
		Reminder theReminder = new Reminder();
		theReminder.showReminder(theperson.GetCourseList());
	}

	void createUser(UserInfoItem userinfoitem) {
		if (userinfoitem.UserType == UserInfoItem.USER_TYPE.Student) /// student
		{
			theperson = new Student();
		} else /// instructor
		{
			theperson = new Instructor();
		}
		theperson.UserName = userinfoitem.strUserName;
	}

	/*
	 * create a course list and intitialize it with the file CourseInfo.txt
	 */
	void createCourseList() {
		thecourselist = new ClassCourseList();
		thecourselist.initializeFromFile("CourseInfo.txt");
	}

	/*
	 * call this function after create user, create courselist read the
	 * UserCourse.txt file match the coursename with theCouresList attach the
	 * Matched course object to the new create user Facade.thePerson.CourseList
	 */
	void attachCourseToUser() {
		BufferedReader file;
		try {
			file = new BufferedReader(new FileReader("UserCourse.txt"));
			String aline, strUserName, strCourseName;
			while ((aline = file.readLine()) != null) // not the EOF
			{
				strUserName = getUserName(aline);
				strCourseName = getCourseName(aline);
				if (strUserName.compareTo(theperson.UserName) == 0) /// the UserName mateches
				{
					theselectedcourse = findCourseByCourseName(strCourseName);
					if (theselectedcourse != null) /// Find the Course in the CourseList--->attach
					{
						theperson.AddCourse(theselectedcourse);
					}
				}
			}
		} catch (Exception ee) {
			;
		}
	}

	/*
	 * get the user name from aline UserName:CourseName
	 */
	private String getUserName(String aline) {
		int Sep = aline.lastIndexOf(':');
		return aline.substring(0, Sep);
	}

	/*
	 * get the CourseName from aline UserName:CourseName
	 */
	private String getCourseName(String aline) {
		int Sep = aline.lastIndexOf(':');
		return aline.substring(Sep + 1, aline.length());
	}

	/*
	 * show the course selection dlg, show the course attatched to theperson and
	 * return the selected course and assign the course to the class member
	 * theSelecteCourse, the Course Level to CourseLevel CourseLeve=0 High,
	 * CourseLeve=1 Low
	 */
	public boolean selectCourse() {
		CourseSelectDlg theDlg = new CourseSelectDlg();
		theselectedcourse = theDlg.ShowDlg(theperson.CourseList);
		theperson.CurrentCourse = theselectedcourse;
		ncourselevel = theDlg.nCourseLevel;
		return theDlg.isLogout();
	}

	/*
	 * call the thePerson.CreateCourseMenu according to the really object(student or
	 * instructor) and the nCourseLevel it will call different menu creater and show
	 * the menu;
	 */

	public boolean courseOperation() {
		theperson.createCourseMenu(theselectedcourse, ncourselevel);
		return theperson.showMenu();//// 0: logout 1 select an other course
	}

	/*
	 * find the course in theCourseList that matches strCourseName 1 create a
	 * CourseIterator for the List 2 Find the Course with the Iterator return the
	 * pointer of the Course if not fine, return null;
	 */
	private Course findCourseByCourseName(String strCourseName) {
		CourseIterator Iterator = new CourseIterator(thecourselist);
		return (Course) Iterator.next(strCourseName);
	}

}