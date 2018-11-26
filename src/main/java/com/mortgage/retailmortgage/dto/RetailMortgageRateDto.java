package com.mortgage.retailmortgage.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MORTGAGE_RATE")
public class RetailMortgageRateDto {
	
	@Id
	@Column(name = "id", updatable = false, nullable = false)
	private long id;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "tenure")
	private int tenure;
	
	@Column(name = "fixedinterestrateperiod",nullable = false)
	private int fixedInterestRatePeriod;
	
	@Column(name = "interestrate",nullable = false)
	private int interestRate;
	
	@Column(name = "lastupdate",nullable = false)
	private Date lastUpdate;
	
	public RetailMortgageRateDto(String description, long id, int tenure, int fixedInterestRatePeriod, int interestRate, Date lastUpdate) {
		// TODO Auto-generated constructor stub
		this.id =id;
		this.description = description;
		this.tenure = tenure;
		this.fixedInterestRatePeriod = fixedInterestRatePeriod;
		this.interestRate = interestRate;
		this.lastUpdate = lastUpdate;
	}
	public RetailMortgageRateDto() {
		
	}
	public int getFixedInterestRatePeriod() {
		return fixedInterestRatePeriod;
	}
	public void setFixedInterestRatePeriod(int fixedInterestRatePeriod) {
		this.fixedInterestRatePeriod = fixedInterestRatePeriod;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
