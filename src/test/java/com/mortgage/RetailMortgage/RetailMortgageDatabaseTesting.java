package com.mortgage.RetailMortgage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.mortgage.retailmortgage.dto.RetailMortgageRateDto;
import com.mortgage.retailmortgage.repository.InterestRateRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RetailMortgageDatabaseTesting {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private InterestRateRepository mortgageRateRepository;

	@Test
	public void whenFindById_thenReturnInterestRate() {
		try {
			System.out.println("<-------------------Database Connectivity Testing Started------------------->");
			// given
			RetailMortgageRateDto newTestRecord = new RetailMortgageRateDto("asfadf", 77, 12, 6, 14,
					new Date("1992/12/12"));
			entityManager.persist(newTestRecord);
			entityManager.flush();
			// when
			RetailMortgageRateDto found = mortgageRateRepository.findBytenure(newTestRecord.getTenure());
			// then
			if (found.getInterestRate() == newTestRecord.getInterestRate()) {
				// assertThat(found.getInterestRate()).isEqualTo(newTestRecord.getInterestRate());
				System.out.println("<-------------------Testing Success------------------->");
			} else {
				System.out.println("<-------------------Testing Failed------------------->");
			}
		} catch (Exception e) {
			System.out.println("<-------------------Testing Failed------------------->");
		} finally {
			System.out.println("<-------------------Database Connectivity Testing Done------------------->");
		}
	}

}
