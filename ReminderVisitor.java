package hacs;

import java.util.Iterator;
import java.util.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * 
 *          update to Java 8
 */

/*
 * this class will iterate the course list attatched to on student and in turn
 * iterate the assignments of a course. after Function Visit(CourseList) it will
 * point to the location before the fist class, hasNext will retrun weather
 * there is next item. the next() will return the next Item Assignment;
 */

public class ReminderVisitor extends NodeVisitor {

	Reminder m_Reminder;

//constructor
	public ReminderVisitor() {
	}

//reminder visitor constructor
	public ReminderVisitor(Reminder reminder) {
		m_Reminder = reminder;
	}

// iterating through the facde
	public void visitFacade(Facade facade) {
		CourseIterator courseList = new CourseIterator(facade.thecourselist);
		while (courseList.hasNext()) {
			Course course = (Course) courseList.next();
			course.accept(this);
		}
	}

//iterate thriugh a course 
	public void visitCourse(Course course) {
		Iterator<Assignment> assignmentList = course.assignmentlist.listIterator();
		while (assignmentList.hasNext()) {
			Assignment assignment = (Assignment) assignmentList.next();
			assignment.accept(this);
		}
	}

// check if assignmnent is overdue
	public void visitAssignment(Assignment assignment) {
		Date today = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		int ntoday = calendar.get(Calendar.DAY_OF_YEAR);
		calendar.setTime(assignment.duedate);
		int nDueDate = calendar.get(Calendar.DAY_OF_YEAR);
		if (nDueDate <= (ntoday + 1) && nDueDate >= ntoday) /// upcoming
		{
			m_Reminder.listUpcoming.add("today is " + today.toString() + " " + assignment.assignmentname
					+ " Due Date is " + assignment.getDueDateString());
		}
		if (nDueDate < ntoday) {
			// put to the
			m_Reminder.listOverdue.add(assignment.assignmentname + " Due Date is " + assignment.getDueDateString());
		}

	}

	public Object getM_Reminder() {

		return m_Reminder;
	}

}
