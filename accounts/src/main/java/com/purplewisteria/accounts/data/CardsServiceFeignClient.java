package com.purplewisteria.accounts.data;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.purplewisteria.accounts.model.CreateCardResponseModel;

@FeignClient(name="cards")
public interface CardsServiceFeignClient {
	
	@GetMapping ("/cardService/cards/{checkingAccountId}")
	 public Iterable<CreateCardResponseModel> getCard(@PathVariable String checkingAccountId);

}
