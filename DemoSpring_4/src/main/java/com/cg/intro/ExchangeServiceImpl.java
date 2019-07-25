package com.cg.intro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("exchangeService")
public class ExchangeServiceImpl implements ExchangeService {
	@Value("44.7")
	private double exchangeRate;
	
	public ExchangeServiceImpl(double exchangeRate) {
		System.out.println("ExchangeServiceImpl()");
		this.exchangeRate = exchangeRate;
	}
	public double getExchangeRate() {
		System.out.println("getExchangeRate()");
		return exchangeRate;
	}
}
