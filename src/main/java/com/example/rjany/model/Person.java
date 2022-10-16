package com.example.rjany.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity //mark class as entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String Firstname ;
	private String LastName ;
	private String email ;
	private String phone ;

	

	


}
