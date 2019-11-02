package hacs;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class CourseIterator implements Iterator<Object> {
	ClassCourseList theCourseList;
	int CurrentCourseNumber = -1;

//initialised to previous element of 1st array element
//constructor
	public CourseIterator() {
	}

//constructor
	public CourseIterator(ClassCourseList courseList) {
		theCourseList = courseList;
	}

//check if next elemt exists
	public boolean hasNext() {
		if (CurrentCourseNumber >= theCourseList.size() - 1)
			return false;
		else
			return true;
	}

//gives next value
	public Object next() {
		if (hasNext() == true) {
			CurrentCourseNumber++;
			return theCourseList.get(CurrentCourseNumber);
		} else {
			return null;
		}
	}

//remove an element
	public void remove() {
		theCourseList.remove(CurrentCourseNumber);
	}

// the next Course that fits the given CourseName
	public Object next(String CourseName) {
		Course theCourse;
		theCourse = (Course) next();
		while (theCourse != null) {
			if (CourseName.compareTo(theCourse.toString()) == 0) {
				return theCourse;
			}
			theCourse = (Course) next();
		}
		return null;
	}

	public ArrayList<Course> getTheCourseList() {

		return theCourseList;
	}

}
