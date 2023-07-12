package coms.service;

import com.model.InterestCalculator;

public class BankingService {

	
	private InterestCalculator ic;

	public InterestCalculator getIc() {
		return ic;
	}

	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	
	public BankingService() {
		super();
	System.out.println("default msg from banking service");
	}

	public double calculate (double amount) {
		return ic.calculate(amount);
	}
	
	public void init() {
		System.out.println("service being inittialized ...");
		
	}
	
	public void destroy() {
		System.out.println("service being destroyed ...");
		
	}
	
}
