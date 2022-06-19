package com.stackbuilders.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.stackbuilders.entity.PicoPlaca;
import com.stackbuilders.entity.Schedule;
import com.stackbuilders.iservice.IPicoPlaca;
import com.stackbuilders.iservice.ISchedule;
import com.stackbuilders.utils.DayEnums;

public class PicoPlacaService implements IPicoPlaca{
	
	private final ISchedule scheduleService;
	
	public PicoPlacaService(ISchedule scheduleService) {
		this.scheduleService = scheduleService;
	}

	@Override
	public List<PicoPlaca> generatePicoPlacaRules(Schedule morningSchedule, Schedule noonSchedule) {
		List<PicoPlaca> scheduledRules = new ArrayList<PicoPlaca>();
		
		scheduledRules.add(new PicoPlaca(DayEnums.MON, scheduleService.generateMorningHourRange(), scheduleService.generateNoonHourRange(), new String[]{"1","2"}));
		scheduledRules.add(new PicoPlaca(DayEnums.TUE, scheduleService.generateMorningHourRange(), scheduleService.generateNoonHourRange(), new String[]{"3","4"}));
		scheduledRules.add(new PicoPlaca(DayEnums.WED, scheduleService.generateMorningHourRange(), scheduleService.generateNoonHourRange(), new String[]{"6","6"}));
		scheduledRules.add(new PicoPlaca(DayEnums.THU, scheduleService.generateMorningHourRange(), scheduleService.generateNoonHourRange(), new String[]{"7","8"}));
		scheduledRules.add(new PicoPlaca(DayEnums.FRI, scheduleService.generateMorningHourRange(), scheduleService.generateNoonHourRange(), new String[]{"9","0"}));
		
		return scheduledRules;
	}
	
}
