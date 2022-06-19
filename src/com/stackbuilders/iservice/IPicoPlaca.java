package com.stackbuilders.iservice;

import java.time.LocalDateTime;
import java.util.List;

import com.stackbuilders.entity.PicoPlaca;
import com.stackbuilders.entity.Schedule;

public interface IPicoPlaca {
	
	String verifyPicoPlaca(PicoPlaca picoPlaca, Schedule schedule, List<Schedule> rules);
	
	List<LocalDateTime> generateNextAvailableDates(PicoPlaca picoPlaca);
	
}
