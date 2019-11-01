package hacs;

import javax.swing.*;


/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */



abstract public class AssignmentMenu extends JDialog
{

	private static final long serialVersionUID = 1L;

//abstract for showing a specified menu for a given assign
  abstract void ShowMenu(Assignment ass,Person per);
  
  //swinggggggggggg
  //assignmenu displayed
  public AssignmentMenu()
  {
    setModal(true);
    setSize(575,330);
  }
}
