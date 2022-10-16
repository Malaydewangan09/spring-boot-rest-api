package com.example.rjany.repository;

import com.example.rjany.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmailRepository extends JpaRepository<Email , Long> {

    List<Email> findAllByFromEmail(String email);
}
