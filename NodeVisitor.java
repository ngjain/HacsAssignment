package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

abstract public class NodeVisitor {
//constructor
	public NodeVisitor() {
	}

//constructor
	public NodeVisitor(Object visitee) {
	}

//visit facde
	abstract public void visitFacade(Facade facade);

//visit course
	abstract public void visitCourse(Course course);

//visit assignment
	abstract public void visitAssignment(Assignment assignment);

}
