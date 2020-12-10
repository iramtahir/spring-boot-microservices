package com.purplewisteria.cards.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateCardRequestModel {
	
	@NotNull(message="Card Type cannot be null")
	@Size(min=2, message="Card Type must not be less than two chars.")
	private String cardType;
	
	@NotNull(message="Card Category cannot be null")
	@Size(min=2, message="Card Category must not be less than two chars.")
	private String cardCategory;
	
	@NotNull(message="Card Name cannot be null")
	private String cardName;
	
	@NotNull(message="Welcome Offer cannot be null")
	private double welcomeOffer;
	
	@NotNull(message="Annual Fee cannot be null")
	private double annualFee;
	
	@NotNull(message="Foreign Transaction Fee cannot be null")
	private double foreignTransactionFee;
	
	@NotNull(message="Air Travel Credit cannot be null")
	private double airTravelCredit;
	
	@NotNull(message="Travel Points cannot be null")
	private String travelPoints;
	
	@NotNull(message="Dining Points cannot be null")
	private String diningPoints;
	
	@NotNull(message="Purchase Points cannot be null")
	private String purchasePoints;
	
	@NotNull(message="Checking Account Id cannot be null")
	private String checkingAccountId;
	
	private String cardId;
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardCategory() {
		return cardCategory;
	}
	public void setCardCategory(String cardCategory) {
		this.cardCategory = cardCategory;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public double getWelcomeOffer() {
		return welcomeOffer;
	}
	public void setWelcomeOffer(double welcomeOffer) {
		this.welcomeOffer = welcomeOffer;
	}
	public double getAnnualFee() {
		return annualFee;
	}
	public void setAnnualFee(double annualFee) {
		this.annualFee = annualFee;
	}
	public double getForeignTransactionFee() {
		return foreignTransactionFee;
	}
	public void setForeignTransactionFee(double foreignTransactionFee) {
		this.foreignTransactionFee = foreignTransactionFee;
	}
	public double getAirTravelCredit() {
		return airTravelCredit;
	}
	public void setAirTravelCredit(double airTravelCredit) {
		this.airTravelCredit = airTravelCredit;
	}
	public String getTravelPoints() {
		return travelPoints;
	}
	public void setTravelPoints(String travelPoints) {
		this.travelPoints = travelPoints;
	}
	public String getDiningPoints() {
		return diningPoints;
	}
	public void setDiningPoints(String diningPoints) {
		this.diningPoints = diningPoints;
	}
	public String getPurchasePoints() {
		return purchasePoints;
	}
	public void setPurchasePoints(String purchasePoints) {
		this.purchasePoints = purchasePoints;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCheckingAccountId() {
		return checkingAccountId;
	}
	public void setCheckingAccountId(String checkingAccountId) {
		this.checkingAccountId = checkingAccountId;
	}
	
}
