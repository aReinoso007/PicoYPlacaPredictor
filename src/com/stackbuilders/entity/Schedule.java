package com.stackbuilders.entity;



public class Schedule {
		
	private String startingHour;
	private String endingHour;
	
	public Schedule(String startingHour, String endingHour) {
		super();
		this.startingHour = startingHour;
		this.endingHour = endingHour;
	}
	public String getStartingHour() {
		return startingHour;
	}
	public void setStartingHour(String startingHour) {
		this.startingHour = startingHour;
	}
	public String getEndingHour() {
		return endingHour;
	}
	public void setEndingHour(String endingHour) {
		this.endingHour = endingHour;
	}
	@Override
	public String toString() {
		return "Schedule [startingHour=" + startingHour + ", endingHour=" + endingHour + "]";
	}
	
	
}
