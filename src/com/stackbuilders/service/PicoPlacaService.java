package com.stackbuilders.service;

import java.util.ArrayList;
import java.util.List;

import com.stackbuilders.dao.DAOFactory;
import com.stackbuilders.dao.PicoPlacaDAO;
import com.stackbuilders.dao.ScheduleDAO;
import com.stackbuilders.entity.PicoPlaca;
import com.stackbuilders.utils.DayEnums;

public class PicoPlacaService implements PicoPlacaDAO{
	
	ScheduleDAO scheduleDAO = DAOFactory.getFactory().getScheduleDAO();
	

	@Override
	public List<PicoPlaca> generatePicoPlacaRules() {
		List<PicoPlaca> scheduledRules = new ArrayList<PicoPlaca>();
		
		scheduledRules.add(new PicoPlaca(DayEnums.MON, scheduleDAO.generateMorningHourRange(), scheduleDAO.generateNoonHourRange(), "12"));
		scheduledRules.add(new PicoPlaca(DayEnums.TUE, scheduleDAO.generateMorningHourRange(), scheduleDAO.generateNoonHourRange(), "34"));
		scheduledRules.add(new PicoPlaca(DayEnums.WED, scheduleDAO.generateMorningHourRange(), scheduleDAO.generateNoonHourRange(), "56"));
		scheduledRules.add(new PicoPlaca(DayEnums.THU, scheduleDAO.generateMorningHourRange(), scheduleDAO.generateNoonHourRange(), "78"));
		scheduledRules.add(new PicoPlaca(DayEnums.FRI, scheduleDAO.generateMorningHourRange(), scheduleDAO.generateNoonHourRange(), "90"));
		
		return scheduledRules;
	}	
	
}
