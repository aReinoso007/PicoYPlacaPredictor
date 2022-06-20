package com.stackbuilders.service;



import com.stackbuilders.dao.ScheduleDAO;
import com.stackbuilders.entity.Schedule;

public class ScheduleService implements ScheduleDAO{

	@Override
	public Schedule generateMorningHourRange() {		
		return new Schedule("07:00", "09:30");
	}

	@Override
	public Schedule generateNoonHourRange() {
		return new Schedule("16:00", "19:30");
	}
	
}
