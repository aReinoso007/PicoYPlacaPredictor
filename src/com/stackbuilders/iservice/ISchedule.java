package com.stackbuilders.iservice;

import com.stackbuilders.entity.PicoPlaca;
import com.stackbuilders.entity.Schedule;

public interface ISchedule {
	
	Boolean checkScheduleFormat(String day, String start, String[] endNumbers);
	
	
	
}
