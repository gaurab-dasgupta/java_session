package com.model;

public class FDACalculator implements InterestCalculator {

	private int duration;
	private double roi;
	


	public FDACalculator(int duration, double roi) {
		super();
		this.duration = duration;
		this.roi = roi;
	}


	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount * roi/duration;
	}
	
	

}
