package com.stackbuilders.entity;

import java.time.LocalDateTime;

public class Query {
	
	private String plateNumber;
	private LocalDateTime dateHour;
	
	public Query() {
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public LocalDateTime getDateHour() {
		return dateHour;
	}

	public void setDateHour(LocalDateTime dateHour) {
		this.dateHour = dateHour;
	}

	@Override
	public String toString() {
		return "Query [plateNumber=" + plateNumber + ", dateHour=" + dateHour + "]";
	}
	
}
