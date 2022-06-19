package com.stackbuilders.entity;

public class Schedule {
	
	private int id;
	private String day;
	private String startHour;
	private String endHour;
	
	public Schedule(int id, String day, String startHour, String endHour) {
		super();
		this.id = id;
		this.day = day;
		this.startHour = startHour;
		this.endHour = endHour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getStartHour() {
		return startHour;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public String getEndHour() {
		return endHour;
	}

	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}
	
	
	
}
