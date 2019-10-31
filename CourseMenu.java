package hacs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;


/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

abstract public class CourseMenu extends JDialog
{
  Course theCourse;
  boolean bLogout=true;
//assigning elemnts on screen
  JRadioButton AssignmentRadiao = new JRadioButton();
  JComboBox AssignmentCombox = new JComboBox();
  JButton AssignmentViewButton = new JButton();
  JButton AssignmentAddButton = new JButton();
  JRadioButton OptionRadio = new JRadioButton();
  JLabel AssignmentContentLable = new JLabel();
  JComboBox OptionCombo = new JComboBox();
  JButton OptionViewButton = new JButton();
  JButton OptionAddButton = new JButton();
  JButton buttonChangeCourse = new JButton();
  JButton buttonLogout = new JButton();
//constructor
  public CourseMenu()
  {

    try
    {
      jbInit();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    setModal(true);
    setSize(503,294);
  }
//jbInit for winodw
  private void jbInit() throws Exception
  {
    buttonChangeCourse.setText("ChangeCourse");
    buttonChangeCourse.setBounds(new Rectangle(101, 211, 73, 37));
    buttonChangeCourse.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        buttonChangeCourse_actionPerformed(e);
      }
    });
    this.getContentPane().setLayout(null);
    this.setTitle("");
    buttonLogout.setText("Logout");
    buttonLogout.setBounds(new Rectangle(267, 215, 73, 37));
    buttonLogout.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        buttonLogout_actionPerformed(e);
      }
    });
    this.getContentPane().add(buttonChangeCourse, null);
    this.getContentPane().add(buttonLogout, null);
  }

  // when the add button is pressed, call add assignment
 // function of facade, after that refresh window
  

  //when the add button is pressed, call ViewAssignment
 // function of facade, after that refresh window


//abstract for functions to be performed by buttons

  abstract void ShowMenu(Course theCourse);
  abstract void ShowAddButtons();
  abstract void ShowViewButtons();
  abstract void ShowRadios();
  abstract void ShowComboxes();
  abstract void ShowLabel();
//functions performed
  void AssignmentAddButton_actionPerformed(ActionEvent e)
  {
    Hacs.theFacade.addAssignment(theCourse);
    refresh();
  }
  void AssignmentViewButton_actionPerformed(ActionEvent e)
  {
    Assignment theAss=(Assignment)AssignmentCombox.getSelectedItem() ;
    Hacs.theFacade.viewAssignment(theAss);
  }
  void refresh()
  {
    AssignmentCombox.removeAllItems() ;
    Iterator Iter=theCourse.assignmentlist.iterator() ;
    while(Iter.hasNext() )
    {
      AssignmentCombox.addItem(Iter.next() );
    }
  }

  void buttonChangeCourse_actionPerformed(ActionEvent e)
  {
    bLogout=false;
    hide();
  }

  void buttonLogout_actionPerformed(ActionEvent e)
  {
    bLogout=true;
    hide();
  }
  boolean ifLogout()
  {
    return bLogout;
  }
}
