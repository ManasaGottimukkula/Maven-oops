package com.epam.NewYearGifts;

public class GulabJamun extends Sweets{

		public GulabJamun() {
			super();
		}
		public GulabJamun(int weight) {
			setSWeight(weight);
		}

	@Override
	public int calculateWeightS(int quantity, int weight) {
		// TODO Auto-generated method stub
		return quantity * weight;
	}
	

}
