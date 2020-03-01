package com.epam.NewYearGifts;

public abstract class Chocolates {
	int cweight;
	public void setCWeight(int weight) {
		this.cweight = weight;
	}
	public void getCWeight(int weight) {
		this.cweight = weight;
	}
	public abstract int calculateWeight(int quantity, int weight);

}
