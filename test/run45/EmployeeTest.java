/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run45;

import run45.Model.Employee;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class EmployeeTest {
	
	int employeeid;
	String role;
	String name;
	String password;
	
	@Before
	public void setUp() {
		employeeid=1;
		role="chasier";
		name="Kurt";
		password="123456";
	}

	@Test
	public void testgetName() {
		Employee emp = new Employee(employeeid,role,name,password);
		String actual = emp.getRole();
		String expected = "chasier";
		assertEquals(expected, actual);
	}
	
}
