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
		
		scheduledRules.add(new PicoPlaca(DayEnums.MON, scheduleDAO.generateMorningHourRange(), scheduleDAO.generateNoonHourRange(), new String[]{"1","2"}));
		scheduledRules.add(new PicoPlaca(DayEnums.TUE, scheduleDAO.generateMorningHourRange(), scheduleDAO.generateNoonHourRange(), new String[]{"3","4"}));
		scheduledRules.add(new PicoPlaca(DayEnums.WED, scheduleDAO.generateMorningHourRange(), scheduleDAO.generateNoonHourRange(), new String[]{"6","6"}));
		scheduledRules.add(new PicoPlaca(DayEnums.THU, scheduleDAO.generateMorningHourRange(), scheduleDAO.generateNoonHourRange(), new String[]{"7","8"}));
		scheduledRules.add(new PicoPlaca(DayEnums.FRI, scheduleDAO.generateMorningHourRange(), scheduleDAO.generateNoonHourRange(), new String[]{"9","0"}));
		
		return scheduledRules;
	}	
}
