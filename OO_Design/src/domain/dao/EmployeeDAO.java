package domain.dao;

import domain.Employee;

public class EmployeeDAO {

//	DatabaseConnectionManager connectionManager;
	
	public void saveEmployee(Employee emp) {
		System.out.println("saving employee " + emp);
	}
	
	public void deleteEmployee(Employee emp) {
		System.out.println("deleting employee " + emp);
	}
}

