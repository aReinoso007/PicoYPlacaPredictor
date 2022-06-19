package com.stackbuilders.service;

import java.util.Calendar;

import com.stackbuilders.dao.ScheduleDAO;
import com.stackbuilders.entity.Schedule;

public class ScheduleService implements ScheduleDAO{

	@Override
	public Schedule generateMorningHourRange() {
		
		Calendar startHour = Calendar.getInstance();
		startHour.set(Calendar.HOUR_OF_DAY, 7);
		startHour.set(Calendar.MINUTE, 0);
		startHour.set(Calendar.SECOND, 0);
		
		Calendar endHour = Calendar.getInstance();
		startHour.set(Calendar.HOUR_OF_DAY, 9);
		startHour.set(Calendar.MINUTE, 30);
		startHour.set(Calendar.SECOND, 0);
		
		return new Schedule(startHour, endHour);
	}

	@Override
	public Schedule generateNoonHourRange() {
		Calendar startHour = Calendar.getInstance();
		startHour.set(Calendar.HOUR_OF_DAY, 16);
		startHour.set(Calendar.MINUTE, 0);
		startHour.set(Calendar.SECOND, 0);
		
		Calendar endHour = Calendar.getInstance();
		startHour.set(Calendar.HOUR_OF_DAY, 19);
		startHour.set(Calendar.MINUTE, 30);
		startHour.set(Calendar.SECOND, 0);
		
		return new Schedule(startHour, endHour);
	}

}
