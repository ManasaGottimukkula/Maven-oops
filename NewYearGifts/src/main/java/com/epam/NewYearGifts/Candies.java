package com.epam.NewYearGifts;

public class Candies extends Chocolates{
	public Candies() {
		super();
	}
	public Candies(int weight) {
		setCWeight(weight);
	}
	@Override
	public int calculateWeight(int quantity, int weight) {
		// TODO Auto-generated method stub
		return quantity * weight;
	}
	

}
