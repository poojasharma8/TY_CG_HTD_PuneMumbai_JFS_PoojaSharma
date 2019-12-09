package com.capgemini.springcore.beans;

public class MobileBean {

	private  String brand ;
	private String modelName ;
	private int price ;
	private MobileDisplayBean mobiledisplay;
	
	public MobileDisplayBean getMobiledisplay() {
		return mobiledisplay;
	}
	public void setMobiledisplay(MobileDisplayBean mobiledisplay) {
		this.mobiledisplay = mobiledisplay;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
