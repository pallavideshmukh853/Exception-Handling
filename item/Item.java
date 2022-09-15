package com.item;

import java.util.Scanner;

public class Item {

	String itemname;
	int price;
	//int quantiyofitem;
	 static   int maximumitem = 10;
	private Itembought itbought;
	
	public String getItemname() {
		return itemname;
	}


	public void setItemname(String itemname) {
		this.itemname = itemname;
		
	}
	
public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


public Itembought getItbought() {
		return itbought;
	}


	public void setItbought(Itembought itbought) {
		this.itbought = itbought;
	}


public Item(String itemname, int price, Itembought itbought) {
		super();
		this.itemname = itemname;
		this.price = price;
		//this.quantiyofitem = quantiyofitem;
		this.itbought = itbought;
	}


public static void main(String[] args) {
	int itemid,itemqty;
	Item[] itd = new Item[5];
	Scanner sc = new Scanner(System.in);

for(int i = 0;i<5;i++) {
	System.out.println("Enter the Itemname");
	String itemname = sc.next();
	System.out.println("enter the itemid");
	itemid = sc.nextInt();
	System.out.println("enter the itemqty");
	itemqty=sc.nextInt();
	System.out.println("enter the price");
	int price = sc.nextInt();
	
	itd[i] = new Item(itemname,price,new Itembought(itemid,itemqty));

try {
	if(itemqty>maximumitem) {
	 throw new ItemPurchaseLimitExceedexception("item purchase limit exceed");
}
}
	catch(ItemPurchaseLimitExceedexception e) {
		e.printStackTrace();

	}
try {
if(price>0 && maximumitem>0) {
	throw new ItemPurchaseLimitExceedexception("price and maximumitem should be greater than 0");
}
}
    catch(ItemPurchaseLimitExceedexception r) {
		r.printStackTrace();

}
}
}
}