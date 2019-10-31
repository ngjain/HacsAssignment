package hacs;

import java.util.*;

/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 * @author mjfindler
 * @version 2.0 
 * Update to Java 8
 */

public class Course {
  String coursename;
  public ArrayList<Assignment> assignmentlist=new ArrayList<Assignment>();
  int numofass;
  int courselevel;


  public Course(String strCourse, int theLevel) {
    this.coursename = strCourse;

   //0 HighLeve presentation    1  LowLevel Experiment
    this.courselevel = theLevel;
   // this.AssList = NULL;
    this.numofass = 0;
  }
  
  public void addAssignment(Assignment newAss)
  {
    assignmentlist.add(newAss);
  }
  
  public String toString()
  {
    return coursename;
  }
  
  void accept(NodeVisitor visitor)
  {
    visitor.visitCourse(this);
  }

}