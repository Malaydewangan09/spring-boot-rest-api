package com.example.rjany.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String fromEmail ;
    private String toEmail ;
    private String Subject ;
    private String EmailBody ;

}
