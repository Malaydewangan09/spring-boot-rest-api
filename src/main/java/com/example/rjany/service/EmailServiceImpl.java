package com.example.rjany.service;
import com.example.rjany.model.Email;
import com.example.rjany.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmailServiceImpl implements EmailService {

@Autowired
EmailRepository emailRepository ;

    @Override
    public Email saveEmail(Email email) {

        return emailRepository.save(email);
    }

    @Override
    public int getAllEmail(String email) {

        List<Email> list = emailRepository.findAllByFromEmail(email);
        return list.size();

    }


}

