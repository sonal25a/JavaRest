package com.mortgage.retailmortgage.utill;

import com.mortgage.retailmortgage.dto.RetailMortgageCheckParamDto;
import com.mortgage.retailmortgage.dto.RetailMortgageEligibleCheckDto;
import com.mortgage.retailmortgage.dto.RetailMortgageRateDto;

public class RetailMortgageUtill {
	
	public static RetailMortgageEligibleCheckDto emiCalculator(RetailMortgageCheckParamDto retailMortgageCheckParamDto,RetailMortgageRateDto retailMortgageRateDto){
		RetailMortgageEligibleCheckDto retailMortgageEligibleCheckDto = new RetailMortgageEligibleCheckDto();
		double principal = retailMortgageCheckParamDto.getLoanValue();
		double rate = 0.0;
		rate = retailMortgageRateDto.getInterestRate();
		double monthlyRate =  rate/(12*100);
		int tenureMonths = (retailMortgageCheckParamDto.getTenure()) * 12;
		 double emi = principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths) / (Math.pow(1 +monthlyRate, tenureMonths) - 1);
		 double interestPaid = (emi *tenureMonths) - principal;
		retailMortgageEligibleCheckDto.setEligible(true);
		//retailMortgageEligibleCheckDto.setMonthlyCost(Math.round(emi));
		//emi = Math.round(emi*100.0)/100.0;
		emi = (new Long(Math.round(emi)).doubleValue());
		retailMortgageEligibleCheckDto.setMonthlyCost(emi);
		retailMortgageEligibleCheckDto.setPrincipal(principal);
		interestPaid = (new Long(Math.round(interestPaid)).doubleValue());
		//interestPaid = Math.round(interestPaid*100.0)/100.0;
		retailMortgageEligibleCheckDto.setInterest(interestPaid);
		
		return retailMortgageEligibleCheckDto;
		
	}

}
