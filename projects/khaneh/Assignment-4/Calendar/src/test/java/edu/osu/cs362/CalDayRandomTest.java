package edu.osu.cs362;


import org.junit.Test;
import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 System.out.println("Start testing...");

		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed = System.currentTimeMillis();//System.currentTimeMillis();
			 //			System.out.println(" Seed:"+randomseed );
			 Random random = new Random(randomseed);

			 int startHour = 13;
			 int startMinute = 30;
			 int startDay = 10;
			 int startMonth = 4;
			 int startYear = 2017;
			 String title = "Birthday Party";
			 String description = "This is my birthday party.";
			 //Construct a new Appointment object with the initial data

			 GregorianCalendar today = new GregorianCalendar(startYear,startMonth,startDay);
			 CalDay calday = new CalDay(today);

			 Appt appt = new Appt(startHour,
					 startMinute,
					 startDay,
					 startMonth,
					 startYear,
					 title,
					 description);

			 Appt newappt = new Appt(startHour,
					 startMinute,
					 startDay,
					 startMonth,
					 startYear,
					 title,
					 description);


			 for (int i = 0; i < NUM_TESTS; i++) {


				 appt.setStartHour(ValuesGenerator.getRandomIntBetween(random, 0, 12));
				 appt.setStartMinute(ValuesGenerator.getRandomIntBetween(random, 0, 60));
				 appt.setStartDay(ValuesGenerator.getRandomIntBetween(random, 1, 31));
				 appt.setStartMonth(ValuesGenerator.getRandomIntBetween(random, 1, 12));
				 appt.setStartYear(ValuesGenerator.getRandomIntBetween(random, 2017, 2100));
				 appt.setTitle(ValuesGenerator.getString(random));
				 appt.setDescription(ValuesGenerator.getString(random));

				 newappt.setStartHour(ValuesGenerator.getRandomIntBetween(random, 0, 12));
				 newappt.setStartMinute(ValuesGenerator.getRandomIntBetween(random, 0, 60));
				 newappt.setStartDay(ValuesGenerator.getRandomIntBetween(random, 1, 31));
				 newappt.setStartMonth(ValuesGenerator.getRandomIntBetween(random, 1, 12));
				 newappt.setStartYear(ValuesGenerator.getRandomIntBetween(random, 2017, 2100));
				 newappt.setTitle(ValuesGenerator.getString(random));
				 newappt.setDescription(ValuesGenerator.getString(random));

				  calday.addAppt(appt);
				  calday.addAppt(newappt);

			 }

			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if ((iteration % 10000) == 0 && iteration != 0)
				 System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);

		 }

	 }
	
}
