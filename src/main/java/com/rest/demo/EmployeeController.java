package com.rest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dushyant_Sahu
 *
 */

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/get/{id}")
	public Employee findById(@PathVariable(value = "id") int id) {
		return employeeService.findById(id);
	}

	@GetMapping(value = "/get")
	public Employee getById(@RequestParam(value = "id") int id) {
		return employeeService.findById(id);
	}
	
	@PostMapping(value = "/update/{id}")
	public Employee updateById(@PathVariable(value = "id") int id, @RequestBody Employee emp) {
		return employeeService.updateById(id, emp);
	}
}
