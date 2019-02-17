package com.polus.fibi.service;

import java.util.List;

import com.polus.fibi.model.Person;


public interface PersonService {
	
	/*
	 * Employee findById(int id);
	 * 
	 * void saveEmployee(Employee employee);
	 * 
	 * void updateEmployee(Employee employee);
	 * 
	 * void deleteEmployeeBySsn(String ssn);
	 */
 
    List<Person> findAllPersons(); 
     
	/*
	 * Employee findEmployeeBySsn(String ssn);
	 * 
	 * boolean isEmployeeSsnUnique(Integer id, String ssn);
	 */

}

