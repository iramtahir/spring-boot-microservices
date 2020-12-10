package com.purplewisteria.accounts.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateCheckingAccountRequestModel {
	
	@NotNull(message="Checking Account Type cannot be null")
	@Size(min=2, message="Checking Account Type must not be less than two chars.")
	private String checkingAccountType;
	
	@NotNull(message="Minimum Deposit cannot be null")
	private double minimumDeposit;
	
	@NotNull(message="Maintenance Fee cannot be null")
	private double maintenanceFee;
	
	@NotNull(message="Welcome Bonus cannot be null")
	private double welcomeBonus;
	
	@NotNull(message="Paper Statement Fee cannot be null")
	private double paperStatementFee;
	
	@NotNull(message="Cash Withdrawal Fee cannot be null")
	private double cashWithdrawalFee;
	
	private String checkingAccountId; 
	
	public String getCheckingAccountType() {
		return checkingAccountType;
	}
	public void setCheckingAccountType(String checkingAccountType) {
		this.checkingAccountType = checkingAccountType;
	}
	public double getMinimumDeposit() {
		return minimumDeposit;
	}
	public void setMinimumDeposit(double minimumDeposit) {
		this.minimumDeposit = minimumDeposit;
	}
	public double getMaintenanceFee() {
		return maintenanceFee;
	}
	public void setMaintenanceFee(double maintenanceFee) {
		this.maintenanceFee = maintenanceFee;
	}
	public double getWelcomeBonus() {
		return welcomeBonus;
	}
	public void setWelcomeBonus(double welcomeBonus) {
		this.welcomeBonus = welcomeBonus;
	}
	public double getPaperStatementFee() {
		return paperStatementFee;
	}
	public void setPaperStatementFee(double paperStatementFee) {
		this.paperStatementFee = paperStatementFee;
	}
	public double getCashWithdrawalFee() {
		return cashWithdrawalFee;
	}
	public void setCashWithdrawalFee(double cashWithdrawalFee) {
		this.cashWithdrawalFee = cashWithdrawalFee;
	}
	public String getCheckingAccountId() {
		return checkingAccountId;
	}
	public void setCheckingAccountId(String checkingAccountId) {
		this.checkingAccountId = checkingAccountId;
	}
	
	
}
