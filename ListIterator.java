package hacs;

import java.util.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0 use <e> notation
 */

public class ListIterator implements Iterator<Object> {
	List<String> thelist;
	int currentnumber = 0;
//list initiliases by constructor
	public ListIterator() {
	}
//list injtilaised
	public ListIterator(List<String> list) {
		thelist = list;
	}
//check if list has a next element
	public boolean hasNext() {
		if (currentnumber >= thelist.size() - 1)
			return false;
		else
			return true;
	}
//primt nedt valur in anlist
	public String next() {
		if (hasNext() == true) {
			currentnumber++;
			return thelist.get(currentnumber);
		} else {
			return null;
		}
	}
//remove value at given position
	public void remove() {
		currentnumber= 0;
		thelist.remove(currentnumber);
	}
}
