package com.revature.daos;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private List<Employee> employees = new ArrayList<>();
	
	
	public EmployeeDaoImpl() {
		employees.add(new Employee(1, "Lisa Jones", 1300));
		employees.add(new Employee(2, "Perry Hansen", 2500));
		employees.add(new Employee(3, "Cindy Jenkins", 2000));
		employees.add(new Employee(4, "Julie Smith", 1600));
		employees.add(new Employee(5, "Ron McMitch", 1250));
		employees.add(new Employee(6, "Paul Paulson", 1500));
		
	}

	@Override
	public List<Employee> getEmployees() {
		return new ArrayList<Employee>(employees);
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee employee = null;
		for(Employee e: employees) {
			if(e.getId() == id) {
				employee = e;
			}
		}
		return employee;
	}

	@Override
	public int createEmployee(Employee e) {
		int maxId = 0; 
		for(Employee employee: employees) {
			if(employee.getId()>maxId) {
				maxId = employee.getId();
			}
		}
		e.setId(maxId+1);
		employees.add(e);
		return 1;
	}


}
