/*
 * This file was automatically generated by EvoSuite
 * Tue Apr 18 02:58:18 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SortedSinglyLinkedList_ESTest extends SortedSinglyLinkedList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemInUtil.addInputLine("1");
      SystemInUtil.addInputLine("1");
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        SortedSinglyLinkedList.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SystemInUtil.addInputLine("6");
      SystemInUtil.addInputLine("y#:V.ajK>{8[nf");
      // Undeclared exception!
      try { 
        SortedSinglyLinkedList.main((String[]) null);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SystemInUtil.addInputLine("2 -2");
      String[] stringArray0 = new String[14];
      // Undeclared exception!
      try { 
        SortedSinglyLinkedList.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SystemInUtil.addInputLine("2 3");
      String[] stringArray0 = new String[16];
      // Undeclared exception!
      try { 
        SortedSinglyLinkedList.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SystemInUtil.addInputLine("6 Y-:,$");
      // Undeclared exception!
      try { 
        SortedSinglyLinkedList.main((String[]) null);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SystemInUtil.addInputLine("4");
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        SortedSinglyLinkedList.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SystemInUtil.addInputLine("3 $");
      SortedSinglyLinkedList.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[21];
      SystemInUtil.addInputLine("2 ,,$");
      // Undeclared exception!
      try { 
        SortedSinglyLinkedList.main(stringArray0);
        fail("Expecting exception: InputMismatchException");
      
      } catch(InputMismatchException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SortedSinglyLinkedList sortedSinglyLinkedList0 = new SortedSinglyLinkedList();
  }
}
