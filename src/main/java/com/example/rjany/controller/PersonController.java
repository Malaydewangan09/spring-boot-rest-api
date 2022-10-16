package com.example.rjany.controller;

import java.util.List;

import com.example.rjany.model.Email;
import com.example.rjany.service.EmailService;
import com.example.rjany.service.EmailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.rjany.model.Person;
import com.example.rjany.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService PersonService;

	@Autowired
	EmailService EmailService ;
	
	@PostMapping("/user")
	public Person savePerson(@RequestBody Person Person) {
		return PersonService.savePerson(Person);
	}
	
	@GetMapping("/user/{id}")
	public Person getPerson(@PathVariable("id") Long id) {
		return PersonService.getPersonById(id);
	}
	
	@GetMapping("/users")
	public List<Person> getAllPerson(){
	 	return PersonService.getAllPerson();
	}
	
	@PostMapping("/email")
	public Email updatePerson(@RequestBody Email email) {
		return EmailService.saveEmail(email);
	}


	@GetMapping("/emails/count/")
	public int getEmail(@RequestParam Long user){
		Person person =  PersonService.getPersonById(user);
		String email = person.getEmail() ;


		return EmailService.getAllEmail(email) ;



	}



}
