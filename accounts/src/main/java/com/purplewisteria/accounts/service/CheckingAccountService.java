package com.purplewisteria.accounts.service;

import com.purplewisteria.accounts.model.CreateCardResponseModel;
import com.purplewisteria.accounts.shared.CheckingAccountDto;

public interface CheckingAccountService {
	
	CheckingAccountDto createCheckingAccount(CheckingAccountDto checkingAccountDto);
	
	Iterable <CheckingAccountDto> getCheckingAccounts();
	
	Iterable<CreateCardResponseModel> getCards(String checkingAccountId);
	
//	CreateCardResponseModel getCard(String checkingAccountId);

}
