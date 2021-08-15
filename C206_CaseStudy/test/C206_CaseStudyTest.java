import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	public Appointment appointment1 ;
	public Appointment appointment2 ;
	public ArrayList<Appointment> appointmentList;

	@Before
	public void setUp() throws Exception {
		appointment1 = new Appointment("John Smith", "1/2/2021");
		appointment2 = new Appointment("Jane Smith", "2/3/2021");

		appointmentList = new ArrayList<Appointment>();
	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void ViewAppointmentTest() {
		//Check appointment list is not null
		assertNotNull("Test if a array list exists", C206_CaseStudy.appointmentList);

	}
	
	@Test
	public void addAppointmentTest() {
		//Check appointment list is not null
		assertNotNull("Test if a array list exists", C206_CaseStudy.appointmentList);
		//Check that after adding item array list size is 1
		//Check that item added is the same as the top of the array list
		appointmentList.add(appointment1);
		assertEquals("Check that arraylist size is 1", 1, appointmentList);
		assertSame("Check that appointment is added",appointment1, appointmentList.get(0));
		//Check that after adding item array list size is 2
		//Check that item added is the same as the bottom of the array list
		appointmentList.add(appointment2);
		assertEquals("Check that arraylist size is 2", 2, appointmentList);
		assertSame("Check that appointment is added",appointment2, appointmentList.get(1));
	}
	
	@Test
	public void updateAppointmentTest() {
		//Check appointment list is not null
		assertNotNull("Test if a array list exists", C206_CaseStudy.appointmentList);
		//Check that after adding item array list size is 1
		//Check that item added is the same as the top of the array list
		appointmentList.add(appointment1);
		assertEquals("Check that arraylist size is 1", 1, appointmentList);
		//Check that array list updates
		C206_CaseStudy.updateAppointment(appointmentList);
	}
	
	@Test
	public void deleteAppointmentTest() {
		//Check appointment list is not null
		assertNotNull("Test if a array list exists", C206_CaseStudy.appointmentList);
		//Check that after adding item array list size is 2
		//Check that item added is the same as the bottom of the array list
		C206_CaseStudy.addAppointment(appointmentList);
		appointmentList.add(appointment2);
		assertEquals("Check that arraylist size is 2", 2, appointmentList);
		assertSame("Check that appointment is added",appointment2, appointmentList.get(1));
		//Check that after deletion appointmentlist is 0
		//Check that item remaining is the same as the top of the array list
		appointmentList.remove(0);
		assertEquals("Check that arraylist size is 1", 1, appointmentList);
		assertSame("Check that appointment is added",appointment2, appointmentList.get(0));
	}

}
