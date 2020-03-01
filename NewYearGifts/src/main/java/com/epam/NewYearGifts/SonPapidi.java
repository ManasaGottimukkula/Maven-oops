package com.epam.NewYearGifts;

public class SonPapidi extends Sweets{
	public SonPapidi() {
		super();
	}
	public SonPapidi(int weight) {
		setSWeight(weight);
	}

@Override
public int calculateWeightS(int quantity, int weight) {
	// TODO Auto-generated method stub
	return quantity * weight;
}

}
