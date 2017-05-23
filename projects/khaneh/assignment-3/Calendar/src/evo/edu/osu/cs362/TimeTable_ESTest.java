/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 23:09:36 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.osu.cs362.Appt;
import edu.osu.cs362.CalDay;
import edu.osu.cs362.TimeTable;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimeTable_ESTest extends TimeTable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(1, 1, 1, 1, 1, "cA8i", "cA8i");
      linkedList0.add(appt0);
      linkedList0.add(appt0);
      timeTable0.deleteAppt(linkedList0, appt0);
      assertEquals(1, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, (-1), (-869));
      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
      LinkedList<Appt> linkedList0 = calDay0.getAppts();
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar();
      // Undeclared exception!
      try { 
        timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      // Undeclared exception!
      try { 
        timeTable0.getApptRange(linkedList0, (GregorianCalendar) null, (GregorianCalendar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.TimeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2675, 2675, 2675, 2675, 2675);
      Locale locale0 = Locale.CHINESE;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      mockGregorianCalendar0.setLenient(false);
      // Undeclared exception!
      try { 
        timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MONTH
         //
         assertThrownBy("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(1, 1, 1, 1, 1, "cA8i", "cA8i");
      linkedList0.add((Appt) null);
      // Undeclared exception!
      try { 
        timeTable0.deleteAppt(linkedList0, appt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("edu.osu.cs362.TimeTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, "{eUy'", "HY'I\"Y&4YW%|");
      linkedList0.add(appt0);
      Appt appt1 = new Appt(1, 1, 1, 1, 1, "HY'I\"Y&4YW%|", "HY'I\"Y&4YW%|");
      timeTable0.deleteAppt(linkedList0, appt1);
      assertEquals(1, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(2, 26, 2, 1, 2722, "", "");
      linkedList0.add(appt0);
      timeTable0.deleteAppt(linkedList0, appt0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      Appt appt0 = new Appt(2, 48, (-4280), 1, 2675, "", "");
      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt0);
      assertNull(linkedList1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, (Appt) null);
      assertNull(linkedList1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      Appt appt0 = new Appt(2, 26, 2, 2, 2722, "", "");
      LinkedList<Appt> linkedList0 = timeTable0.deleteAppt((LinkedList<Appt>) null, appt0);
      assertNull(linkedList0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2722, 2722, 2722, 2722, 2722);
      Appt appt0 = new Appt(2, 26, 2, 1, 2722, "", "");
      linkedList0.add(appt0);
      Locale locale0 = Locale.CHINESE;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2722,MONTH=2722,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=2722,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2722,HOUR_OF_DAY=2722,MINUTE=2722,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2675, 2675, 2675, 2675, 2675);
      Appt appt0 = new Appt(2, 48, (-4280), 1, 2675, "", "");
      linkedList0.add(appt0);
      Locale locale0 = Locale.CHINESE;
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(locale0);
      LinkedList<CalDay> linkedList1 = timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar1);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", mockGregorianCalendar1.toString());
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=2675,MONTH=2675,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=2675,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=2675,HOUR_OF_DAY=2675,MINUTE=2675,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
      assertEquals(1, linkedList1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TimeTable timeTable0 = new TimeTable();
      LinkedList<Appt> linkedList0 = new LinkedList<Appt>();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 1, 1, 1, 1, 1);
      // Undeclared exception!
      try { 
        timeTable0.getApptRange(linkedList0, mockGregorianCalendar0, mockGregorianCalendar0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Second date specified is not before the first date specified.
         //
         assertThrownBy("edu.osu.cs362.TimeTable", e);
      }
  }
}