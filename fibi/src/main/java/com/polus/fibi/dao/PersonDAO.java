package com.polus.fibi.dao;

import java.util.List;

import com.polus.fibi.model.Person;




public interface PersonDAO {

	Person findById(int id);
	 
    void savePerson(Person person);
     
    void deletePersonBySsn(String ssn);
     
    List<Person> findAllPersons();
 
    Person findPersonBySsn(String ssn);
}

