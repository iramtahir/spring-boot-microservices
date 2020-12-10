package com.purplewisteria.cards.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cards")
public class CardEntity {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false, length=20)
	private String cardType;
	
	@Column(nullable=false, length=50)
	private String cardCategory;
	
	@Column(nullable=false, length=120)
	private String cardName;
	
	@Column(nullable=false, length=5)
	private double WelcomeOffer;
	@Column(nullable=false, length=4)
	private double annualFee;
	@Column(nullable=false, length=3)
	private double foreignTransactionFee;
	@Column(nullable=false, length=5)
	private double airTravelCredit;
	@Column(nullable=false, length=5)
	private String travelPoints;
	@Column(nullable=false, length=5)
	private String diningPoints;
	@Column(nullable=false, length=5)
	private String purchasePoints;
	
	@Column(nullable=false, unique=true)
	private String cardId;
	
	@Column(nullable=false)
	private String checkingAccountId;
	
	public String getCheckingAccountId() {
		return checkingAccountId;
	}
	public void setCheckingAccountId(String checkingAccountId) {
		this.checkingAccountId = checkingAccountId;
	}

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
