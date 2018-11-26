package com.mortgage.retailmortgage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mortgage.retailmortgage.dto.RetailMortgageCheckParamDto;
import com.mortgage.retailmortgage.dto.RetailMortgageEligibleCheckDto;
import com.mortgage.retailmortgage.dto.RetailMortgageRateDto;
import com.mortgage.retailmortgage.service.RetailMortgageService;
import com.mortgage.retailmortgage.utill.RetailMortgageUtill;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/mortgage")
public class MortgageController {
	
	@Autowired
	RetailMortgageService retailMortgageService;
	
	@RequestMapping("/interestRate")
	//public RetailMortgageRateDto calculateMortgage(@RequestParam(value="fixedInterestRatePeriod") String fixedInterestRatePeriod) {
	//public List<RetailMortgageRateDto> calculateMortgage(@RequestBody RetailMortgageRateDto retailMortgageRateDto) {
	public List<RetailMortgageRateDto> calculateMortgage() {
		//return "Retail Mortgage App";
		//System.out.println("retailMortgageRateDto :: "+retailMortgageRateDto);
		return retailMortgageService.getIntrestRate();
//		System.out.println("fixedInterestRatePeriod :: "+fixedInterestRatePeriod);
//		return new RetailMortgageRateDto();
	}
	
	@RequestMapping("/eligibility")
	public RetailMortgageEligibleCheckDto getMonthlyCostDetails(@RequestBody RetailMortgageCheckParamDto retailMortgageCheckParamDto) {
		System.out.println("retailMortgageCheckParamDto :: "+retailMortgageCheckParamDto.getLoanValue());
		return retailMortgageService.getMonthlyCostDetails(retailMortgageCheckParamDto);
	}
}
