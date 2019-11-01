package hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class ReminderVisitorTest {
//contrucr
	@Test
	void testReminderVisitor() {
		System.out.println("Initialized reminder visitor");
	}
//reminder visitor second constrctor
	@Test
	void testReminderVisitorReminder() {
		ReminderVisitor reminderVisitor = new ReminderVisitor(new Reminder());
		assertNotNull(reminderVisitor.getM_Reminder());
	}
// cheksassignment by initialisig it and checking if it's empty
	@Test
	void testVisitAssignment() {
		ReminderVisitor reminderVisitor = new ReminderVisitor(new Reminder());
		Assignment assignment = new Assignment();
		assignment.setAssignmentName("Test Assignment");
		assignment.setDueDate(new Date());
		reminderVisitor.visitAssignment(assignment);
		assertNotNull(reminderVisitor.m_Reminder.listUpcoming);
	}

}
