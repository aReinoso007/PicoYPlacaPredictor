package com.stackbuilders.iservice;

import java.util.List;

import com.stackbuilders.entity.PicoPlaca;
import com.stackbuilders.entity.Schedule;

public interface IPicoPlaca {
	
	String processQuery(PicoPlaca query, Schedule schedule, List<Schedule> rules);

}
