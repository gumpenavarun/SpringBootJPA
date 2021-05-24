package com.example.curd.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{
	@Query(value = "select * from employee_tbl e WHERE e.firstname = :firstname",nativeQuery = true)
	EmployeeEntity findByName(String firstname);
	
	@Query(value="select * from employee_tbl e where e.lastname= :lastname" ,nativeQuery = true)
	List<EmployeeEntity> findByLastName(String lastname);
	
	@Query(value="select * from employee_tbl e where e.emailid=:emailid",nativeQuery = true)
	EmployeeEntity findByEmailId(String emailid);
	
	@Query(value="select * from employee_tbl e where e.salary=:salary",nativeQuery = true)
	List<EmployeeEntity> getEmployeeBySalary(double salary);

}
