package com.example.curd.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curd.dao.EmployeeEntity;
import com.example.curd.dao.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;

	public List<EmployeeEntity> getAllEmployees() {
		List<EmployeeEntity> employeeList = repository.findAll();

		if (employeeList.size() > 0) {
			return employeeList;

		} else {
			return new ArrayList<EmployeeEntity>();
		}
	}

	public EmployeeEntity getEmployeeById(Long id) throws RuntimeException {
		Optional<EmployeeEntity> employee = repository.findById(id);
		if (employee.isPresent()) {
			return employee.get();
		} else {
			throw new RuntimeException("No employee record exist for given id");
		}
	}

	public EmployeeEntity CreateOrUpdateEmployee(EmployeeEntity entity) {
		Optional<EmployeeEntity> employee = repository.findById(entity.getId());
		if (employee.isPresent()) {
			EmployeeEntity newEntity = employee.get();
			newEntity.setEmailid(entity.getEmailid());
			newEntity.setFirstname(entity.getFirstname());
			newEntity.setLastname(entity.getLastname());
			newEntity.setSalary(entity.getSalary());

			newEntity = repository.save(newEntity);
			return newEntity;
		} else {
			entity = repository.save(entity);
			return entity;
		}
	}

	public void deleteEmployeeById(Long id) throws RuntimeException {
		Optional<EmployeeEntity> employee = repository.findById(id);

		if (employee.isPresent()) {
			repository.deleteById(id);
		} else {
			throw new RuntimeException("No employee record exist for given id");
		}
	}

	public EmployeeEntity addEmployee(EmployeeEntity employee) {

		return repository.save(employee);
	}

	public EmployeeEntity findByName(String firstname) {
		return repository.findByName(firstname);
	}

	public List<EmployeeEntity> findByLastName(String lastname) {
		return repository.findByLastName(lastname);
	}
	public List<EmployeeEntity> findBySalary(double salary) {
		return repository.getEmployeeBySalary(salary);
	}
	
	public EmployeeEntity findByEmailId(String emailid) {
		return repository.findByEmailId(emailid);
	}

}
