package run45;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class ResultsTest {
	/*
	id, navn, årgang, klub, distance disciplin, begivenhed, sted, dato, resultater
	2, Mathias Maarbjerg Toft,1998, DGI Nordjylland,200m Fri, DGI Landmesterskab 2019, Ikast,03 marts 2019, 32.6, 1:08.18, 1:44.27, 2:17.25
	
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
	
	int resultid;
	Member testMember;
	String event;
	String eventdate;
	String eventplace;
	String eventcountry;
	SwimArt swimmart;
	SwimDistance swimmdistance;
	int result;
	
	
	
	@Before
	public void setUp() {
		int gender=1;
		String name="Mathias Maarbjerg Toft";
		String email="m@m.dk";
		int year=1998;
		boolean active=true;
		boolean competitor=true;
		resultid=34;
		event="DGI Landmesterskab 2019";
		eventdate="03-03-2019";
		eventplace="Ikast";
		eventcountry="DK";
		swimmart=new SwimArt(1, "Fri");
		swimmdistance=new SwimDistance(1, 200);
		result=13725;
		Member testMember = new Member(name,email,year,active,competitor,gender);
	}
	
	@Test
	public void testgetResult() {
		Results result = new Results(resultid , testMember,event,eventdate,eventplace,eventcountry,swimmart,swimmdistance,this.result);
		int expected = 13725;
		int actual = result.getResult();
		assertEquals(expected, actual);
	}
	
}
