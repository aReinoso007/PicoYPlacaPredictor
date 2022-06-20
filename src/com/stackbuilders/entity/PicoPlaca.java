package com.stackbuilders.entity;

import java.util.Arrays;

import com.stackbuilders.utils.DayEnums;

public class PicoPlaca {
	
	private DayEnums day;
	private Schedule morningSchedule;
	private Schedule noonSchedule;
	private String lastDigits;
	
	public PicoPlaca(DayEnums day, Schedule morningSchedule, Schedule noonSchedule, String lastDigits) {
		super();
		this.day = day;
		this.morningSchedule = morningSchedule;
		this.noonSchedule = noonSchedule;
		this.lastDigits = lastDigits;
	}


	public DayEnums getDay() {
		return day;
	}

	public void setDay(DayEnums day) {
		this.day = day;
	}

	public Schedule getMorningSchedule() {
		return morningSchedule;
	}

	public void setMorningSchedule(Schedule morningSchedule) {
		this.morningSchedule = morningSchedule;
	}

	public Schedule getNoonSchedule() {
		return noonSchedule;
	}

	public void setNoonSchedule(Schedule noonSchedule) {
		this.noonSchedule = noonSchedule;
	}

	public String getLastDigits() {
		return lastDigits;
	}

	public void setLastDigits(String lastDigits) {
		this.lastDigits = lastDigits;
	}


	@Override
	public String toString() {
		return "PicoPlaca [day=" + day + ", morningSchedule=" + morningSchedule + ", noonSchedule=" + noonSchedule
				+ ", lastDigits=" + lastDigits+ "]";
	}
	
}
