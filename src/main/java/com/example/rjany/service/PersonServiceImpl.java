package com.example.rjany.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rjany.model.Person;
import com.example.rjany.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired //inject repository dependency
	PersonRepository PersonRepository;
	
	@Override
	public Person savePerson(Person Person) {
		return PersonRepository.save(Person); //save Person
	}
	
	@Override
	public Person getPersonById(Long id) {
		Optional<Person> Person = PersonRepository.findById(id);
		if(Person.isPresent()) return Person.get();
		return null;
	}

	@Override
	public List<Person> getAllPerson() {
		List<Person> Persons = new ArrayList<Person>(); //create list of Persons variable
		PersonRepository.findAll().forEach(Person ->Persons.add(Person)); // keep each Person in Persons list
		return Persons;
	}
	



}
