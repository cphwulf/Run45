/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package run45.Model;

import java.util.Objects;

/**
 *
 * @author thor
 */
public class Member {
	//id, navn, årgang, klub, distance disciplin, begivenhed, sted, dato, resultater
	int id;
	String name;
	String email;
	int year;
	int gender;
	boolean active;
	boolean competitor;

	public Member() {

	}

	public Member(String name, String email, int year, boolean active, boolean competitor, int gender) {
		this.gender = gender;
		this.name = name;
		this.email = email;
		this.year = year;
		this.active = active;
		this.competitor = competitor;
	}
	public Member(String name, int year, boolean active, boolean competitor) {
		this.name = name;
		this.year = year;
		this.active = active;
		this.competitor = competitor;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setCompetitor(boolean competitor) {
		this.competitor = competitor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public boolean isActive() {
		return active;
	}

	public boolean isCompetitor() {
		return competitor;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 23 * hash + Objects.hashCode(this.email);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Member other = (Member) obj;
		if (!Objects.equals(this.email, other.email)) {
			return false;
		}
		return true;
	}
	
	
	
}
