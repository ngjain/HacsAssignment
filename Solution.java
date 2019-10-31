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

	public Solution() {
	}

	@Override
	public String toString() {
		String string;
		string = theauthor + "  " + solutionfilename + " Grade=" + getGradeInt() + "  ";
		if (isReported())
			string += "reported";
		else
			string += "not reported";

		return (string);
	}

	String getGradeString() {
		if (isReported())
			return "" + thegrade;
		else
			return "-1";
	}

	int getGradeInt() {
		return thegrade;
	}

	public void setReported(boolean reported) {
		this.reported = reported;
	}

	public boolean isReported() {
		return reported;
	}
}