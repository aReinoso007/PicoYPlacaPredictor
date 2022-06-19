package com.stackbuilders.entity;

public class Query {
	
	private String plateNumber;
	private String date;
	private String hour;
	
	public Query(String plateNumber, String date, String hour) {
		super();
		this.plateNumber = plateNumber;
		this.date = date;
		this.hour = hour;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	
}
