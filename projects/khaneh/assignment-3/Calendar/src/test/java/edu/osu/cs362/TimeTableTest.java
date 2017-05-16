package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {

		 TimeTable tt = new TimeTable();

			 LinkedList<Appt> appts = new LinkedList<Appt>();
			 appts.add(new Appt(13,
					 30,
					 10,
					 4,
					 2017,
					 "Birthday Party",
					 "This is my birthday party."));


			 assertTrue(tt.deleteAppt(appts, null) == null);
			 assertTrue(tt.deleteAppt(null,
					 new Appt(15, 30, 30, 4, 2017, "Birthday", "Birthday Party!")) == null);
			 assertTrue(tt.deleteAppt(appts, new Appt(15, 30, 30, 4, 2017, "Birthday", "Birthday Party!")) == null);
			 assertTrue(tt.deleteAppt(appts, new Appt(0, 0, 0, 0, 0, "", "")) == null);
		 }

	@Test

	public void test02()  throws Throwable  {

		GregorianCalendar obj = new GregorianCalendar();
		CalDay cal = new CalDay(obj);
		TimeTable table = new TimeTable();

		Appt appt = new Appt(11,
				30,
				10,
				4,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);

		appt = new Appt(8,
				30,
				15,
				7,
				2017,
				"Birthday Party",
				"This is my birthday party.");

		cal.addAppt(appt);
		LinkedList<Appt> list = cal.getAppts();
		GregorianCalendar today = new GregorianCalendar();
		GregorianCalendar lastday = (GregorianCalendar)today.clone();
		lastday.add(Calendar.DAY_OF_MONTH,20);

		LinkedList<CalDay> range = table.getApptRange(list,today,lastday);

		System.out.print(range);
	}

	@Test
	public void test03()	throws Throwable	{
		TimeTable tt = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();
		Appt appointment = new Appt(15, 30, 30, 4, 2017, "Birthday", "this is my birthday party.");

		appts.add(appointment);
		appts.add(new Appt(18, 30, 30, 4, 2017, "Lecture", "Go to lecture"));
		appts.add(new Appt(10, 30, 1, 5, 2017, "Movie", "Watch movie on Netflix"));

		assertNotNull(tt.deleteAppt(appts, appointment));

		assertTrue(tt.deleteAppt(appts, null) == null);
		assertTrue(tt.deleteAppt(null,
				new Appt(10, 30, 30, 4, 2017, "Birthday", "my birthday party.")) == null);

		assertTrue(tt.deleteAppt(appts,
				new Appt(0, 0, 0, 0, 0, "", "")) == null);
	}

	@Test
	public void test04()	throws Throwable	{
		TimeTable tt = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();

		appts = new LinkedList<Appt>();
		appts.add(new Appt(15, 30, 29, 4, 2017, "Birthday", "my birthday party."));
		appts.add(new Appt(18, 30, 30, 4, 2017, "Movie", "Watch movie on Netflix"));

		LinkedList<CalDay> calDayTest;
		calDayTest = tt.getApptRange(appts, new GregorianCalendar(2017, 4, 28, 14, 30, 0),
				new GregorianCalendar(2017, 4, 31, 19, 30, 0));

		assertTrue(calDayTest.get(0).getSizeAppts() == 0);
		assertTrue(calDayTest.get(1).getSizeAppts() == 1);
		assertTrue(calDayTest.get(2).getSizeAppts() == 1);
	}

	@Test
	public void test05()	throws Throwable	{
		TimeTable tt = new TimeTable();
		LinkedList<Appt> appts = new LinkedList<Appt>();

		Appt num1 = new Appt(16, 30, 17, 7, 2017, "Play", "Play Fifa");
		Appt num2 = new Appt(16, 30, 30, 4, 2017, "Chocolate", "Eat chocolates");
		Appt num3 = new Appt(10, 30, 30, 5, 2017, "Sleep", "Sleep all night");

		appts.add(num1);
		appts.add(num2);

		assertNotNull(tt.deleteAppt(appts, num1));
		assertNull(tt.deleteAppt(appts, num3));
	}
}