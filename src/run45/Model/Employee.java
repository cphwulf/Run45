package run45.Model;

/**
 *
 * @author thor
 */
public class Employee {
	int employeeid;
	String role;
	String name;
	String password;

	public Employee(int employeeid, String role, String name, String password) {
		this.employeeid = employeeid;
		this.role = role;
		this.name = name;
		this.password = password;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public String getRole() {
		return role;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
	
}
