package com.purplewisteria.accounts.model;

public class CreateCheckingAccountResponseModel {
	
	 private String checkingAccountType;	
		private double minimumDeposit;
		private double maintenanceFee;
		private double welcomeBonus;
		private double paperStatementFee;
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
