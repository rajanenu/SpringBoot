package com.springsecurity.demo.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.springsecurity.demo.model.ConfirmationToken;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {
	ConfirmationToken findByConfirmationToken(String confirmationToken);
}
