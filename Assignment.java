package hacs;

/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 */

import java.util.*;
import java.text.DateFormat;

public class Assignment {

  protected String assignmentname;
  protected String strassignmentfilename;
  protected Date duedate=new Date();
  protected String assspec;
  protected SolutionList thesolutionlist=new SolutionList();
  protected Solution suggestsolution=new Solution();



  public Assignment() {
  }

  public void setDueDate(Date theDueDate){
    this.duedate = theDueDate;
  }

  public void setAssSpec(String theSpec){
    this.assspec = theSpec;
  }

  public boolean isOverDue(){
    Date today;
    today = new Date();
    if (today.after(this.duedate)) {
      return true;
    }
    else {
      return false;
    }
  }

  public Solution addSolution(){
    Solution mySolution = new Solution();
    return mySolution;
  }

  ////add the theSolution to the Solutionlist
  public void addSolution(Solution theSolution)
  {
    thesolutionlist.add(theSolution);
  }

  public void submitSolution(){
  }

  public SolutionList getSolutionList(){
	  return thesolutionlist;
  }

  /* return the solution of the give name
  */
  public Solution getSolution(String studentname)
  {
    SolutionIterator Iterator=(SolutionIterator)thesolutionlist.iterator();
    return (Solution)Iterator.next(studentname);
  }

  public Solution getSugSolution(){
    return suggestsolution;
  }

  public SolutionIterator getSolutionIterator()
  {
    SolutionIterator theSolutionIterator=new SolutionIterator(thesolutionlist);
    return theSolutionIterator;
  }

  public String toString()
  {
    return assignmentname;
  }

  public String getDueDateString()
  {
    DateFormat dateFormat=DateFormat.getDateInstance(DateFormat.SHORT);
    return  dateFormat.format(duedate);
  }

  public void accept(NodeVisitor visitor)
  {
    visitor.visitAssignment(this);
  }

public Object getAssSpec() {
	// TODO Auto-generated method stub
	return assspec;
}
}