package com.polus.fibi.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.polus.fibi.model.Person;

import javax.persistence.criteria.CriteriaQuery;



@Repository("personDao")
public class PersonDAOImpl extends AbstractDAO<Integer, Person> implements PersonDAO {


	public void deletePersonBySsn(String ssn) {
		Query query = getSession().createSQLQuery("delete from Person where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
	}


	public Person findById(int id) {
		return getByKey(id);
	}


	public void savePerson(Person person) {
		persist(person);
	}


	public List<Person> findAllPersons() {
		//Criteria criteria = createEntityCriteria();
		List<Person> list = getSession().createQuery("from Person").list();

        return list;
	}


	public Person findPersonBySsn(String ssn) {
		Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("ssn", ssn));
        return (Person) criteria.uniqueResult();
	}

}
