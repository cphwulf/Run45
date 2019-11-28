/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run45;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class DBConnectorTest {
	
	@Before
	public void setUp() {
	}

	@Test
	public void testGetConnection() throws SQLException {
		System.out.println("getConnection");
		//DBConnector db = DBConnector.getInstance();
		Connection conn = DBConnector.getInstance().getConnection();
		conn.getCatalog();
		System.out.println(conn.getCatalog());
		assertTrue(true);
	}

}
