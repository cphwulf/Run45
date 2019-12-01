package run45.Model;
import run45.DataMapper.EmployeeMapper;
import java.util.ArrayList;

public class EmployeeList {
	
	private ArrayList<Employee> employees;
	
	public EmployeeList() {
		EmployeeMapper employeeMapper = new EmployeeMapper();
		employees = employeeMapper.getAllEmployees();
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	
}