package com.epam.NewYearGifts;

import java.util.*;

import com.epam.NewYearGifts.Candies;
import com.epam.NewYearGifts.Chocolates;
import com.epam.NewYearGifts.Sweets;

public class NewYearGiftBox {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantity = 0, weight = 0, totalNoOfSweets = 0, totalWeight = 0, GiftBoxWeight = 0;
        Map< String, Integer> hm =  new HashMap< String, Integer>();
		Sweets collectSweets;
		Chocolates collectChoco;
		boolean choose = true;
		char extraItems;
		while(choose) {
		System.out.println("Select your Favorite chocolates and sweets");
		System.out.println("1. Candies\n2. DairyMilk\n3. GoneMad\n4. Perk\n5. GulabJamun\n6. Laddoos\n7. SonPapidi");
		try {
			switch(sc.next().charAt(0)) {
			case '1':
				System.out.println("Enter the quantity Of Candies you want..");
				quantity = sc.nextInt();
				System.out.println("Enter the weight of the candies");
				weight = sc.nextInt();
				collectChoco = new Candies();
				totalWeight = collectChoco.calculateWeight(quantity, weight);
				GiftBoxWeight = GiftBoxWeight+totalWeight;
				totalNoOfSweets += quantity;
				hm.put("Candies", quantity);
				System.out.println("Total weight of candies is :" + totalWeight+"gramms"+"\nTotal weight of gift box is :"+GiftBoxWeight+"grams"+"\nDo you want to add more sweets? (y/n)");
				extraItems = sc.next().charAt(0);
				if(extraItems == 'y'|| extraItems == 'Y') {
					choose = true;
					break;
				}
				else {
					choose = false;
					System.out.println("Total weight of New Year Gift Box is :" + GiftBoxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalNoOfSweets);
					break;
				}
			case '2':
				System.out.println("Enter the quantity of Dairy Milks you want..");
				quantity = sc.nextInt();
				System.out.println("Enter the weight of the Dairy Milks");
				weight = sc.nextInt();
				collectChoco = new DairyMilk();
				totalWeight = collectChoco.calculateWeight(quantity, weight);
				GiftBoxWeight = GiftBoxWeight+totalWeight;
				totalNoOfSweets += quantity;
				hm.put("Dairy Milks", quantity);
				System.out.println("Total weight of Dairy Milks  :" + totalWeight+"gramms"+"\nTotal weight of gift box is :"+GiftBoxWeight+"grams"+"\nDo you want to add more sweets? (y/n)");
				extraItems = sc.next().charAt(0);
				if(extraItems == 'y'|| extraItems == 'Y') {
					choose = true;
					break;
				}
				else {
					choose = false;
					System.out.println("Total weight of New Year Gift Box is :" + GiftBoxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalNoOfSweets);
					break;
				}
			case '3':
				System.out.println("Enter the quantity of GoneMads you want..");
				quantity = sc.nextInt();
				System.out.println("Enter the weight of GoneMads");
				weight = sc.nextInt();
				collectChoco = new GoneMad();
				totalWeight = collectChoco.calculateWeight(quantity, weight);
				GiftBoxWeight = GiftBoxWeight+totalWeight;
				totalNoOfSweets += quantity;
				hm.put("GoneMads", quantity);
				System.out.println("Total weight of Gone Mads :" + totalWeight+"gramms"+"\nTotal weight of gift box is :"+GiftBoxWeight+"grams"+"\nDo you want to add more sweets? (y/n)");
				extraItems = sc.next().charAt(0);
				if(extraItems == 'y'|| extraItems == 'Y') {
					choose = true;
					break;
				}
				else {
					choose = false;
					System.out.println("Total weight of New Year Gift Box is :" + GiftBoxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalNoOfSweets);
					break;
				}
			case '4':
				System.out.println("Enter the quantity of perks you want..");
				quantity = sc.nextInt();
				System.out.println("Enter the weight of perks");
				weight = sc.nextInt();
				collectChoco = new Perk();
				totalWeight = collectChoco.calculateWeight(quantity, weight);
				GiftBoxWeight = GiftBoxWeight+totalWeight;
				totalNoOfSweets += quantity;
				hm.put("Perks", quantity);
				System.out.println("Total weight of Perks  :" + totalWeight+"gramms"+"\nTotal weight of gift box is :"+GiftBoxWeight+"grams"+"\nDo you want to add more sweets? (y/n)");
				extraItems = sc.next().charAt(0);
				if(extraItems == 'y'|| extraItems == 'Y') {
					choose = true;
					break;
				}
				else {
					choose = false;
					System.out.println("Total weight of New Year Gift Box is :" + GiftBoxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalNoOfSweets);
					break;
				}
			case '5':
				System.out.println("Enter the quantity of GulabJamun you want..");
				quantity = sc.nextInt();
				System.out.println("Enter the weight of GulabJamun");
				weight = sc.nextInt();
				collectSweets = new GulabJamun();
				totalWeight = collectSweets.calculateWeightS(quantity, weight);
				GiftBoxWeight = GiftBoxWeight+totalWeight;
				totalNoOfSweets += quantity;
				hm.put("Gulab Jamun", quantity);
				System.out.println("Total weight of GulabJamun is :" + totalWeight+"gramms"+"\nTotal weight of gift box is :"+GiftBoxWeight+"grams"+"\nDo you want to add more sweets? (y/n)");
				extraItems = sc.next().charAt(0);
				if(extraItems == 'y'|| extraItems == 'Y') {
					choose = true;
					break;
				}
				else {
					choose = false;
					System.out.println("Total weight of New Year Gift Box is :" + GiftBoxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalNoOfSweets);
					break;
				}
			case '6':
				System.out.println("Enter the quantity of Laddoos you want..");
				quantity = sc.nextInt();
				System.out.println("Enter the weight of Laddoos");
				weight = sc.nextInt();
				collectSweets = new Laddoos();
				totalWeight = collectSweets.calculateWeightS(quantity, weight);
				GiftBoxWeight = GiftBoxWeight+totalWeight;
				totalNoOfSweets += quantity;
				hm.put("Laddoos", quantity);
				System.out.println("Total weight of Laddoos is :" + totalWeight+"gramms"+"\nTotal weight of gift box is :"+GiftBoxWeight+"grams"+"\nDo you want to add more sweets? (y/n)");
				extraItems = sc.next().charAt(0);
				if(extraItems == 'y'|| extraItems == 'Y') {
					choose = true;
					break;
				}
				else {
					choose = false;
					System.out.println("Total weight of New Year Gift Box is :" + GiftBoxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalNoOfSweets);
					break;
				}
			case '7':
				System.out.println("Enter the quantity of SonPapidi you want..");
				quantity = sc.nextInt();
				System.out.println("Enter the weight of SonPapidi");
				weight = sc.nextInt();
				collectSweets = new SonPapidi();
				totalWeight = collectSweets.calculateWeightS(quantity, weight);
				GiftBoxWeight = GiftBoxWeight+totalWeight;
				totalNoOfSweets += quantity;
				hm.put("SonPapidi", quantity);
				System.out.println("Total weight of SonPapidi  :" + totalWeight+"gramms"+"\nTotal weight of gift box is :"+GiftBoxWeight+"grams"+"\nDo you want to add more sweets? (y/n)");
				
				extraItems = sc.next().charAt(0);
				if(extraItems == 'y'|| extraItems == 'Y') {
					choose = true;
					break;
				}
				else {
					choose = false;
					System.out.println("Total weight of New Year Gift Box is :" + GiftBoxWeight+"grams");
					System.out.println("Total number of sweets in the gift box are :" + totalNoOfSweets);
					break;
				}
			}
		}
			catch(Exception e) {
				System.out.println("Invalid option");
			}
	}

	
	System.out.println("The following Items are present in the Gift Box!!");
    Set< Map.Entry< String, Integer> > st = hm.entrySet(); 
    for (Map.Entry< String, Integer> me: st) 
    { 
        System.out.print(me.getKey()+", "); 
        System.out.println(me.getValue()); 
    }
    sc.close();
	}
}
