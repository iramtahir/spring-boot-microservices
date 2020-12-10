package com.purplewisteria.accounts.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purplewisteria.accounts.model.CreateCardResponseModel;
import com.purplewisteria.accounts.model.CreateCheckingAccountRequestModel;
import com.purplewisteria.accounts.model.CreateCheckingAccountResponseModel;
import com.purplewisteria.accounts.service.CheckingAccountService;
import com.purplewisteria.accounts.shared.CheckingAccountDto;

import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/checking")
public class CheckingAccountController {
	
	@Autowired
	private Environment env;
	
	private CheckingAccountService checkingAccountService;
	
	@Autowired
	public CheckingAccountController(CheckingAccountService checkingAccountService) {
		super();
		this.checkingAccountService = checkingAccountService;
	}

	@GetMapping("/status/check")
	public String status() {
		return "Accounts for students:  working on port" + env.getProperty("local.server.port");
	}
	
	@GetMapping(path="/contact")
	public String getContacts() {
		return "Tool Free Number & Email for Checking: " + env.getProperty("pw.banking.accounts.tollnumber") + ",  " +
				env.getProperty("pw.banking.accounts.email") +
				                                 ",  Working on port" + env.getProperty("local.server.port");
	}
	
	
	 // Implementing "Create Checking Account Response Model"
 	@PostMapping(path="/create",
 			                    consumes= { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
	                            produces= { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }
 			     )
 	public ResponseEntity<CreateCheckingAccountResponseModel> createCheckingAccount(@Valid @RequestBody CreateCheckingAccountRequestModel createAccountRequestModel) {
 		 
 		ModelMapper modelMapper = new ModelMapper(); 	
 		 modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
 		 
 		CheckingAccountDto checkingAccountDto = modelMapper.map( createAccountRequestModel, CheckingAccountDto.class); 		
 		 checkingAccountDto  = checkingAccountService.createCheckingAccount(checkingAccountDto);
 		           
   		CreateCheckingAccountResponseModel createCheckingAccountResponseModel = modelMapper.map(checkingAccountDto, CreateCheckingAccountResponseModel.class);
 		return ResponseEntity.status(HttpStatus.CREATED).body(createCheckingAccountResponseModel);
 	}
 	
 	@GetMapping (path="/accounts")
	 public Iterable<CreateCheckingAccountResponseModel> getAllCheckingAccounts( ) {  
		
		Iterable <CreateCheckingAccountResponseModel> createCheckingAccountResponseModelList = new ArrayList<>();
		
		Iterable <CheckingAccountDto> checkingAccountDtoList = checkingAccountService.getCheckingAccounts();
		
		 ModelMapper modelMapper = new ModelMapper(); 
		   modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		   
		   
		   createCheckingAccountResponseModelList = Arrays.asList(modelMapper.map(checkingAccountDtoList, CreateCheckingAccountResponseModel[].class));
		 return createCheckingAccountResponseModelList;
	 }
 	
 	/*
 	@GetMapping (path="/cards")
	 public Iterable<CreateCardResponseModel> getAllCards( ) {  
		
		Iterable <CreateCardResponseModel> createCardResponseModelList = new ArrayList<>();
		
		createCardResponseModelList = checkingAccountService.getCards();
		
		 return createCardResponseModelList;
	 }
 	*/
 	
 	@GetMapping (path="/cards/{checkingAccountId}")
	 public Iterable<CreateCardResponseModel> getCard( @PathVariable String checkingAccountId) {  
 		
 		Iterable <CreateCardResponseModel> createCardResponseModelList = new ArrayList<>();
		 createCardResponseModelList= checkingAccountService.getCards(checkingAccountId);
		
		 return createCardResponseModelList;
	 }
 	
 	
}
