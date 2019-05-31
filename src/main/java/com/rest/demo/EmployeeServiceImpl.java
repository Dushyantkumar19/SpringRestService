/**
 * 
 */
package com.rest.demo;

import java.util.Date;

/**
 * @author Dushyant_Sahu
 *
 */
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee findById(int id) {

		Employee emp = new Employee();
		emp.setId(id);
		emp.setFirstname("shiv");
		emp.setLastname("jaiswal");
		emp.setDesignation("lead consultant");
		emp.setDoj(new Date());

		if (id == 1) {
			emp = new Employee();
			emp.setId(id);
			emp.setFirstname("dushyant");
			emp.setLastname("sahu");
			emp.setDesignation("lead consultant");
			emp.setDoj(new Date());
		}

		else if (id == 2) {
			emp = new Employee();
			emp.setId(id);
			emp.setFirstname("rambabu");
			emp.setLastname("gonela");
			emp.setDesignation("lead associate consultant");
			emp.setDoj(new Date());
		}

		return emp;
	}

	@Override
	public Employee updateById(int id, Employee emp) {
		Employee emp1 = findById(id);
		emp1.setFirstname(emp.getFirstname());
		emp1.setLastname(emp.getLastname());
		emp1.setDesignation(emp.getDesignation());
		emp1.setDoj(emp.getDoj());
		return emp1;
	}
}
