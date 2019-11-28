/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package run45;

import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class MemberControllerTest {
	Member member;
	
	
	@Before
	public void setUp() {
		int gender=1;
		String name="Kurt Verner Toft";
		String email="kv@m.dk";
		int year=1999;
		boolean active=true;
		boolean competitor=false;
		member = new Member(name,email,year,active,competitor,gender);
	}
	
	@Test
	public void testgetAllMembersFromDB() throws SQLException {
		MemberController mc = new MemberController();
		mc.getAllMembersFromDB();
		assertTrue(true);
	}
	@Test
	public void testwriteMemberToDB() throws SQLException {
		MemberController mc = new MemberController();
		mc.writeMemberToDB(member);
		assertTrue(true);
	}
	
}
