/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package run45;

import run45.Model.Member;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class MemberTest {
	/*
	
	/*
	id, navn, årgang, klub, distance disciplin, begivenhed, sted, dato, resultater
	2, Mathias Maarbjerg Toft,1998, DGI Nordjylland,200m Fri Herrer, DGI Landmesterskab 2019, Ikast,03 marts 2019, 32.6, 1:08.18, 1:44.27, 2:17.25
	
	ANSAT
	- rolle (kasser,træner,..)
	MEDLEM
	- id,navn,årgang,aktiv/passiv,konkurr/motionist
	RESULTATER
	- tid, sted, dato
	DISCIPLIN
	- svømmestil
	DISTANCE
	- 50m,100, 150,200,
	*/
	
	int id;
	String name;
	String email;
	int year;
	int gender;
	boolean active;
	boolean competitor;

	@Before
	public void setUp() {
		id=2;
		gender=1;
		name="Mathias Maarbjerg Toft";
		email="m@m.dk";
		year=1998;
		active=true;
		competitor=true;
	}
	
	@Test
	public void testgetName() {
		Member member = new Member(name,email,year,active,competitor,gender);
		String expected="Mathias Maarbjerg Toft";
		String actual=member.getName();
		assertEquals(expected, actual);
	}
	
}
