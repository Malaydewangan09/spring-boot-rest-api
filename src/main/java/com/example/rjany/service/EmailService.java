package com.example.rjany.service;

import com.example.rjany.model.Email;

import java.util.List;

public interface EmailService {

    Email saveEmail(Email email) ;

    int getAllEmail(String email);
}
