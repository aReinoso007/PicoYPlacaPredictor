package com.stackbuilders.entity;

import java.util.Calendar;

public class Schedule {
	
	private int id;
	private Calendar startHour;
	private Calendar endHour;
	
	public Schedule() {
		super();
	}

	public Schedule(int id, Calendar startHour, Calendar endHour) {
		super();
		this.id = id;
		this.startHour = startHour;
		this.endHour = endHour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
