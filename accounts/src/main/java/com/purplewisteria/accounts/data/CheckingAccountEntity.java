package com.purplewisteria.accounts.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="checking")
public class CheckingAccountEntity {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false, length=100)
    private String checkingAccountType;	
	
	@Column(nullable=false, length=5)	
	private double minimumDeposit;
    
	@Column(nullable=false, length=5)
	private double maintenanceFee;
	
	@Column(nullable=false, length=5)
	private double welcomeBonus;
	
	@Column(nullable=false, length=5)
	private double paperStatementFee;
	
	@Column(nullable=false, length=5)
	private double cashWithdrawalFee;
	
	@Column(nullable=false, unique=true)
	private String checkingAccountId;  
	
	public String getCheckingAccountId() {
		return checkingAccountId;
	}
	public void setCheckingAccountId(String checkingAccountId) {
		this.checkingAccountId = checkingAccountId;
	}
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
	
	

}
