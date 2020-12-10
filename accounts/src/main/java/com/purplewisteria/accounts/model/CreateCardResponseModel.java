package com.purplewisteria.accounts.model;

public class CreateCardResponseModel {
	
	
	private String cardType;
	private String cardCategory;
	private String cardName;
	private double WelcomeOffer;
	private double annualFee;
	private double foreignTransactionFee;
	private double airTravelCredit;
	private String travelPoints;
	private String diningPoints;
	private String purchasePoints;
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
		return WelcomeOffer;
	}
	public void setWelcomeOffer(double welcomeOffer) {
		WelcomeOffer = welcomeOffer;
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

}
