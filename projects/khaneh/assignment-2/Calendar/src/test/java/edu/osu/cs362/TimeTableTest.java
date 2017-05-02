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

}