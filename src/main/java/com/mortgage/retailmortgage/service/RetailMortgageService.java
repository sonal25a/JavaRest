package com.mortgage.retailmortgage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mortgage.retailmortgage.dto.RetailMortgageCheckParamDto;
import com.mortgage.retailmortgage.dto.RetailMortgageEligibleCheckDto;
import com.mortgage.retailmortgage.dto.RetailMortgageRateDto;

@Service
public interface RetailMortgageService {
	
	public List<RetailMortgageRateDto> getIntrestRate();
	public RetailMortgageEligibleCheckDto getMonthlyCostDetails(RetailMortgageCheckParamDto retailMortgageCheckParamDto);

}
