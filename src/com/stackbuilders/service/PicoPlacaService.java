package com.stackbuilders.service;

import java.time.LocalDateTime;
import java.util.List;

import com.stackbuilders.entity.PicoPlaca;
import com.stackbuilders.entity.Schedule;
import com.stackbuilders.iservice.IPicoPlaca;

public class PicoPlacaService implements IPicoPlaca{


	@Override
	public String verifyPicoPlaca(PicoPlaca picoPlaca, Schedule schedule, List<Schedule> rules) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocalDateTime> generateNextAvailableDates(PicoPlaca picoPlaca) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
