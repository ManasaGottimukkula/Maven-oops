package com.epam.NewYearGifts;

public class Perk extends Chocolates {
	public Perk() {
		super();
	}
	public Perk(int weight) {
		setCWeight(weight);
	}

	
	public int calculateWeight(int quantity, int weight) {
		return quantity * weight;
	}
	

}
