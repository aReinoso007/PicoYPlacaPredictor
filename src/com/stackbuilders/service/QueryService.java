package com.stackbuilders.service;

import java.util.List;

import com.stackbuilders.dao.DAOFactory;
import com.stackbuilders.dao.PicoPlacaDAO;
import com.stackbuilders.dao.QueryDAO;
import com.stackbuilders.entity.PicoPlaca;
import com.stackbuilders.entity.Query;

public class QueryService implements QueryDAO{
	
	PicoPlacaDAO picoDAO = DAOFactory.getFactory().getPicoPlacaDAO();
	

	@Override
	public String checkPicoYPlaca(Query query) {
		String result = "The vehicle with the following plates: "+query.getPlateNumber()+
				" cannot be driven on the following date: "+query.getDateHour();
		List<PicoPlaca> scheduledRules = picoDAO.generatePicoPlacaRules();
		String dayOfQuery = query.getDateHour().getDayOfWeek().toString();
		for(int i=0; i < scheduledRules.size(); i++) {
			if(dayOfQuery == scheduledRules.get(i).getDay().getDayName()) {
				System.out.println(getLastDigit(query.getPlateNumber()));
				if(scheduledRules.get(i).getLastDigits().toString().contains(getLastDigit(query.getPlateNumber()))) {
					System.out.println("Hay match: "+query.getDateHour().getDayOfWeek()+" = "+scheduledRules.get(i).getDay().toString());
					result = "The vehicle with the following plates: "+query.getPlateNumber()+
							" can be driven on the following date: "+query.getDateHour();
				}
			}
		}
		return result;
		
	}
	
	
	public String getLastDigit(String plateNumber) {
		if(validatePlateNumber(plateNumber)) {
			return plateNumber.substring(6,7);
		}else {
			return null;
		}
	}


	public Boolean validatePlateNumber(String plateNumber) {
		
		return (!isNumeric(plateNumber.substring(0, 3)) && plateNumber.length() < 8 ? true: false);
	}
	
	
	private boolean isNumeric(String subStr) {
		if(subStr == null) {
			return false;
		}
		try {
			Double.parseDouble(subStr);
		}catch (NumberFormatException e) {
			return false;
		}
		return true;
	}



	

}
