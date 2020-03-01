package com.epam.NewYearGifts;

public class DairyMilk extends Chocolates{
	public DairyMilk() {
		super();
	}
	public DairyMilk(int sweight) {
		setCWeight(sweight);
	}

	public int calculateWeight(int quantity, int weight) {
		return quantity * weight;
	}
}
