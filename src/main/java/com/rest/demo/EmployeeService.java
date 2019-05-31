/**
 * 
 */
package com.rest.demo;

/**
 * @author Dushyant_Sahu
 *
 */
public interface EmployeeService {
	Employee findById(int id);
	Employee updateById(int id, Employee emp);
}
