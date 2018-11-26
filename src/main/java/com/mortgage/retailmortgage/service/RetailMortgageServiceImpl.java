package com.mortgage.retailmortgage.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mortgage.retailmortgage.dto.RetailMortgageCheckParamDto;
import com.mortgage.retailmortgage.dto.RetailMortgageEligibleCheckDto;
import com.mortgage.retailmortgage.dto.RetailMortgageRateDto;
import com.mortgage.retailmortgage.repository.InterestRateRepository;
import com.mortgage.retailmortgage.utill.RetailMortgageConstants;
import com.mortgage.retailmortgage.utill.RetailMortgageUtill;

@Component
public class RetailMortgageServiceImpl implements RetailMortgageService  {
	

	@Autowired
	private InterestRateRepository interestRateRepository;

	@Override
	public List<RetailMortgageRateDto> getIntrestRate() {
		List<RetailMortgageRateDto> retailMortgageRateList = new ArrayList<RetailMortgageRateDto>();
		retailMortgageRateList = interestRateRepository.findAll();
		return retailMortgageRateList;
	}

	@Override
	public RetailMortgageEligibleCheckDto getMonthlyCostDetails(RetailMortgageCheckParamDto retailMortgageCheckParamDto) {
		// TODO Auto-generated method stub
		RetailMortgageRateDto retailMortgageRate=null;
		int tenure = retailMortgageCheckParamDto.getTenure();
		System.out.println("tenure :: "+tenure);
		if (tenure > 0) {

			if (tenure <= 5) {
				retailMortgageRate = interestRateRepository.findById(RetailMortgageConstants.TENURE_5_YEARS);
			} else if (tenure > 5 && tenure <= 10) {
				retailMortgageRate = interestRateRepository.findById(RetailMortgageConstants.TENURE_10_YEARS);
			} else if (tenure > 10 && tenure <= 15) {
				retailMortgageRate = interestRateRepository.findById(RetailMortgageConstants.TENURE_15_YEARS);
			} else if (tenure > 15 && tenure <= 20) {
				retailMortgageRate = interestRateRepository.findById(RetailMortgageConstants.TENURE_20_YEARS);
			} else if (tenure > 20 && tenure <= 25) {
				retailMortgageRate = interestRateRepository.findById(RetailMortgageConstants.TENURE_25_YEARS);
			}
			System.out.println("Interest rate DTO :: "+retailMortgageRate.toString());
			System.out.println("Interest Rate :: "+retailMortgageRate.getInterestRate());
			
		}
		
		
		return RetailMortgageUtill.emiCalculator(retailMortgageCheckParamDto, retailMortgageRate);
	}

}
