package com.stackbuilders.iservice;

import java.util.Calendar;

import com.stackbuilders.entity.PicoPlaca;
import com.stackbuilders.entity.Schedule;
import com.stackbuilders.utils.DayEnums;

public interface ISchedule {
	
	Calendar generateMorningHourRange();
	Calendar generateNoonHourRange();
	
}
