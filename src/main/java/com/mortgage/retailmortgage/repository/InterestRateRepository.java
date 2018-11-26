package com.mortgage.retailmortgage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mortgage.retailmortgage.dto.RetailMortgageRateDto;

@Repository
public interface InterestRateRepository extends JpaRepository<RetailMortgageRateDto, Long>{

	public RetailMortgageRateDto findById(long id);
	public RetailMortgageRateDto findBytenure(int tenure);
}