package hacs;

import java.util.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 
 */

public class ListIterator implements Iterator<Object> {
	List<Object> thelist;
	int currentnumber = 0;

//list initiliases by constructor
	public ListIterator() {
	}

//list injtilaised
	public ListIterator(ArrayList<Object> testList) {
		thelist = testList;
	}

//check if list has a next element
	public boolean hasNext() {
		if (currentnumber >= thelist.size() - 1)
			return false;
		else
			return true;
	}

//primt nedt valur in anlist
	public Object next() {
		if (hasNext() == true) {
			currentnumber++;
			return thelist.get(currentnumber);
		} else {
			return null;
		}
	}

//remove value at given position
	public void remove() {
		currentnumber = 0;
		thelist.remove(currentnumber);
	}
}
