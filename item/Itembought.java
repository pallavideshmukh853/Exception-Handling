package com.item;

public class Itembought {

	private int itemid;
	private int itemqty;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getItemqty() {
		return itemqty;
	}
	public void setItemqty(int itemqty) {
		this.itemqty = itemqty;
	}
	public Itembought(int itemid, int itemqty) {
		super();
		this.itemid = itemid;
		this.itemqty = itemqty;
	}
	
}
