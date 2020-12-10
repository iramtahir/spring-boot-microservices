package com.purplewisteria.accounts.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.purplewisteria.accounts.data.CardsServiceFeignClient;
import com.purplewisteria.accounts.data.CheckingAccountEntity;
import com.purplewisteria.accounts.data.CheckingAccountRepository;
import com.purplewisteria.accounts.shared.CheckingAccountDto;
import com.purplewisteria.accounts.model.CreateCardResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class CheckingAccountServiceImpl implements CheckingAccountService {

	private CheckingAccountRepository checkingAccountRepository;
	private RestTemplate restTemplate;
	private CardsServiceFeignClient cardsServiceFeignClient;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	public CheckingAccountServiceImpl(CheckingAccountRepository checkingAccountRepository, RestTemplate restTemplate,
			                           CardsServiceFeignClient cardsServiceFeignClient) {
	
		this.checkingAccountRepository = checkingAccountRepository;
		this.restTemplate = restTemplate;
		this.cardsServiceFeignClient = cardsServiceFeignClient;
	}

	
	
	@Override
	public CheckingAccountDto createCheckingAccount(CheckingAccountDto checkingAccountDto) {
		
		 checkingAccountDto.setCheckingAccountId(UUID.randomUUID().toString());
		 
		   ModelMapper modelMapper = new ModelMapper(); 
		   modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		  
		   CheckingAccountEntity checkingAccountEntity = modelMapper.map(checkingAccountDto, CheckingAccountEntity.class);
		    checkingAccountEntity =       checkingAccountRepository.save(checkingAccountEntity);
		    
		       
		       
		       
		return checkingAccountDto;
	}

	
	
	@Override
	public Iterable<CheckingAccountDto> getCheckingAccounts() {

		Iterable <CheckingAccountDto> checkingAccountDtoList = new ArrayList<>();
		
		Iterable <CheckingAccountEntity> checkingAccountEntityList = checkingAccountRepository.findAll();
		
		 ModelMapper modelMapper = new ModelMapper(); 
		   modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		    checkingAccountDtoList = Arrays.asList(modelMapper.map(checkingAccountEntityList, CheckingAccountDto[].class));
		      
		return checkingAccountDtoList;
	}
	
	

	@Override
	public Iterable<CreateCardResponseModel> getCards(String checkingAccountId) {
		
		Iterable <CreateCardResponseModel> createCardResponseModelList = new ArrayList<>();
		  logger.info("Before Calling Cards Microservice");
		  createCardResponseModelList  = cardsServiceFeignClient.getCard(checkingAccountId); 
		logger.info("After Calling Cards Microservice");
		
		return createCardResponseModelList;
	}
	

}
