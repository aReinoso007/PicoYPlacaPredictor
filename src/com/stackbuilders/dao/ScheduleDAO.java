package com.stackbuilders.dao;

import com.stackbuilders.entity.Schedule;

public interface ScheduleDAO extends GenericDAO<ScheduleDAO, Integer>{
	
	Schedule generateMorningHourRange();
	Schedule generateNoonHourRange();
	
}
