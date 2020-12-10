package com.purplewisteria.cards.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purplewisteria.cards.model.CreateCardRequestModel;
import com.purplewisteria.cards.model.CreateCardResponseModel;
import com.purplewisteria.cards.service.CardService;
import com.purplewisteria.cards.shared.CardDto;

@RestController
@RequestMapping("/cardService")
public class CardController {
	
	@Autowired
	Environment env;
	private CardService cardService;
	
	@Autowired
	public CardController(CardService cardService) {
		this.cardService = cardService;
	}

	@GetMapping("/status/check")
	public String status() {
		return "Credit Card Details:  working on port" + env.getProperty("local.server.port");
	}

	
	@GetMapping("/contact")
	public String getContacts() {
		return "Tool Free Number & Email for Cards: " + env.getProperty("pw.banking.cards.tollnumber") + ",  " +
				env.getProperty("pw.banking.cards.email") +
				                                 ",  Working on port" + env.getProperty("local.server.port");
	}
	
	
	 // Implementing "Create Checking Account Response Model"
 	@PostMapping(path="/create",
 			                    consumes= { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
	                            produces= { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }
 			     )
 	public ResponseEntity<CreateCardResponseModel> createCard(@Valid @RequestBody CreateCardRequestModel createCardRequestModel) {
 		 
 		ModelMapper modelMapper = new ModelMapper(); 	
 		 modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
 		 
 		CardDto cardDto = modelMapper.map( createCardRequestModel, CardDto.class); 		
 		 cardDto  = cardService.createCard(cardDto);
 		           
   		CreateCardResponseModel createCardResponseModel = modelMapper.map(cardDto, CreateCardResponseModel.class);
 		return ResponseEntity.status(HttpStatus.CREATED).body(createCardResponseModel);
 	}
 	
 	
 	
 	@GetMapping (path="/cards")
	 public Iterable<CreateCardResponseModel> getAllCards( ) {  
		
 		Iterable <CreateCardResponseModel> createCardResponseModelList = new ArrayList<>();
		
		Iterable <CardDto> cardDtoList = cardService.getCards();
		
		 ModelMapper modelMapper = new ModelMapper(); 
		   modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		   
		   
		   createCardResponseModelList = Arrays.asList(modelMapper.map(cardDtoList, CreateCardResponseModel[].class));
		 return createCardResponseModelList;
	 }
	
 	

 	@GetMapping (path="/cards/{checkingAccountId}")
	 public Iterable<CreateCardResponseModel> getCard( @PathVariable String checkingAccountId ) {  
 		
 		Iterable <CreateCardResponseModel> createCardResponseModelList = new ArrayList<>();
 		List <CardDto> cardDtoList = new ArrayList<>();
 		
        cardDtoList = cardService.findAllCardByCheckingAccountId(checkingAccountId);
		
		 ModelMapper modelMapper = new ModelMapper(); 
		   modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		   
		   
		   createCardResponseModelList = Arrays.asList(modelMapper.map(cardDtoList, CreateCardResponseModel[].class));
		 return createCardResponseModelList;
	 }
	
}
