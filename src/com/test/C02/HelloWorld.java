package com.test.C02;

/*public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HelloWorld");
	}
	
	//public string HelloWorld(string 1; sting 2) {
		
	//}
}*/
/*java Test0202 �Ա���1 �Ա���2 �Ա���3
 * @author
 * @see
 * @date
 */
//: Property.java
import java.util.*;

/**
* The first Thinking in Java example program
* Lists system information on current machine.
* @author Bruce Eckel
* @author http://www.BruceEckel.com
* @version 1.0
*/

public class HelloWorld {
  /**
   * Sole entry point to class & application
   * @param args array of string arguments
   * @return No return value
   * @exception exceptions No exceptions thrown
   */
  public static void main(String[] args) {
      System.out.println(new Date());
      Properties p = System.getProperties();
      p.list(System.out);
      System.out.println("---Memory Usage:");
      Runtime rt = Runtime.getRuntime();
      System.out.println("Total Memory = " + rt.totalMemory() + " Free Memory = " + rt.freeMemory());
  
  }
} ///:~
/** һ����ע�� */
public class docTest {
/** һ������ע�� */
public int i;
/** һ������ע�� */
public void f() {}
}
