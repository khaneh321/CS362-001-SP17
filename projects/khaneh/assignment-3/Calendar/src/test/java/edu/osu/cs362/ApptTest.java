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

    @Test
    public void test10() throws Throwable {

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

        appt.setStartMonth(13);
        assertNull(appt.toString());

        appt.setStartMonth(12);
        appt.setStartHour(11);
        assertFalse(appt.toString().contains("pm"));
        assertFalse(appt.toString().contains("-1"));
    }

    @Test
    public void test11() throws Throwable {

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
        //check starting boundaries for mutation coverage
        appt.setStartHour(-1);
        assertFalse(appt.getValid());
        appt.setStartHour(0);
        assertTrue(appt.getValid());

        appt.setStartMinute(-1);
        assertFalse(appt.getValid());
        appt.setStartMinute(0);
        assertTrue(appt.getValid());

        appt.setStartDay(0);
        assertFalse(appt.getValid());
        appt.setStartDay(1);
        assertTrue(appt.getValid());

        appt.setStartMonth(0);
        assertFalse(appt.getValid());
        appt.setStartMonth(1);
        assertTrue(appt.getValid());

    }

    @Test
    public void test12() throws Throwable {

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
        //check ending bounderies for mutation coverage
        appt.setStartHour(24);
        assertFalse(appt.getValid());
        appt.setStartHour(23);
        assertTrue(appt.getValid());

        appt.setStartMinute(60);
        assertFalse(appt.getValid());
        appt.setStartMinute(59);
        assertTrue(appt.getValid());

        appt.setStartDay(32);
        assertFalse(appt.getValid());
        appt.setStartDay(31);
        assertTrue(appt.getValid());

        appt.setStartMonth(13);
        assertFalse(appt.getValid());
        appt.setStartMonth(12);
        assertTrue(appt.getValid());

    }

    @Test
    public void test13() throws Throwable {

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

        Appt temp;

        appt.setStartHour(24);
        if (appt.getValid()) {
            temp = new Appt(appt.getStartHour(), 30, 10, 4,
                    2017, appt.getTitle(), appt.getDescription());
            assertTrue(temp.getValid());
        }

    }

    @Test
    public void test14() throws Throwable {

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

        Appt temp;

        appt.setStartHour(13);
        appt.setStartMinute(61);
        if (appt.getValid()) {
            temp = new Appt(13, appt.getStartMinute(), 10, 4,
                    2017, appt.getTitle(), appt.getDescription());
            assertTrue(temp.getValid());
        }

    }

    @Test
    public void test15() throws Throwable {

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

        Appt temp;

        appt.setStartMinute(30);
        appt.setStartDay(32);
        if (appt.getValid()) {
            temp = new Appt(13, 30, appt.getStartDay(), 4,
                    2017, appt.getTitle(), appt.getDescription());
            assertTrue(temp.getValid());
        }

    }

    @Test
    public void test16()	throws Throwable	{

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

        assertTrue(appt.getValid());
        assertEquals(appt.toString(), ("\t" + appt.getStartMonth()+"/"+appt.getStartDay()+"/"+appt.getStartYear() + " at " + 1 + ":" + appt.getStartMinute() + "pm" + " ," + appt.getTitle() + ", " + appt.getDescription() + "\n"));
    }
}