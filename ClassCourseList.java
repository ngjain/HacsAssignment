package hacs;

import java.util.ArrayList;
import java.io.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0 update to Java 8
 */

public class ClassCourseList extends ArrayList<Course> {

	private static final long serialVersionUID = 1L;

	public ClassCourseList() {
	}

//// initialize the list by reading from the file.
	void initializeFromFile(String theFileName) {
		try {
			BufferedReader file;
			String strCourseName = null;
			file = new BufferedReader(new FileReader("CourseInfo.txt"));
			while ((strCourseName = file.readLine()) != null) {
				Course theCourse;
				theCourse = new Course(strCourseName, 0);
//                              theCourse.CourseName= strCourseName;
				add(theCourse);
				file.close();
			}
		} catch (Exception ee) {
			;
		}
	}

//finding a course using it's name
	Course findCourseByCourseName(String CourseName) {
		int nCourseCount = size();
		for (int i = 0; i < nCourseCount; i++) {
			Course theCourse;
			theCourse = (Course) get(i);
			if (theCourse.coursename.compareTo(CourseName) == 0)
				return theCourse;
		}
		return null;
	}

}
