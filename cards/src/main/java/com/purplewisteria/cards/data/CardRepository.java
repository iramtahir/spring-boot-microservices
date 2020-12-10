package com.purplewisteria.cards.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.purplewisteria.cards.shared.CardDto;

public interface CardRepository extends CrudRepository<CardEntity, Long> {
	
//	CardEntity findByCheckingAccountId(String checkingAccountId);
	
	List <CardEntity> findAllByCheckingAccountId (String checkingAccountId);

}
