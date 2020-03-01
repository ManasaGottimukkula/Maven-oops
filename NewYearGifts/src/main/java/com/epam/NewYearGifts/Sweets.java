package com.epam.NewYearGifts;

public abstract class Sweets {
	int sweight;
	public void setSWeight(int weight) {
		this.sweight = weight;
	}
	public void getSWeight(int weight) {
		this.sweight = weight;
	}
	public abstract int calculateWeightS(int quantity, int weight);

}
