package com.user;

public class Car {
	private int id;
	private String type;
	private String model;
	private String productionyear;
	private String rentingpriceperday;
	
	public Car(int id, String type, String model, String productionyear, String rentingpriceperday) {
		super();
		this.id = id;
		this.type = type;
		this.model = model;
		this.productionyear = productionyear;
		this.rentingpriceperday = rentingpriceperday;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getModel() {
		return model;
	}

	public String getProductionyear() {
		return productionyear;
	}

	public String getRentingpriceperday() {
		return rentingpriceperday;
	}
	
}
