package hacs;

import java.util.*;

/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 * 
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * 
 * update to Java 8
 */

public class Solution {
	String theauthor = "";
	String solutionfilename = "";
	Date thesubmitdata = new Date();
	int thegrade = 100;
	boolean reported = false;
//constructor
	public Solution() {
	}
//it returns the name of the assignment and the grade given to it
	@Override
	public String toString() {
		String string = "";
		string = theauthor + "  " + solutionfilename + " Grade=" + getGradeInt() + "  ";
		if (isReported())
			string += "reported";
		else
			string += "not reported";

		return (string);
	}
//it returns the grade as a string
	String getGradeString() {
		if (isReported())
			return "" + thegrade;
		else
			return "-1";
	}
//it returns the grade for the assignment
	int getGradeInt() {
		return thegrade;
	}
//set reported
	public void setReported(boolean reported) {
		this.reported = reported;
	}
//check if the assignmmet is reported
	public boolean isReported() {
		return reported;
	}
	public void setTheAuthor(String string) {
		theauthor = string;
		
	}
}
