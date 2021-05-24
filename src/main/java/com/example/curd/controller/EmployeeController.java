package com.example.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curd.dao.EmployeeEntity;
import com.example.curd.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@GetMapping
	public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
		List<EmployeeEntity> list = service.getAllEmployees();

		return new ResponseEntity<List<EmployeeEntity>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/getEmployeeById/{id}")
	public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable("id") Long id) throws RuntimeException {
		EmployeeEntity entity = service.getEmployeeById(id);

		return new ResponseEntity<EmployeeEntity>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/addEmployees")
	public ResponseEntity<EmployeeEntity> createOrUpdateEmployee(EmployeeEntity employee) throws RuntimeException {
		EmployeeEntity updated = service.CreateOrUpdateEmployee(employee);
		return new ResponseEntity<EmployeeEntity>(updated, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/addEmployee")
	public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employee) {
		return service.addEmployee(employee);

	}

	@GetMapping("/getEmployeeByName/{firstname}")
	public EmployeeEntity getEmployeeByName(@PathVariable String firstname) {
		return service.findByName(firstname);

	}

	@GetMapping("/getEmployeeByLastName/{lastname}")
	public List<EmployeeEntity> getEmployeeByLastName(@PathVariable String lastname) {
		return service.findByLastName(lastname);

	}
	
	@GetMapping("/getEmployeeByEmailId/{emailid}")
	public EmployeeEntity getEmployeeByEmailId(@PathVariable String emailid) {
		return service.findByEmailId(emailid);
	}
	
	@GetMapping("/getEmployeeBySalary/{salary}")
	public List<EmployeeEntity> getEmployeeByEmailId(@PathVariable double salary) {
		return service.findBySalary(salary);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) throws RuntimeException {
		service.deleteEmployeeById(id);
		return HttpStatus.FORBIDDEN;
	}

}
