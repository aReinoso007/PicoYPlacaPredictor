package com.stackbuilders.service;

import java.util.ArrayList;
import java.util.List;

import com.stackbuilders.dao.DAOFactory;
import com.stackbuilders.dao.PicoPlacaDAO;
import com.stackbuilders.dao.QueryDAO;
import com.stackbuilders.entity.PicoPlaca;
import com.stackbuilders.entity.Query;
import com.stackbuilders.entity.Schedule;

public class QueryService implements QueryDAO{
	
	PicoPlacaDAO picoDAO = DAOFactory.getFactory().getPicoPlacaDAO();
	

	@Override
	public String checkPicoYPlaca(Query query) {
		String result = "The vehicle with the following plates: "
						+query.getPlateNumber().toUpperCase()+
						" cannot be driven on the following date: "
						+query.getDateHour();
		
		List<PicoPlaca> scheduledRules = picoDAO.generatePicoPlacaRules();
		
		String dayOfQuery = query.getDateHour().getDayOfWeek().toString();
		
		for(int i=0; i < scheduledRules.size(); i++) {
			if(dayOfQuery == scheduledRules.get(i).getDay().getDayName()) {
				
				
				if(scheduledRules.get(i).getLastDigits().toString().contains(getLastDigit(query.getPlateNumber()))) {
					
					List<Schedule> schedules = new ArrayList<Schedule>();
					
					schedules.add(scheduledRules.get(i).getMorningSchedule());
					schedules.add(scheduledRules.get(i).getNoonSchedule());
					
					String userHour = query.getDateHour().getHour()+"."+query.getDateHour().getMinute();
					
					if(checkIfHourIsWithinRange(schedules, userHour)) {
						
						result = 	"The vehicle with the following plates: "
									+query.getPlateNumber().toUpperCase()+
									" can be driven on the following date: "
									+query.getDateHour();
					}
				}
			}
		}
		return result;
		
	}
	
	@Override
	public String getLastDigit(String plateNumber) {
		if(validatePlateNumber(plateNumber)) {
			return plateNumber.substring(6,7);
		}else {
			return null;
		}
	}
	
	@Override
	public Boolean validatePlateNumber(String plateNumber) {
		
		return (!isNumeric(plateNumber.substring(0, 3)) && plateNumber.length() < 8 ? true: false);
	}
	
	@Override
	public Boolean isNumeric(String subStr) {
		if(subStr == null) 	return false;
		try {
			Double.parseDouble(subStr);
		}catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	@Override
	public Boolean checkIfHourIsWithinRange(List<Schedule> schedules, String hourInput){
		Boolean status = false;
		Double userHour = Double.parseDouble(hourInput);
		for(int i=0; i< schedules.size(); i++) {
			Double startingHour = Double.parseDouble(schedules.get(i).getStartingHour().replace(":", "."));
			Double endingHour = Double.parseDouble(schedules.get(i).getEndingHour().replace(":", "."));
			System.out.println("s: "+startingHour+" end: "+endingHour+" input: "+userHour);
			if( userHour >= startingHour && userHour <= endingHour) {
				status = true;
			}
		}
		return status;
	}

}
