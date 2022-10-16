package com.example.rjany.repository;

import com.example.rjany.model.Person;
import org.springframework.data.repository.CrudRepository;



public interface PersonRepository extends CrudRepository<Person, Long> {


}
