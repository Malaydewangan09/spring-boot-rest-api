package com.example.rjany.service;

import java.util.List;

import com.example.rjany.model.Person;
import com.example.rjany.model.Person;

public interface PersonService {
	
	List<Person> getAllPerson();
	Person getPersonById(Long id);
	Person savePerson(Person Person);

	

}
