/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package run45.Model;

/**
 *
 * @author thor
 */
public class Results {
	int resultid;
	Member member;
	String event;
	String eventdate;
	String eventplace;
	String eventcountry;
	SwimArt swimmart;
	SwimDistance swimmdistance;
	int result;

	public Results(int resultid, Member member, String event, String eventdate, String eventplace, String eventcountry, SwimArt swimmart, SwimDistance swimmdistance, int result) {
		this.resultid = resultid;
		this.member = member;
		this.event = event;
		this.eventdate = eventdate;
		this.eventplace = eventplace;
		this.eventcountry = eventcountry;
		this.swimmart = swimmart;
		this.swimmdistance = swimmdistance;
		this.result = result;
	}

	public int getResultid() {
		return resultid;
	}

	public Member getMember() {
		return member;
	}

	public String getEvent() {
		return event;
	}

	public String getEventdate() {
		return eventdate;
	}

	public String getEventplace() {
		return eventplace;
	}

	public String getEventcountry() {
		return eventcountry;
	}

	public SwimArt getSwimmart() {
		return swimmart;
	}

	public SwimDistance getSwimmdistance() {
		return swimmdistance;
	}

	public int getResult() {
		return result;
	}
	
}
