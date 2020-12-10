package com.purplewisteria.cards.service;
import java.util.List;

import com.purplewisteria.cards.data.CardEntity;
import com.purplewisteria.cards.shared.CardDto;

public interface CardService {
	
	CardDto createCard(CardDto cardDto);
	
	Iterable <CardDto> getCards();
	
	  CardDto getCard(String checkingAccountId);
	  
	  List <CardDto> findAllCardByCheckingAccountId (String checkingAccountId);

}
