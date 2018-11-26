package com.mortgage.retailmortgage.dto;

public class RetailMortgageCheckParamDto {
	
	private double income;
	private int fixedInterestRatePeriod;
	private double loanValue;
	private double homeValue;
	private int tenure;
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public int getFixedInterestRatePeriod() {
		return fixedInterestRatePeriod;
	}
	public void setFixedInterestRatePeriod(int fixedInterestRatePeriod) {
		this.fixedInterestRatePeriod = fixedInterestRatePeriod;
	}
	public double getLoanValue() {
		return loanValue;
	}
	public void setLoanValue(double loanValue) {
		this.loanValue = loanValue;
	}
	public double getHomeValue() {
		return homeValue;
	}
	public void setHomeValue(double homeValue) {
		this.homeValue = homeValue;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	

}
