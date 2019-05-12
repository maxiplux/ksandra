package com.juanfrancisco.ksandra.repositories;

import com.juanfrancisco.ksandra.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

}