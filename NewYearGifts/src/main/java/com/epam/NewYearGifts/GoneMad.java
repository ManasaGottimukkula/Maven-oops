package com.epam.NewYearGifts;

public class GoneMad extends Chocolates{
	public GoneMad() {
		super();
	}
	public GoneMad(int weight) {
		setCWeight(weight);
	}

	
	public int calculateWeight(int quantity, int weight) {
		return quantity * weight;
	}
	

}
