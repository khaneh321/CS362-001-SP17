package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
	/**
	 * Test that the gets methods work as expected.
	 */
	@Test

	public void test01() throws Throwable {
		int startHour = 13;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		// assertions
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}


	@Test

	public void test00() throws Throwable {
		int startHour = 0;
		int startMinute = 0;
		int startDay = 0;
		int startMonth = 0;
		int startYear = 0;
		String title = null;
		String description = null;
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		appt.setStartHour(13);
		appt.setStartMinute(30);
		appt.setStartDay(10);
		appt.setStartMonth(4);
		appt.setStartYear(2017);
		appt.setTitle("Birthday Party");
		appt.setDescription("This is my birthday party.");

		// assertions
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
	}


	@Test

	public void test02() throws Throwable {
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);


		appt.setStartHour(-3);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());
	}

	@Test

	public void test03() throws Throwable {

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);

		appt.setStartHour(26);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());
	}

	@Test

	public void test04() throws Throwable {
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);


		appt.setStartMinute(-4);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());

	}

	@Test

	public void test05() throws Throwable {

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);

		appt.setStartMinute(70);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());
	}

	@Test

	public void test06() throws Throwable {
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);


		appt.setStartDay(0);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());

	}

	@Test

	public void test07() throws Throwable {

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);

		appt.setStartDay(35);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());
	}

	@Test

	public void test08() throws Throwable {
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);


		appt.setStartMonth(0);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());

	}

	@Test

	public void test09() throws Throwable {

		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(0,
				0,
				0,
				0,
				0,
				null,
				null);

		appt.setStartMonth(20);

		assertEquals(false, appt.getValid());
		assertNull(appt.toString());
	}

}
