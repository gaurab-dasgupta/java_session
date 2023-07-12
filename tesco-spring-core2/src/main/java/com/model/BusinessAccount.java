package com.model;

public class BusinessAccount implements InterestCalculator{
	
	public BusinessAccount() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("from business account");
	}



	private int duration;
	private double roi;
	
	
	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public double getRoi() {
		return roi;
	}


	public void setRoi(double roi) {
		this.roi = roi;
	}

	

	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount * roi/duration;
	}

}
