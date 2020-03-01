package com.epam.NewYearGifts;

import java.util.*;

public class NewYearGiftBox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Candies", 10);
		hm.put("DairyMilk", 40);
		hm.put("GoneMad", 5);
		hm.put("Perk", 10);
		hm.put("GulabJamun", 150);
		hm.put("Laddoos", 100);
		hm.put("SonPapidi", 50);
		if(hm.containsKey("Candies")) {
			Integer a = hm.get("Candies");
			System.out.println("Price of Candy ="+ a);
		}
		if(hm.containsKey("DairyMilk")) {
			Integer b = hm.get("DairyMilk");
			System.out.println("Price of DairyMilk ="+ b);
		}
		if(hm.containsKey("GoneMad")) {
			Integer c = hm.get("GoneMad");
			System.out.println("Price of GoneMad ="+ c);
		}
		if(hm.containsKey("Perk")) {
			Integer d = hm.get("Perk");
			System.out.println("Price of Perk ="+ d);
		}
		if(hm.containsKey("GulabJamun")) {
			Integer e = hm.get("GulabJamun");
			System.out.println("Price of GulabJamun sweet ="+ e);
		}
		if(hm.containsKey("Laddoos")) {
			Integer f = hm.get("Laddoos");
			System.out.println("Price of Laddoos ="+ f);
		}
		if(hm.containsKey("SonPapidi")) {
			Integer g = hm.get("SonPapidi");
			System.out.println("Price of SonPapidi sweet ="+ g);
		}
	}

}
