package com.epam.NewYearGifts;

public class Laddoos extends Sweets {
	public Laddoos() {
		super();
	}
	public Laddoos(int weight) {
		setSWeight(weight);
	}

@Override
public int calculateWeightS(int quantity, int weight) {
	// TODO Auto-generated method stub
	return quantity * weight;
}
}
