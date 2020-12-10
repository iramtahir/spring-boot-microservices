package com.purplewisteria.cards.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.purplewisteria.cards.data.CardEntity;
import com.purplewisteria.cards.data.CardRepository;
import com.purplewisteria.cards.shared.CardDto;

@Service
public class CardServiceImpl implements CardService {
	
	private CardRepository cardRepository;
	
	@Autowired
	public CardServiceImpl(CardRepository cardRepository) {
		this.cardRepository = cardRepository;
	}

	@Override
	public CardDto createCard(CardDto cardDto) {
		
		 cardDto.setCardId(UUID.randomUUID().toString());
		 
		   ModelMapper modelMapper = new ModelMapper(); 
		   modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		  
		   CardEntity cardEntity = modelMapper.map(cardDto, CardEntity.class);
		   cardEntity =  cardRepository.save(cardEntity);
		    
		return cardDto;
	}

	/*
	  Using ModelMapper framework for conversion from Entity objects to DTO objects in my views.
	 */
	@Override
	public Iterable <CardDto> getCards() {
		
		Iterable <CardDto> cardDtoList = new ArrayList<>();
				
		Iterable <CardEntity> cardEntityList = cardRepository.findAll();
		
		 ModelMapper modelMapper = new ModelMapper(); 
		   modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		    cardDtoList = Arrays.asList(modelMapper.map(cardEntityList, CardDto[].class));
		  return cardDtoList;
	}

	@Override
	public CardDto getCard(String checkingAccountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CardDto> findAllCardByCheckingAccountId(String checkingAccountId) {
	
		List <CardEntity> cardEntityList = new ArrayList<>();
		List <CardDto> cardDtoList = new ArrayList<>();
			
		 cardEntityList = cardRepository.findAllByCheckingAccountId(checkingAccountId);
		
		 ModelMapper modelMapper = new ModelMapper(); 
		   modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		   cardDtoList = Arrays.asList(modelMapper.map(cardEntityList, CardDto[].class));
		  return cardDtoList;
	
	}

	
}
