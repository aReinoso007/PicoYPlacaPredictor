package com.stackbuilders.entity;

import java.util.Calendar;

public class Schedule {
	
	private Calendar startHour;
	private Calendar endHour;
	
	public Schedule() {
		super();
	}

	public Schedule(Calendar startHour, Calendar endHour) {
		super();
		this.startHour = startHour;
		this.endHour = endHour;
	}

	public Calendar getStartHour() {
		return startHour;
	}

	public void setStartHour(Calendar startHour) {
		this.startHour = startHour;
	}

	public Calendar getEndHour() {
		return endHour;
	}

	public void setEndHour(Calendar endHour) {
		this.endHour = endHour;
	}
	
}
